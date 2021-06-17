package com.xeniac.harrypotterstorybooks;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.card.MaterialCardView;
import com.xeniac.harrypotterstorybooks.adapters.BooksAdapter;
import com.xeniac.harrypotterstorybooks.adapters.ChaptersAdapter;
import com.xeniac.harrypotterstorybooks.dataProviders.BooksDataProvider;
import com.xeniac.harrypotterstorybooks.database.booksDataBase.BooksDataSource;
import com.xeniac.harrypotterstorybooks.database.chaptersDataBase.ChaptersDataSource;
import com.xeniac.harrypotterstorybooks.models.DataItemChapters;

import java.io.IOException;
import java.io.InputStream;

public class BooksActivity extends AppCompatActivity {

    private BooksDataSource booksDataSource;
    private ChaptersDataSource chaptersDataSource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);
        Toolbar toolbar = findViewById(R.id.toolbar_books);
        setSupportActionBar(toolbar);
        booksInit();
    }

    @Override
    protected void onResume() {
        super.onResume();
        continueReading();
    }

    @Override
    protected void onPause() {
        super.onPause();
        booksDataSource.close();
        chaptersDataSource.close();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_books, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.menu_books_favorites) {
            startActivity(new Intent(this, FavoritesActivity.class));
        }

        return super.onOptionsItemSelected(item);
    }

    private void booksInit() {
        LocaleModifier localeModifier = new LocaleModifier(this);
        localeModifier.setLocale();

        booksDataSource = new BooksDataSource(this);
        chaptersDataSource = new ChaptersDataSource(this);
        seedBooksData();
        booksRecyclerView();
        continueReading();
    }

    private void seedBooksData() {
        SharedPreferences seedingPrefs = getSharedPreferences(Constants.PREFERENCE_SEEDING, MODE_PRIVATE);
        boolean booksSeeded = seedingPrefs.getBoolean(Constants.PREFERENCE_BOOKS_SEEDED, false);

        if (!booksSeeded) {
            booksDataSource.open();
            booksDataSource.seedDataBase(BooksDataProvider.dataItemBooksList);
            seedingPrefs.edit().putBoolean(Constants.PREFERENCE_BOOKS_SEEDED, true).apply();
        }
    }

    private void booksRecyclerView() {
        booksDataSource.open();
        BooksAdapter booksAdapter = new BooksAdapter(this, booksDataSource.getAllItems());
        RecyclerView booksRV = findViewById(R.id.rv_books);
        booksRV.setHasFixedSize(true);
        booksRV.setAdapter(booksAdapter);
    }

    private void continueReading() {
        SharedPreferences readingPrefs = getSharedPreferences(Constants.PREFERENCE_READING, MODE_PRIVATE);
        int readingChapterId = readingPrefs.getInt(Constants.PREFERENCE_READING_KEY, 0);
        LinearLayout continueLL = findViewById(R.id.ll_books_continue);

        if (readingChapterId == 0) {
            continueLL.setVisibility(View.GONE);
        } else {
            booksDataSource.open();
            chaptersDataSource.open();
            DataItemChapters currentChapter = chaptersDataSource.getReadingItem(readingChapterId);

            MaterialCardView continueCV = findViewById(R.id.cv_books_continue);
            ImageView continueIV = findViewById(R.id.iv_books_continue);
            RelativeLayout continueRL = findViewById(R.id.rl_books_continue);
            TextView continueChapterTitleTV = findViewById(R.id.tv_books_continue_chapter_title);
            TextView continueBookTitleTV = findViewById(R.id.tv_books_continue_book_title);
            ProgressBar continuePB = findViewById(R.id.pb_books_continue);

            continueCV.setClipToOutline(false);
            continueLL.setVisibility(View.VISIBLE);
            continueChapterTitleTV.setText(currentChapter.getTitle());
            continueBookTitleTV.setText(booksDataSource.getBookTitle(currentChapter.getBookId()));
            continuePB.setProgress((int) ((float) currentChapter.getReadScroll() * 100 / currentChapter.getTotalScroll()));

            try {
                String imageFile = booksDataSource.getBookCover(currentChapter.getBookId());
                InputStream inputStream = getAssets().open(imageFile);
                Drawable drawable = Drawable.createFromStream(inputStream, null);
                continueIV.setImageDrawable(drawable);
                continueIV.setClipToOutline(true);
            } catch (IOException e) {
                e.printStackTrace();
            }

            continueRL.setOnClickListener(v -> {
                Intent intent = new Intent(this, PagesActivity.class);
                intent.putExtra(ChaptersAdapter.ITEM_KEY, currentChapter.getId());
                startActivity(intent);
            });
        }
    }
}
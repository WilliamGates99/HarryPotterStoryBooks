package com.xeniac.harrypotterstory;

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
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.xeniac.harrypotterstory.adapters.BooksAdapter;
import com.xeniac.harrypotterstory.adapters.ChaptersAdapter;
import com.xeniac.harrypotterstory.dataProviders.BooksDataProvider;
import com.xeniac.harrypotterstory.database.booksDataBase.BooksDataSource;
import com.xeniac.harrypotterstory.database.chaptersDataBase.ChaptersDataSource;
import com.xeniac.harrypotterstory.models.DataItemChapters;

import java.io.IOException;
import java.io.InputStream;

public class BooksActivity extends AppCompatActivity {

    public static final String READING_CHECK = "reading_check";
    public static final String READING_CHECK_KEY = "reading_check_key";

    private BooksDataSource booksDataSource;
    private ChaptersDataSource chaptersDataSource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);
        Toolbar toolbar = findViewById(R.id.toolbar_books);
        setSupportActionBar(toolbar);
        booksInitializer();
    }

    @Override
    protected void onResume() {
        super.onResume();
        booksDataSource.open();
        chaptersDataSource.open();
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

    private void booksInitializer() {
        seedBooksData();
        booksRecyclerView();
        continueReading();
    }

    private void booksRecyclerView() {
        BooksAdapter booksAdapter = new BooksAdapter(this, booksDataSource.getAllItems());
        RecyclerView booksRV = findViewById(R.id.rv_books);
        booksRV.setHasFixedSize(true);
        booksRV.setAdapter(booksAdapter);
    }

    private void continueReading() {
        chaptersDataSource = new ChaptersDataSource(this);
        SharedPreferences preferences = getSharedPreferences(READING_CHECK, MODE_PRIVATE);
        int readingChapterId = preferences.getInt(READING_CHECK_KEY, 0);
        FrameLayout continueFL = findViewById(R.id.fl_books_continue);

        if (readingChapterId == 0) {
            continueFL.setVisibility(View.GONE);
        } else {
            chaptersDataSource.open();
            DataItemChapters item = chaptersDataSource.getReadingItem(readingChapterId);

            ImageView continueIV = findViewById(R.id.iv_books_continue);
            LinearLayout continueLL = findViewById(R.id.ll_books_continue);
            TextView continueChapterTV = findViewById(R.id.tv_books_continue_chapter_title);
            TextView continueBookTV = findViewById(R.id.tv_books_continue_book_title);
            ProgressBar continuePB = findViewById(R.id.pb_books_continue);

            continueFL.setVisibility(View.VISIBLE);
            continueChapterTV.setText(item.getTitle());
            continueBookTV.setText(booksDataSource.getBookTitle(item.getBookId()));
            continuePB.setProgress((int) ((float) item.getReadScroll() * 100 / item.getTotalScroll()));

            try {
                String imageFile = booksDataSource.getBookCover(item.getBookId());
                InputStream inputStream = getAssets().open(imageFile);
                Drawable drawable = Drawable.createFromStream(inputStream, null);
                continueIV.setImageDrawable(drawable);
                continueIV.setClipToOutline(true);
            } catch (IOException e) {
                e.printStackTrace();
            }

            continueLL.setOnClickListener(v -> {
                Intent intent = new Intent(BooksActivity.this, PagesActivity.class);
                intent.putExtra(ChaptersAdapter.ITEM_KEY, item);
                startActivity(intent);
            });
        }
    }

    private void seedBooksData() {
        booksDataSource = new BooksDataSource(this);
        booksDataSource.open();
        booksDataSource.seedDataBase(BooksDataProvider.dataItemBooksList);
    }
}
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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.xeniac.harrypotterstory.adapters.ChaptersAdapter;
import com.xeniac.harrypotterstory.dataProviders.BooksDataProvider;
import com.xeniac.harrypotterstory.dataProviders.ChaptersDataProvider;
import com.xeniac.harrypotterstory.database.booksDataBase.BooksDataSource;
import com.xeniac.harrypotterstory.database.chaptersDataBase.ChaptersDataSource;
import com.xeniac.harrypotterstory.models.DataItemBooks;
import com.xeniac.harrypotterstory.models.DataItemChapters;

import java.io.IOException;
import java.io.InputStream;

public class ChaptersActivity extends AppCompatActivity {

    public static final String READING_CHECK = "reading_check";
    public static final String READING_CHECK_KEY = "reading_check_key";

    private BooksDataSource booksDataSource;
    private ChaptersDataSource chaptersDataSource;
    private DataItemBooks book;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapters);
        Toolbar toolbar = findViewById(R.id.toolbar_chapters);
        setSupportActionBar(toolbar);
        chaptersInitializer();
    }

    @Override
    protected void onResume() {
        super.onResume();
        booksDataSource.open();
        chaptersDataSource.open();
        continueReading();
        chaptersRecyclerView();
    }

    @Override
    protected void onPause() {
        super.onPause();
        booksDataSource.close();
        chaptersDataSource.close();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_chapters, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == R.id.menu_chapters_favorites) {
            startActivity(new Intent(this, FavoritesActivity.class));
        }

        return super.onOptionsItemSelected(item);
    }

    private void chaptersInitializer() {
        seedBooksData();
        seedChaptersData();
        book = booksDataSource.getReadingItem(1);

        ImageView coverIV = findViewById(R.id.iv_chapters_cover);

        try {
            String imageFile = book.getCover();
            InputStream inputStream = getAssets().open(imageFile);
            Drawable drawable = Drawable.createFromStream(inputStream, null);
            coverIV.setImageDrawable(drawable);
            coverIV.setClipToOutline(true);
        } catch (IOException e) {
            e.printStackTrace();
        }

        chaptersRecyclerView();
        continueReading();
    }

    private void seedBooksData() {
        booksDataSource = new BooksDataSource(this);
        booksDataSource.open();
        booksDataSource.seedDataBase(BooksDataProvider.dataItemBooksList);
    }

    private void seedChaptersData() {
        chaptersDataSource = new ChaptersDataSource(this);
        chaptersDataSource.open();
        chaptersDataSource.seedDataBase(ChaptersDataProvider.dataItemChaptersList);
    }

    private void chaptersRecyclerView() {
        ChaptersAdapter chaptersAdapter = new ChaptersAdapter(this,
                chaptersDataSource.getAllItems(book.getId(), false));
        RecyclerView chaptersRV = findViewById(R.id.rv_chapters);
        chaptersRV.setAdapter(chaptersAdapter);
    }

    private void continueReading() {
        SharedPreferences preferences = getSharedPreferences(READING_CHECK, MODE_PRIVATE);
        int readingChapterId = preferences.getInt(READING_CHECK_KEY, 0);
        LinearLayout continueLL = findViewById(R.id.ll_chapters_continue);

        if (readingChapterId == 0) {
            continueLL.setVisibility(View.GONE);
        } else {
            chaptersDataSource.open();
            DataItemChapters item = chaptersDataSource.getReadingItem(readingChapterId);

            LinearLayout continueCardLL = findViewById(R.id.ll_chapters_continue_card);
            TextView continueChapterTV = findViewById(R.id.tv_chapters_continue_chapter_title);
            TextView continueBookTV = findViewById(R.id.tv_chapters_continue_book_title);
            ProgressBar continuePB = findViewById(R.id.pb_chapters_continue);

            continueLL.setVisibility(View.VISIBLE);
            continueChapterTV.setText(item.getTitle());
            continueBookTV.setText(booksDataSource.getBookTitle(item.getBookId()));
            continuePB.setProgress((int) ((float) item.getReadScroll() * 100 / item.getTotalScroll()));

            continueCardLL.setOnClickListener(v -> {
                Intent intent = new Intent(this, PagesActivity.class);
                intent.putExtra(ChaptersAdapter.ITEM_KEY, item.getId());
                startActivity(intent);
            });
        }
    }
}
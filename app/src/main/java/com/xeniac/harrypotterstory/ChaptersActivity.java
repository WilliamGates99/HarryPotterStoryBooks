package com.xeniac.harrypotterstory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

import com.xeniac.harrypotterstory.adapters.BooksAdapter;
import com.xeniac.harrypotterstory.adapters.ChaptersAdapter;
import com.xeniac.harrypotterstory.dataProviders.ChaptersDataProvider;
import com.xeniac.harrypotterstory.database.booksDataBase.BooksDataSource;
import com.xeniac.harrypotterstory.database.chaptersDataBase.ChaptersDataSource;
import com.xeniac.harrypotterstory.models.DataItemBooks;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

public class ChaptersActivity extends AppCompatActivity {

    private BooksDataSource booksDataSource;
    private ChaptersDataSource chaptersDataSource;
    private DataItemBooks currentBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapters);
        Toolbar toolbar = findViewById(R.id.toolbar_chapters);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled((true));
        chaptersInit();
    }

    @Override
    protected void onResume() {
        super.onResume();
        chaptersRecyclerView();
    }

    @Override
    protected void onPause() {
        super.onPause();
        booksDataSource.close();
        chaptersDataSource.close();
    }

    @Override
    public boolean onSupportNavigateUp() {
        super.onBackPressed();
        return false;
    }

    private void chaptersInit() {
        LocaleModifier localeModifier = new LocaleModifier(this);
        localeModifier.setLocale();

        booksDataSource = new BooksDataSource(this);
        chaptersDataSource = new ChaptersDataSource(this);

        booksDataSource.open();
        int currentBookId = getIntent().getExtras().getInt(BooksAdapter.ITEM_KEY);
        currentBook = booksDataSource.getReadingItem(currentBookId);

        seedChaptersData();
        setTitleAndCover();
        chaptersRecyclerView();
    }

    private void seedChaptersData() {
        SharedPreferences seedingPrefs = getSharedPreferences(Constants.PREFERENCE_SEEDING, MODE_PRIVATE);
        boolean chaptersSeeded = seedingPrefs.getBoolean(Constants.PREFERENCE_CHAPTERS_SEEDED, false);

        if (!chaptersSeeded) {
            chaptersDataSource.open();
            chaptersDataSource.seedDataBase(ChaptersDataProvider.dataItemChaptersList);
            seedingPrefs.edit().putBoolean(Constants.PREFERENCE_CHAPTERS_SEEDED, true).apply();
        }
    }

    private void setTitleAndCover() {
        setTitle(currentBook.getTitle());
        ImageView coverIV = findViewById(R.id.iv_chapters_cover);

        try {
            String imageFile = currentBook.getCover();
            InputStream inputStream = getAssets().open(imageFile);
            Drawable drawable = Drawable.createFromStream(inputStream, null);
            coverIV.setImageDrawable(drawable);
            coverIV.setClipToOutline(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void chaptersRecyclerView() {
        chaptersDataSource.open();
        ChaptersAdapter chaptersAdapter = new ChaptersAdapter(this,
                chaptersDataSource.getAllItems(currentBook.getId(), false));
        RecyclerView chaptersRV = findViewById(R.id.rv_chapters);
        chaptersRV.setAdapter(chaptersAdapter);
    }
}
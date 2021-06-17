package com.xeniac.harrypotterstory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

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
        continueOnClick();
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

    private void continueOnClick() {
        LinearLayout continueLL = findViewById(R.id.ll_chapters_continue);
        continueLL.setOnClickListener(v ->
                continueBook());
    }

    private void continueBook() {
        String urlString = null;
        switch (currentBook.getId()) {
            case 1:
                urlString = "https://play.google.com/store/books/details/J_K_Rowling_Harry_Potter_and_the_Sorcerer_s_Stone?id=wrOQLV6xB-wC";
                break;
            case 2:
                urlString = "https://play.google.com/store/books/details/J_K_Rowling_Harry_Potter_and_the_Chamber_of_Secret?id=5iTebBW-w7QC";
                break;
            case 3:
                urlString = "https://play.google.com/store/books/details/J_K_Rowling_Harry_Potter_and_the_Prisoner_of_Azkab?id=Sm5AKLXKxHgC";
                break;
            case 4:
                urlString = "https://play.google.com/store/books/details/J_K_Rowling_Harry_Potter_and_the_Goblet_of_Fire?id=etukl7GfrxQC";
                break;
            case 5:
                urlString = "https://play.google.com/store/books/details/J_K_Rowling_Harry_Potter_and_the_Order_of_the_Phoe?id=zpvysRGsBlwC";
                break;
            case 6:
                urlString = "https://play.google.com/store/books/details/J_K_Rowling_Harry_Potter_and_the_Half_Blood_Prince?id=R7YsowJI9-IC";
                break;
            case 7:
                urlString = "https://play.google.com/store/books/details/J_K_Rowling_Harry_Potter_and_the_Deathly_Hallows?id=_oaAHiFOZmgC";
                break;
        }

        if (urlString != null) {
            Uri storeURL = Uri.parse(urlString);
            Intent openStoreIntent = new Intent(Intent.ACTION_VIEW, storeURL);
            startActivity(Intent.createChooser(openStoreIntent, getString(R.string.string_chapters_continue_chooser)));
        }
    }
}
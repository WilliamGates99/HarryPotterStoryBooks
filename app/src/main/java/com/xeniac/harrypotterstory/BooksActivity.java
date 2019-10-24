package com.xeniac.harrypotterstory;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.xeniac.harrypotterstory.adapters.BooksAdapter;
import com.xeniac.harrypotterstory.dataProviders.BooksDataProvider;
import com.xeniac.harrypotterstory.dataProviders.ChaptersDataProvider;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook1.PagesDataProviderBook1_1;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook1.PagesDataProviderBook1_10;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook1.PagesDataProviderBook1_11;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook1.PagesDataProviderBook1_12;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook1.PagesDataProviderBook1_13;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook1.PagesDataProviderBook1_14;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook1.PagesDataProviderBook1_15;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook1.PagesDataProviderBook1_16;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook1.PagesDataProviderBook1_17;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook1.PagesDataProviderBook1_2;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook1.PagesDataProviderBook1_3;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook1.PagesDataProviderBook1_4;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook1.PagesDataProviderBook1_5;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook1.PagesDataProviderBook1_6;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook1.PagesDataProviderBook1_7;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook1.PagesDataProviderBook1_8;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook1.PagesDataProviderBook1_9;
import com.xeniac.harrypotterstory.database.booksDataBase.BooksDataSource;
import com.xeniac.harrypotterstory.database.chaptersDataBase.ChaptersDataSource;
import com.xeniac.harrypotterstory.database.pagesDataBase.PagesDataSource;

public class BooksActivity extends AppCompatActivity {

    private BooksDataSource booksDataSource;
    private ChaptersDataSource chaptersDataSource;
    private PagesDataSource pagesDataSource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);
        Toolbar toolbar = findViewById(R.id.toolbar_books);
        setSupportActionBar(toolbar);
        booksInitializer();
        booksRecyclerView();
    }

    @Override
    protected void onResume() {
        super.onResume();
        booksDataSource.open();
        chaptersDataSource.open();
        pagesDataSource.open();
    }

    @Override
    protected void onPause() {
        super.onPause();
        booksDataSource.close();
        chaptersDataSource.close();
        pagesDataSource.close();
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
        seedChaptersData();
        seedPagesData();

        ImageView continueIV = findViewById(R.id.iv_books_continue);
        continueIV.setClipToOutline(true);
    }

    private void booksRecyclerView() {
        BooksAdapter booksAdapter = new BooksAdapter(this, booksDataSource.getAllItems());
        RecyclerView booksRV = findViewById(R.id.rv_books);
        booksRV.setHasFixedSize(true);
        booksRV.setAdapter(booksAdapter);
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

    private void seedPagesData() {
        pagesDataSource = new PagesDataSource(this);
        pagesDataSource.open();

        //TODO Add Other Data Providers
        pagesDataSource.seedDataBase(PagesDataProviderBook1_1.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook1_2.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook1_3.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook1_4.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook1_5.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook1_6.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook1_7.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook1_8.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook1_9.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook1_10.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook1_11.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook1_12.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook1_13.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook1_14.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook1_15.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook1_16.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook1_17.dataItemPagesList);
    }
}
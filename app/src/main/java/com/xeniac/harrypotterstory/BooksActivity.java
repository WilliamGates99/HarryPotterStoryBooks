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
import com.xeniac.harrypotterstory.models.DataItemBooks;

import java.util.List;

public class BooksActivity extends AppCompatActivity {

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
        ImageView continueIV = findViewById(R.id.iv_books_continue);
        continueIV.setClipToOutline(true);
    }

    private void booksRecyclerView() {
        List<DataItemBooks> dataItemBooksList = BooksDataProvider.dataItemBooksList;
        BooksAdapter booksAdapter = new BooksAdapter(this, dataItemBooksList);
        RecyclerView booksRV = findViewById(R.id.rv_books);
        booksRV.setAdapter(booksAdapter);
    }
}

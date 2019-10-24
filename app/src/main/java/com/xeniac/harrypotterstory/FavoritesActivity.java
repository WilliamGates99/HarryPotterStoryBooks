package com.xeniac.harrypotterstory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.xeniac.harrypotterstory.adapters.FavoritesAdapter;
import com.xeniac.harrypotterstory.database.chaptersDataBase.ChaptersDataSource;

import java.util.Objects;

public class FavoritesActivity extends AppCompatActivity {

    private ChaptersDataSource chaptersDataSource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);
        Toolbar toolbar = findViewById(R.id.toolbar_favorites);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled((true));
        favoritesInitializer();
    }

    @Override
    protected void onResume() {
        super.onResume();
        chaptersDataSource.open();
        favoritesRecyclerView();
    }

    @Override
    protected void onPause() {
        super.onPause();
        chaptersDataSource.close();
    }

    @Override
    public boolean onSupportNavigateUp() {
        return super.onSupportNavigateUp();
    }

    @Override
    public void onBackPressed() {
        super.onSupportNavigateUp();
    }

    private void favoritesInitializer() {
        chaptersDataSource = new ChaptersDataSource(this);
        chaptersDataSource.open();

        favoritesRecyclerView();
    }

    private void favoritesRecyclerView() {
        FavoritesAdapter favoritesAdapter = new FavoritesAdapter(this,
                chaptersDataSource.getAllItems(null, true));
        RecyclerView favoritesRV = findViewById(R.id.rv_favorites);
        favoritesRV.setAdapter(favoritesAdapter);
    }
}
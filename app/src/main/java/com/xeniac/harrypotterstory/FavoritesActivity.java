package com.xeniac.harrypotterstory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.xeniac.harrypotterstory.adapters.FavoritesAdapter;
import com.xeniac.harrypotterstory.database.chaptersDataBase.ChaptersDataSource;
import com.xeniac.harrypotterstory.models.DataItemChapters;

import java.util.List;
import java.util.Objects;

public class FavoritesActivity extends AppCompatActivity {

    private ChaptersDataSource chaptersDataSource;
    private List<DataItemChapters> dataItemChaptersList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        favoritesInitializer();
    }

    @Override
    protected void onResume() {
        super.onResume();
        chaptersDataSource.open();
        favoritesCondition();
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
        favoritesCondition();
    }

    private void favoritesCondition() {
        dataItemChaptersList = chaptersDataSource.getAllItems(0, true);
        if (dataItemChaptersList.isEmpty()) {
            setContentView(R.layout.activity_favorites_empty);
            Toolbar toolbar = findViewById(R.id.toolbar_favorites);
            setSupportActionBar(toolbar);
            Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled((true));
        } else {
            setContentView(R.layout.activity_favorites);
            Toolbar toolbar = findViewById(R.id.toolbar_favorites);
            setSupportActionBar(toolbar);
            Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled((true));
            favoritesRecyclerView();
        }
    }

    private void favoritesRecyclerView() {
        dataItemChaptersList = chaptersDataSource.getAllItems(0, true);
        FavoritesAdapter favoritesAdapter = new FavoritesAdapter(this, dataItemChaptersList);
        RecyclerView favoritesRV = findViewById(R.id.rv_favorites);
        favoritesRV.setAdapter(favoritesAdapter);
    }

    public void browseOnClick(View view) {
        super.onSupportNavigateUp();
    }
}
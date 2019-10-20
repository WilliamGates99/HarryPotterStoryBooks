package com.xeniac.harrypotterstory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.xeniac.harrypotterstory.adapters.FavoritesAdapter;
import com.xeniac.harrypotterstory.database.ChaptersDataSource;
import com.xeniac.harrypotterstory.models.DataItemChapters;

import java.util.List;
import java.util.Objects;

public class FavoritesActivity extends AppCompatActivity {

    private ChaptersDataSource mDataSource;

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
        mDataSource.open();
        favoritesRecyclerView();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mDataSource.close();
    }

    private void favoritesInitializer() {
        mDataSource = new ChaptersDataSource(this);
        mDataSource.open();
        favoritesRecyclerView();
    }

    private void favoritesRecyclerView() {
        List<DataItemChapters> dataItemChaptersList =
                mDataSource.getAllItems(0, true);

        RecyclerView favoritesRV = findViewById(R.id.rv_favorites);
        FavoritesAdapter favoritesAdapter = new FavoritesAdapter(this, dataItemChaptersList);
        favoritesRV.setAdapter(favoritesAdapter);
    }
}
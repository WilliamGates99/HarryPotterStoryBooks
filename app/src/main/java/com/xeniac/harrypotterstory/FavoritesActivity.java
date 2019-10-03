package com.xeniac.harrypotterstory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.xeniac.harrypotterstory.adapters.ChaptersAdapter;
import com.xeniac.harrypotterstory.adapters.FavoritesAdapter;
import com.xeniac.harrypotterstory.dataProviders.ChaptersDataProvider1;
import com.xeniac.harrypotterstory.dataProviders.ChaptersDataProvider2;
import com.xeniac.harrypotterstory.dataProviders.ChaptersDataProvider3;
import com.xeniac.harrypotterstory.dataProviders.ChaptersDataProvider4;
import com.xeniac.harrypotterstory.dataProviders.ChaptersDataProvider5;
import com.xeniac.harrypotterstory.dataProviders.ChaptersDataProvider6;
import com.xeniac.harrypotterstory.dataProviders.ChaptersDataProvider7;
import com.xeniac.harrypotterstory.models.DataItemChapters;

import java.util.List;
import java.util.Objects;

public class FavoritesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);
        Toolbar toolbar = findViewById(R.id.toolbar_favorites);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled((true));
        favoritesRecyclerView();
    }

    private void favoritesRecyclerView() {
        List<DataItemChapters> dataItemChaptersList = ChaptersDataProvider1.dataItemChaptersList;
        dataItemChaptersList.addAll(ChaptersDataProvider2.dataItemChaptersList);
        dataItemChaptersList.addAll(ChaptersDataProvider3.dataItemChaptersList);
        dataItemChaptersList.addAll(ChaptersDataProvider4.dataItemChaptersList);
        dataItemChaptersList.addAll(ChaptersDataProvider5.dataItemChaptersList);
        dataItemChaptersList.addAll(ChaptersDataProvider6.dataItemChaptersList);
        dataItemChaptersList.addAll(ChaptersDataProvider7.dataItemChaptersList);

        FavoritesAdapter favoritesAdapter = new FavoritesAdapter(this, dataItemChaptersList);
        RecyclerView favoritesRV = findViewById(R.id.rv_favorites);
        favoritesRV.setAdapter(favoritesAdapter);
    }
}

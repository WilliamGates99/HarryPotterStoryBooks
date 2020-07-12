package com.xeniac.harrypotterstory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.xeniac.harrypotterstory.adapters.FavoritesAdapter;
import com.xeniac.harrypotterstory.database.chaptersDataBase.ChaptersDataSource;
import com.xeniac.harrypotterstory.models.DataItemChapters;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;

public class FavoritesActivity extends AppCompatActivity {

    private ChaptersDataSource chaptersDataSource;
    private List<DataItemChapters> dataItemChaptersList;

    private RecyclerView favoritesRV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);
        Toolbar toolbar = findViewById(R.id.toolbar_favorites);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled((true));
        chaptersDataSource = new ChaptersDataSource(this);
        chaptersDataSource.open();
        favoritesCondition();
    }

    @Override
    public void onResume() {
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
        super.onBackPressed();
        return false;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    private void favoritesCondition() {
        dataItemChaptersList = chaptersDataSource.getAllItems(0, true);
        favoritesRV = findViewById(R.id.rv_favorites);
        RelativeLayout favoritesEmptyRL = findViewById(R.id.rl_favorites_empty);

        if (dataItemChaptersList.isEmpty()) {
            favoritesRV.setVisibility(View.GONE);
            favoritesEmptyRL.setVisibility(View.VISIBLE);
            ImageView voldemortIV = findViewById(R.id.iv_favorites_voldemort);
            try {
                InputStream inputStream = getAssets().open("ic_favorites_voldemort.png");
                Drawable drawable = Drawable.createFromStream(inputStream, null);
                voldemortIV.setImageDrawable(drawable);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            favoritesEmptyRL.setVisibility(View.GONE);
            favoritesRV.setVisibility(View.VISIBLE);
            favoritesRecyclerView();
        }
    }

    private void favoritesRecyclerView() {
        dataItemChaptersList = chaptersDataSource.getAllItems(0, true);
        FavoritesAdapter favoritesAdapter = new FavoritesAdapter(this, dataItemChaptersList);
        favoritesRV.setAdapter(favoritesAdapter);
    }

    public void browseOnClick(View view) {
        super.onSupportNavigateUp();
    }
}
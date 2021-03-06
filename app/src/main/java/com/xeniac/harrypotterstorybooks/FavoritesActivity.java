package com.xeniac.harrypotterstorybooks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.xeniac.harrypotterstorybooks.adapters.FavoritesAdapter;
import com.xeniac.harrypotterstorybooks.database.chaptersDataBase.ChaptersDataSource;
import com.xeniac.harrypotterstorybooks.models.DataItemChapters;

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
        favoritesInit();
    }

    @Override
    public void onResume() {
        super.onResume();
        getFavoriteChapters();
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

    private void favoritesInit() {
        LocaleModifier localeModifier = new LocaleModifier(this);
        localeModifier.setLocale();

        chaptersDataSource = new ChaptersDataSource(this);
        getFavoriteChapters();
    }

    private void getFavoriteChapters() {
        chaptersDataSource.open();
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
        chaptersDataSource.open();
        FavoritesAdapter favoritesAdapter = new FavoritesAdapter(this, dataItemChaptersList);
        favoritesRV.setAdapter(favoritesAdapter);
    }

    public void browseOnClick(View view) {
        super.onBackPressed();
    }
}
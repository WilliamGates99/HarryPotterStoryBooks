package com.xeniac.harrypotterstory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

import com.xeniac.harrypotterstory.adapters.BooksAdapter;
import com.xeniac.harrypotterstory.adapters.ChaptersAdapter;
import com.xeniac.harrypotterstory.database.ChaptersDataSource;
import com.xeniac.harrypotterstory.models.DataItemBooks;
import com.xeniac.harrypotterstory.models.DataItemChapters;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;

public class ChaptersActivity extends AppCompatActivity {

    private ChaptersDataSource chaptersDataSource;
    private DataItemBooks itemBooks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapters);
        Toolbar toolbar = findViewById(R.id.toolbar_chapters);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled((true));

        itemBooks = Objects.requireNonNull(getIntent().getExtras()).
                getParcelable(BooksAdapter.ITEM_KEY);

        if (itemBooks == null) {
            throw new AssertionError("Null data item received!");
        } else {
            chaptersInitializer();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        chaptersDataSource.open();
        chaptersRecyclerView();
    }

    @Override
    protected void onPause() {
        super.onPause();
        chaptersDataSource.close();
    }

    private void chaptersInitializer() {
        chaptersDataSource = new ChaptersDataSource(this);
        chaptersDataSource.open();

        setTitle(itemBooks.getTitle());
        ImageView coverIV = findViewById(R.id.iv_chapters_cover);

        try {
            String imageFile = itemBooks.getCover();
            InputStream inputStream = getAssets().open(imageFile);
            Drawable drawable = Drawable.createFromStream(inputStream, null);
            coverIV.setImageDrawable(drawable);
            coverIV.setClipToOutline(true);
        } catch (IOException e) {
            e.printStackTrace();
        }

        chaptersRecyclerView();
    }

    private void chaptersRecyclerView() {
        List<DataItemChapters> dataItemChaptersList =
                chaptersDataSource.getAllItems(itemBooks.getTitle(), false);

        RecyclerView chaptersRV = findViewById(R.id.rv_chapters);
        chaptersRV.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        ChaptersAdapter chaptersAdapter = new ChaptersAdapter(this, dataItemChaptersList);
        chaptersRV.setAdapter(chaptersAdapter);
    }
}
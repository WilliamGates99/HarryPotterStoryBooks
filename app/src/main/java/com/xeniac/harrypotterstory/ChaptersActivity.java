package com.xeniac.harrypotterstory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.xeniac.harrypotterstory.adapters.BooksAdapter;
import com.xeniac.harrypotterstory.adapters.ChaptersAdapter;
import com.xeniac.harrypotterstory.dataProviders.ChaptersDataProvider1;
import com.xeniac.harrypotterstory.dataProviders.ChaptersDataProvider2;
import com.xeniac.harrypotterstory.dataProviders.ChaptersDataProvider3;
import com.xeniac.harrypotterstory.dataProviders.ChaptersDataProvider4;
import com.xeniac.harrypotterstory.dataProviders.ChaptersDataProvider5;
import com.xeniac.harrypotterstory.dataProviders.ChaptersDataProvider6;
import com.xeniac.harrypotterstory.dataProviders.ChaptersDataProvider7;
import com.xeniac.harrypotterstory.models.DataItemBooks;
import com.xeniac.harrypotterstory.models.DataItemChapters;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;

public class ChaptersActivity extends AppCompatActivity {

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

    private void chaptersInitializer() {
        setTitle(itemBooks.getTitle());
        ImageView coverIV = findViewById(R.id.iv_chapters_cover);
        try {
            String imageFile = itemBooks.getImage();
            InputStream inputStream = getAssets().open(imageFile);
            Drawable drawable = Drawable.createFromStream(inputStream, null);
            coverIV.setImageDrawable(drawable);
            coverIV.setClipToOutline(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        chaptersRecyclerViews();
    }

    private void chaptersRecyclerViews() {
        List<DataItemChapters> dataItemChaptersList;
        ChaptersAdapter chaptersAdapter;
        RecyclerView chaptersRV = findViewById(R.id.rv_chapters);

        switch (itemBooks.getId()) {
            case "book_1":
                dataItemChaptersList = ChaptersDataProvider1.dataItemChaptersList;
                chaptersAdapter = new ChaptersAdapter(this, dataItemChaptersList);
                chaptersRV.setAdapter(chaptersAdapter);
                break;
            case "book_2":
                dataItemChaptersList = ChaptersDataProvider2.dataItemChaptersList;
                chaptersAdapter = new ChaptersAdapter(this, dataItemChaptersList);
                chaptersRV.setAdapter(chaptersAdapter);
                break;
            case "book_3":
                dataItemChaptersList = ChaptersDataProvider3.dataItemChaptersList;
                chaptersAdapter = new ChaptersAdapter(this, dataItemChaptersList);
                chaptersRV.setAdapter(chaptersAdapter);
                break;
            case "book_4":
                dataItemChaptersList = ChaptersDataProvider4.dataItemChaptersList;
                chaptersAdapter = new ChaptersAdapter(this, dataItemChaptersList);
                chaptersRV.setAdapter(chaptersAdapter);
                break;
            case "book_5":
                dataItemChaptersList = ChaptersDataProvider5.dataItemChaptersList;
                chaptersAdapter = new ChaptersAdapter(this, dataItemChaptersList);
                chaptersRV.setAdapter(chaptersAdapter);
                break;
            case "book_6":
                dataItemChaptersList = ChaptersDataProvider6.dataItemChaptersList;
                chaptersAdapter = new ChaptersAdapter(this, dataItemChaptersList);
                chaptersRV.setAdapter(chaptersAdapter);
                break;
            case "book_7":
                dataItemChaptersList = ChaptersDataProvider7.dataItemChaptersList;
                chaptersAdapter = new ChaptersAdapter(this, dataItemChaptersList);
                chaptersRV.setAdapter(chaptersAdapter);
                break;
        }
    }
}
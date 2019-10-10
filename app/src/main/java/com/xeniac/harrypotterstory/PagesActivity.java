package com.xeniac.harrypotterstory;

import androidx.annotation.IntegerRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.xeniac.harrypotterstory.adapters.ChaptersAdapter;
import com.xeniac.harrypotterstory.adapters.PagesAdapter;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook1_1;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook1_2;
import com.xeniac.harrypotterstory.models.DataItemChapters;
import com.xeniac.harrypotterstory.models.DataItemPages;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;

public class PagesActivity extends AppCompatActivity {

    private DataItemChapters itemChapters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pages);
        Toolbar toolbar = findViewById(R.id.toolbar_pages);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled((true));
        setTitle(null);

        itemChapters = Objects.requireNonNull(getIntent().getExtras()).
                getParcelable(ChaptersAdapter.ITEM_KEY);

        if (itemChapters == null) {
            throw new AssertionError("Null data item received!");
        } else {
            pagesInitializer();
        }
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

    private void pagesInitializer() {
        ImageView coverIV = findViewById(R.id.iv_pages_cover);
        TextView titleTV = findViewById(R.id.tv_pages_chapter_title);
        TextView numberTV = findViewById(R.id.tv_pages_chapter_number);

        titleTV.setText(itemChapters.getTitle());
        numberTV.setText(itemChapters.getNumber());

        try {
            String imageFile = itemChapters.getCover();
            InputStream inputStream = getAssets().open(imageFile);
            Drawable drawable = Drawable.createFromStream(inputStream, null);
            coverIV.setImageDrawable(drawable);
            coverIV.setClipToOutline(true);
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<DataItemPages> dataItemPagesList;
        PagesAdapter pagesAdapter;
        RecyclerView pagesRV = findViewById(R.id.rv_pages);

        switch (itemChapters.getId()) {
            case "book_1_chapter_1":
                dataItemPagesList = PagesDataProviderBook1_1.dataItemPagesList;
                pagesAdapter = new PagesAdapter(this, dataItemPagesList);
                pagesRV.setAdapter(pagesAdapter);
                break;
            case "book_1_chapter_2":
                dataItemPagesList = PagesDataProviderBook1_2.dataItemPagesList;
                pagesAdapter = new PagesAdapter(this, dataItemPagesList);
                pagesRV.setAdapter(pagesAdapter);
                break;
        }
    }
}

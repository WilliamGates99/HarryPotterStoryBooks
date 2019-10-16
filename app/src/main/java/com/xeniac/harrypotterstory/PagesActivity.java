package com.xeniac.harrypotterstory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.appbar.AppBarLayout;
import com.xeniac.harrypotterstory.adapters.ChaptersAdapter;
import com.xeniac.harrypotterstory.adapters.PagesAdapter;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook1_1;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook1_2;
import com.xeniac.harrypotterstory.database.DataSource;
import com.xeniac.harrypotterstory.models.DataItemChapters;
import com.xeniac.harrypotterstory.models.DataItemPages;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;

public class PagesActivity extends AppCompatActivity {

    private DataSource mDataSource;
    private DataItemChapters itemChapters;

    private ImageButton bookmarkGrayIB, bookmarkBlueIB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pages);
        AppBarLayout appBarLayout = findViewById(R.id.appbar_pages);
        appBarLayout.bringToFront();
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
    protected void onResume() {
        super.onResume();
        mDataSource.open();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mDataSource.close();
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
        mDataSource = new DataSource(this);
        mDataSource.open();

        ImageView coverIV = findViewById(R.id.iv_pages_cover);
        TextView titleTV = findViewById(R.id.tv_pages_chapter_title);
        TextView numberTV = findViewById(R.id.tv_pages_chapter_number);

        bookmarkGrayIB = findViewById(R.id.ib_pages_bookmark_gray);
        bookmarkBlueIB = findViewById(R.id.ib_pages_bookmark_blue);

        if (itemChapters.isFavorite()) {
            bookmarkBlueIB.setVisibility(View.VISIBLE);
            bookmarkGrayIB.setVisibility(View.GONE);
        } else {
            bookmarkBlueIB.setVisibility(View.GONE);
            bookmarkGrayIB.setVisibility(View.VISIBLE);
        }

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
        RecyclerView pagesRV = findViewById(R.id.rv_pages);
        PagesAdapter pagesAdapter;

        //TODO Complete the switch
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

    private String storeURLInitializer() {
        return "https://play.google.com/store/apps/detiraails?id=" + getPackageName();
    }

    public void upOnClick(View view) {
        NestedScrollView nestedScrollView = findViewById(R.id.nsv_pages);
        nestedScrollView.smoothScrollTo(0, 0);
    }

    public void shareOnClick(View view) {
        /* Add these code for share highlighted text
        String gist = getResources().getString(R.string.string_book_1_page_1).substring(0, 200);
        String shareString = gist + "…" + "\n\nContinue reading in " +
                getResources().getString(R.string.app_name) + " app.\n\n" + storeURLInitializer();
                */

        String shareString = "Let's read " + getResources().getString(itemChapters.getTitle()) +
                " chapter of " + getResources().getString(itemChapters.getBookTitle()) +
                " book together." + "\n\n" + storeURLInitializer();

        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Result Sharing");
        shareIntent.putExtra(Intent.EXTRA_TEXT, shareString);
        startActivity(Intent.createChooser(
                shareIntent, getString(R.string.string_pages_share_title)));
    }

    public void bookmarkGrayOnClick(View view) {
        itemChapters.setFavorite(true);
        mDataSource.updateFavorite(itemChapters);
        bookmarkBlueIB.setVisibility(View.VISIBLE);
        bookmarkGrayIB.setVisibility(View.GONE);
    }

    public void bookmarkBlueOnClick(View view) {
        itemChapters.setFavorite(false);
        mDataSource.updateFavorite(itemChapters);
        bookmarkBlueIB.setVisibility(View.GONE);
        bookmarkGrayIB.setVisibility(View.VISIBLE);
    }

    public void filterOnClick(View view) {
        //TODO edit
        Toast.makeText(this, "Filter panel opened.", Toast.LENGTH_SHORT).show();
    }
}
package com.xeniac.harrypotterstory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.card.MaterialCardView;
import com.xeniac.harrypotterstory.adapters.ChaptersAdapter;
import com.xeniac.harrypotterstory.adapters.PagesAdapter;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook1.PagesDataProviderBook1_1;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook1.PagesDataProviderBook1_2;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook1.PagesDataProviderBook1_3;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook1.PagesDataProviderBook1_4;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook1.PagesDataProviderBook1_5;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook1.PagesDataProviderBook1_6;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook1.PagesDataProviderBook1_7;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook1.PagesDataProviderBook1_8;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook2.PagesDataProviderBook2_1;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook2.PagesDataProviderBook2_10;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook2.PagesDataProviderBook2_11;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook2.PagesDataProviderBook2_12;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook2.PagesDataProviderBook2_13;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook2.PagesDataProviderBook2_14;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook2.PagesDataProviderBook2_15;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook2.PagesDataProviderBook2_16;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook2.PagesDataProviderBook2_17;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook2.PagesDataProviderBook2_18;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook2.PagesDataProviderBook2_2;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook2.PagesDataProviderBook2_3;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook2.PagesDataProviderBook2_4;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook2.PagesDataProviderBook2_5;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook2.PagesDataProviderBook2_6;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook2.PagesDataProviderBook2_7;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook2.PagesDataProviderBook2_8;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook2.PagesDataProviderBook2_9;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook3.PagesDataProviderBook3_1;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook3.PagesDataProviderBook3_10;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook3.PagesDataProviderBook3_11;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook3.PagesDataProviderBook3_12;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook3.PagesDataProviderBook3_13;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook3.PagesDataProviderBook3_14;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook3.PagesDataProviderBook3_15;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook3.PagesDataProviderBook3_16;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook3.PagesDataProviderBook3_17;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook3.PagesDataProviderBook3_18;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook3.PagesDataProviderBook3_19;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook3.PagesDataProviderBook3_2;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook3.PagesDataProviderBook3_20;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook3.PagesDataProviderBook3_21;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook3.PagesDataProviderBook3_22;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook3.PagesDataProviderBook3_3;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook3.PagesDataProviderBook3_4;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook3.PagesDataProviderBook3_5;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook3.PagesDataProviderBook3_6;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook3.PagesDataProviderBook3_7;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook3.PagesDataProviderBook3_8;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook3.PagesDataProviderBook3_9;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook4.PagesDataProviderBook4_1;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook4.PagesDataProviderBook4_10;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook4.PagesDataProviderBook4_11;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook4.PagesDataProviderBook4_12;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook4.PagesDataProviderBook4_13;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook4.PagesDataProviderBook4_14;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook4.PagesDataProviderBook4_15;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook4.PagesDataProviderBook4_16;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook4.PagesDataProviderBook4_17;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook4.PagesDataProviderBook4_18;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook4.PagesDataProviderBook4_19;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook4.PagesDataProviderBook4_2;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook4.PagesDataProviderBook4_20;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook4.PagesDataProviderBook4_21;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook4.PagesDataProviderBook4_22;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook4.PagesDataProviderBook4_23;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook4.PagesDataProviderBook4_24;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook4.PagesDataProviderBook4_25;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook4.PagesDataProviderBook4_26;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook4.PagesDataProviderBook4_27;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook4.PagesDataProviderBook4_28;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook4.PagesDataProviderBook4_29;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook4.PagesDataProviderBook4_3;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook4.PagesDataProviderBook4_30;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook4.PagesDataProviderBook4_31;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook4.PagesDataProviderBook4_32;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook4.PagesDataProviderBook4_33;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook4.PagesDataProviderBook4_4;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook4.PagesDataProviderBook4_5;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook4.PagesDataProviderBook4_6;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook4.PagesDataProviderBook4_7;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook4.PagesDataProviderBook4_8;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook4.PagesDataProviderBook4_9;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook5.PagesDataProviderBook5_1;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook5.PagesDataProviderBook5_10;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook5.PagesDataProviderBook5_11;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook5.PagesDataProviderBook5_12;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook5.PagesDataProviderBook5_13;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook5.PagesDataProviderBook5_14;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook5.PagesDataProviderBook5_15;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook5.PagesDataProviderBook5_16;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook5.PagesDataProviderBook5_17;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook5.PagesDataProviderBook5_18;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook5.PagesDataProviderBook5_19;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook5.PagesDataProviderBook5_2;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook5.PagesDataProviderBook5_20;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook5.PagesDataProviderBook5_21;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook5.PagesDataProviderBook5_22;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook5.PagesDataProviderBook5_23;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook5.PagesDataProviderBook5_24;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook5.PagesDataProviderBook5_25;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook5.PagesDataProviderBook5_26;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook5.PagesDataProviderBook5_27;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook5.PagesDataProviderBook5_28;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook5.PagesDataProviderBook5_29;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook5.PagesDataProviderBook5_3;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook5.PagesDataProviderBook5_30;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook5.PagesDataProviderBook5_31;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook5.PagesDataProviderBook5_32;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook5.PagesDataProviderBook5_33;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook5.PagesDataProviderBook5_34;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook5.PagesDataProviderBook5_35;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook5.PagesDataProviderBook5_36;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook5.PagesDataProviderBook5_37;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook5.PagesDataProviderBook5_38;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook5.PagesDataProviderBook5_4;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook5.PagesDataProviderBook5_5;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook5.PagesDataProviderBook5_6;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook5.PagesDataProviderBook5_7;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook5.PagesDataProviderBook5_8;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook5.PagesDataProviderBook5_9;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook6.PagesDataProviderBook6_1;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook6.PagesDataProviderBook6_10;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook6.PagesDataProviderBook6_11;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook6.PagesDataProviderBook6_12;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook6.PagesDataProviderBook6_13;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook6.PagesDataProviderBook6_14;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook6.PagesDataProviderBook6_15;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook6.PagesDataProviderBook6_16;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook6.PagesDataProviderBook6_17;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook6.PagesDataProviderBook6_18;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook6.PagesDataProviderBook6_19;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook6.PagesDataProviderBook6_2;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook6.PagesDataProviderBook6_20;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook6.PagesDataProviderBook6_21;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook6.PagesDataProviderBook6_22;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook6.PagesDataProviderBook6_23;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook6.PagesDataProviderBook6_24;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook6.PagesDataProviderBook6_25;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook6.PagesDataProviderBook6_26;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook6.PagesDataProviderBook6_27;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook6.PagesDataProviderBook6_28;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook6.PagesDataProviderBook6_29;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook6.PagesDataProviderBook6_3;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook6.PagesDataProviderBook6_30;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook6.PagesDataProviderBook6_4;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook6.PagesDataProviderBook6_5;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook6.PagesDataProviderBook6_6;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook6.PagesDataProviderBook6_7;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook6.PagesDataProviderBook6_8;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook6.PagesDataProviderBook6_9;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook7.PagesDataProviderBook7_1;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook7.PagesDataProviderBook7_10;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook7.PagesDataProviderBook7_11;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook7.PagesDataProviderBook7_12;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook7.PagesDataProviderBook7_13;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook7.PagesDataProviderBook7_14;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook7.PagesDataProviderBook7_15;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook7.PagesDataProviderBook7_16;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook7.PagesDataProviderBook7_17;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook7.PagesDataProviderBook7_18;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook7.PagesDataProviderBook7_19;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook7.PagesDataProviderBook7_2;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook7.PagesDataProviderBook7_20;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook7.PagesDataProviderBook7_21;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook7.PagesDataProviderBook7_22;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook7.PagesDataProviderBook7_23;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook7.PagesDataProviderBook7_24;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook7.PagesDataProviderBook7_25;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook7.PagesDataProviderBook7_26;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook7.PagesDataProviderBook7_27;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook7.PagesDataProviderBook7_28;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook7.PagesDataProviderBook7_29;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook7.PagesDataProviderBook7_3;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook7.PagesDataProviderBook7_30;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook7.PagesDataProviderBook7_31;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook7.PagesDataProviderBook7_32;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook7.PagesDataProviderBook7_33;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook7.PagesDataProviderBook7_34;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook7.PagesDataProviderBook7_35;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook7.PagesDataProviderBook7_36;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook7.PagesDataProviderBook7_37;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook7.PagesDataProviderBook7_4;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook7.PagesDataProviderBook7_5;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook7.PagesDataProviderBook7_6;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook7.PagesDataProviderBook7_7;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook7.PagesDataProviderBook7_8;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook7.PagesDataProviderBook7_9;
import com.xeniac.harrypotterstory.database.booksDataBase.BooksDataSource;
import com.xeniac.harrypotterstory.database.chaptersDataBase.ChaptersDataSource;
import com.xeniac.harrypotterstory.database.pagesDataBase.PagesDataSource;
import com.xeniac.harrypotterstory.models.DataItemChapters;
import com.xeniac.harrypotterstory.models.DataItemPages;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;

public class PagesActivity extends AppCompatActivity {

    private BooksDataSource booksDataSource;
    private ChaptersDataSource chaptersDataSource;
    private PagesDataSource pagesDataSource;

    private int chapterId;
    private DataItemChapters chapter;

    private NestedScrollView nestedScrollView;
    private ImageButton bookmarkGrayIB, bookmarkBlueIB;
    private ImageButton settingsBlackIB, settingsBlueIB;
    private ImageButton settingsModeDarkIB, settingsModeLightIB;
    private MaterialCardView settingsPanelCV;

    private PagesAdapter pagesAdapter;

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

        chapterId = Objects.requireNonNull(getIntent().getExtras()).
                getInt(ChaptersAdapter.ITEM_KEY);
        pagesInitializer();
    }

    @Override
    protected void onResume() {
        super.onResume();
        chaptersDataSource.open();
        pagesDataSource.open();
        pagesLayout();
    }

    @Override
    protected void onPause() {
        super.onPause();
        booksDataSource.close();
        chaptersDataSource.close();
        pagesDataSource.close();
    }

    @Override
    public boolean onSupportNavigateUp() {
        nestedScrollView.smoothScrollBy(0, 0);
        super.onBackPressed();
        return false;
    }

    @Override
    public void onBackPressed() {
        nestedScrollView.smoothScrollBy(0, 0);
        super.onBackPressed();
    }

    private void pagesInitializer() {
        booksDataSource = new BooksDataSource(this);
        chaptersDataSource = new ChaptersDataSource(this);
        chaptersDataSource.open();
        chapter = chaptersDataSource.getReadingItem(chapterId);
        seedPagesData();
        pagesLayout();
    }

    private void pagesLayout() {
        ImageView coverIV = findViewById(R.id.iv_pages_cover);
        TextView titleTV = findViewById(R.id.tv_pages_chapter_title);
        TextView numberTV = findViewById(R.id.tv_pages_chapter_number);
        bookmarkGrayIB = findViewById(R.id.ib_pages_bookmark_gray);
        bookmarkBlueIB = findViewById(R.id.ib_pages_bookmark_blue);
        settingsBlackIB = findViewById(R.id.ib_pages_settings_black);
        settingsBlueIB = findViewById(R.id.ib_pages_settings_blue);
        settingsPanelCV = findViewById(R.id.cv_pages_settings_panel);

        if (chapter.isFavorite()) {
            bookmarkBlueIB.setVisibility(View.VISIBLE);
            bookmarkGrayIB.setVisibility(View.GONE);
        } else {
            bookmarkBlueIB.setVisibility(View.GONE);
            bookmarkGrayIB.setVisibility(View.VISIBLE);
        }

        titleTV.setText(chapter.getTitle());
        numberTV.setText(String.valueOf(chapter.getNumber()));

        try {
            String imageFile = chapter.getCover();
            InputStream inputStream = getAssets().open(imageFile);
            Drawable drawable = Drawable.createFromStream(inputStream, null);
            coverIV.setImageDrawable(drawable);
            coverIV.setClipToOutline(true);
        } catch (IOException e) {
            e.printStackTrace();
        }

        pagesRecyclerView();
        settingsModeTogglesMethod();
    }

    private void pagesRecyclerView() {
        List<DataItemPages> dataItemPagesList = pagesDataSource.getAllItems(chapter.getId());
        RecyclerView pagesRV = findViewById(R.id.rv_pages);
        pagesAdapter = new PagesAdapter(this, dataItemPagesList);
        pagesRV.setAdapter(pagesAdapter);
        scrollViewMethod();
    }

    private void scrollViewMethod() {
        nestedScrollView = findViewById(R.id.nsv_pages);

        if (chapter.getReadScroll() > 0) {
            nestedScrollView.post(() ->
                    nestedScrollView.smoothScrollTo(0, chapter.getReadScroll()));
        }

        nestedScrollView.setOnScrollChangeListener((NestedScrollView.OnScrollChangeListener) (
                v, scrollX, scrollY, oldScrollX, oldScrollY) -> {

            if (chapter.getTotalScroll() == 0) {
                chapter.setTotalScroll(
                        v.getChildAt(0).getMeasuredHeight() - v.getMeasuredHeight());
            }

            chapter.setReadScroll(scrollY);
            chaptersDataSource.updateChapters(chapter);
        });
    }

    public void upOnClick(View view) {
        nestedScrollView.smoothScrollTo(0, 0);
    }

    private String storeURL() {
        return "https://play.google.com/store/apps/details?id=" + getPackageName();
    }

    public void shareOnClick(View view) {
        booksDataSource.open();

        String shareString = "Let's read " +
                getResources().getString(chapter.getTitle()) + " chapter of " +
                getResources().getString(booksDataSource.getBookTitle(chapter.getBookId())) +
                " book together." + "\n\n" + storeURL();

        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Result Sharing");
        shareIntent.putExtra(Intent.EXTRA_TEXT, shareString);
        startActivity(Intent.createChooser(
                shareIntent, getString(R.string.string_pages_share_title)));
    }

    public void bookmarkGrayOnClick(View view) {
        chapter.setFavorite(true);
        chaptersDataSource.updateChapters(chapter);
        bookmarkBlueIB.setVisibility(View.VISIBLE);
        bookmarkGrayIB.setVisibility(View.GONE);
    }

    public void bookmarkBlueOnClick(View view) {
        chapter.setFavorite(false);
        chaptersDataSource.updateChapters(chapter);
        bookmarkBlueIB.setVisibility(View.GONE);
        bookmarkGrayIB.setVisibility(View.VISIBLE);
    }

    public void settingsBlackOnClick(View view) {
        settingsBlackIB.setVisibility(View.GONE);
        settingsBlueIB.setVisibility(View.VISIBLE);
        float distance = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
                -200, getResources().getDisplayMetrics());
        settingsPanelCV.animate().translationY(distance);
    }

    public void settingsBlueOnClick(View view) {
        settingsBlueIB.setVisibility(View.GONE);
        settingsBlackIB.setVisibility(View.VISIBLE);
        settingsPanelCV.animate().translationY(0);
    }

    public void fontIncreaseOnClick(View view) {
        PagesAdapter.TEXT_SIZE_FLAG = 1;
        pagesAdapter.notifyDataSetChanged();
    }

    public void fontDecreaseOnClick(View view) {
        PagesAdapter.TEXT_SIZE_FLAG = -1;
        pagesAdapter.notifyDataSetChanged();
    }

    private void settingsModeTogglesMethod() {
        settingsModeDarkIB = findViewById(R.id.ib_pages_settings_mode_dark);
        settingsModeLightIB = findViewById(R.id.ib_pages_settings_mode_light);

        SharedPreferences preferences = getSharedPreferences(
                SubApplication.DARK_MODE_CHECK, MODE_PRIVATE);
        boolean darkMode = preferences.getBoolean(
                SubApplication.DARK_MODE_CHECK_KEY, false);

        if (darkMode) {
            settingsModeLightIB.setPressed(false);
            settingsModeDarkIB.setPressed(true);
        } else {
            settingsModeDarkIB.setPressed(false);
            settingsModeLightIB.setPressed(true);
        }

        lightModeToggleMethod();
        darkModeToggleMethod();
    }

    private void lightModeToggleMethod() {
        if (settingsModeLightIB.isPressed()) {
            settingsModeLightIB.setClickable(false);
        } else {
            settingsModeLightIB.setOnClickListener(v -> {
                SharedPreferences.Editor editor = getSharedPreferences(
                        SubApplication.DARK_MODE_CHECK, MODE_PRIVATE).edit();
                editor.putBoolean(SubApplication.DARK_MODE_CHECK_KEY, false).apply();

                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
            });
        }
    }

    private void darkModeToggleMethod() {
        if (settingsModeDarkIB.isPressed()) {
            settingsModeDarkIB.setClickable(false);
        } else {
            settingsModeDarkIB.setOnClickListener(v -> {
                SharedPreferences.Editor editor = getSharedPreferences(
                        SubApplication.DARK_MODE_CHECK, MODE_PRIVATE).edit();
                editor.putBoolean(SubApplication.DARK_MODE_CHECK_KEY, true).apply();

                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
            });
        }
    }

    private void seedPagesData() {
        pagesDataSource = new PagesDataSource(this);
        pagesDataSource.open();

        switch (chapter.getBookId()) {
            case 1:
                seedPagesBook1();
                break;
            case 2:
                seedPagesBook2();
                break;
            case 3:
                seedPagesBook3();
                break;
            case 4:
                seedPagesBook4();
                break;
            case 5:
                seedPagesBook5();
                break;
            case 6:
                seedPagesBook6();
                break;
            case 7:
                seedPagesBook7();
                break;
        }
    }

    private void seedPagesBook1() {
        switch (chapter.getId()) {
            case 11:
                pagesDataSource.seedDataBase(PagesDataProviderBook1_1.dataItemPagesList);
                break;
            case 12:
                pagesDataSource.seedDataBase(PagesDataProviderBook1_2.dataItemPagesList);
                break;
            case 13:
                pagesDataSource.seedDataBase(PagesDataProviderBook1_3.dataItemPagesList);
                break;
            case 14:
                pagesDataSource.seedDataBase(PagesDataProviderBook1_4.dataItemPagesList);
                break;
            case 15:
                pagesDataSource.seedDataBase(PagesDataProviderBook1_5.dataItemPagesList);
                break;
            case 16:
                pagesDataSource.seedDataBase(PagesDataProviderBook1_6.dataItemPagesList);
                break;
            case 17:
                pagesDataSource.seedDataBase(PagesDataProviderBook1_7.dataItemPagesList);
                break;
            case 18:
                pagesDataSource.seedDataBase(PagesDataProviderBook1_8.dataItemPagesList);
                break;
            case 19:
                pagesDataSource.seedDataBase(PagesDataProviderBook1_9.dataItemPagesList);
                break;
            case 110:
                pagesDataSource.seedDataBase(PagesDataProviderBook1_10.dataItemPagesList);
                break;
            case 111:
                pagesDataSource.seedDataBase(PagesDataProviderBook1_11.dataItemPagesList);
                break;
            case 112:
                pagesDataSource.seedDataBase(PagesDataProviderBook1_12.dataItemPagesList);
                break;
            case 113:
                pagesDataSource.seedDataBase(PagesDataProviderBook1_13.dataItemPagesList);
                break;
            case 114:
                pagesDataSource.seedDataBase(PagesDataProviderBook1_14.dataItemPagesList);
                break;
            case 115:
                pagesDataSource.seedDataBase(PagesDataProviderBook1_15.dataItemPagesList);
                break;
            case 116:
                pagesDataSource.seedDataBase(PagesDataProviderBook1_16.dataItemPagesList);
                break;
            case 117:
                pagesDataSource.seedDataBase(PagesDataProviderBook1_17.dataItemPagesList);
                break;
        }
    }

    private void seedPagesBook2() {
        switch (chapter.getId()) {
            case 21:
                pagesDataSource.seedDataBase(PagesDataProviderBook2_1.dataItemPagesList);
                break;
            case 22:
                pagesDataSource.seedDataBase(PagesDataProviderBook2_2.dataItemPagesList);
                break;
            case 23:
                pagesDataSource.seedDataBase(PagesDataProviderBook2_3.dataItemPagesList);
                break;
            case 24:
                pagesDataSource.seedDataBase(PagesDataProviderBook2_4.dataItemPagesList);
                break;
            case 25:
                pagesDataSource.seedDataBase(PagesDataProviderBook2_5.dataItemPagesList);
                break;
            case 26:
                pagesDataSource.seedDataBase(PagesDataProviderBook2_6.dataItemPagesList);
                break;
            case 27:
                pagesDataSource.seedDataBase(PagesDataProviderBook2_7.dataItemPagesList);
                break;
            case 28:
                pagesDataSource.seedDataBase(PagesDataProviderBook2_8.dataItemPagesList);
                break;
            case 29:
                pagesDataSource.seedDataBase(PagesDataProviderBook2_9.dataItemPagesList);
                break;
            case 210:
                pagesDataSource.seedDataBase(PagesDataProviderBook2_10.dataItemPagesList);
                break;
            case 211:
                pagesDataSource.seedDataBase(PagesDataProviderBook2_11.dataItemPagesList);
                break;
            case 212:
                pagesDataSource.seedDataBase(PagesDataProviderBook2_12.dataItemPagesList);
                break;
            case 213:
                pagesDataSource.seedDataBase(PagesDataProviderBook2_13.dataItemPagesList);
                break;
            case 214:
                pagesDataSource.seedDataBase(PagesDataProviderBook2_14.dataItemPagesList);
                break;
            case 215:
                pagesDataSource.seedDataBase(PagesDataProviderBook2_15.dataItemPagesList);
                break;
            case 216:
                pagesDataSource.seedDataBase(PagesDataProviderBook2_16.dataItemPagesList);
                break;
            case 217:
                pagesDataSource.seedDataBase(PagesDataProviderBook2_17.dataItemPagesList);
                break;
            case 218:
                pagesDataSource.seedDataBase(PagesDataProviderBook2_18.dataItemPagesList);
                break;
        }
    }

    private void seedPagesBook3() {
        switch (chapter.getId()) {
            case 31:
                pagesDataSource.seedDataBase(PagesDataProviderBook3_1.dataItemPagesList);
                break;
            case 32:
                pagesDataSource.seedDataBase(PagesDataProviderBook3_2.dataItemPagesList);
                break;
            case 33:
                pagesDataSource.seedDataBase(PagesDataProviderBook3_3.dataItemPagesList);
                break;
            case 34:
                pagesDataSource.seedDataBase(PagesDataProviderBook3_4.dataItemPagesList);
                break;
            case 35:
                pagesDataSource.seedDataBase(PagesDataProviderBook3_5.dataItemPagesList);
                break;
            case 36:
                pagesDataSource.seedDataBase(PagesDataProviderBook3_6.dataItemPagesList);
                break;
            case 37:
                pagesDataSource.seedDataBase(PagesDataProviderBook3_7.dataItemPagesList);
                break;
            case 38:
                pagesDataSource.seedDataBase(PagesDataProviderBook3_8.dataItemPagesList);
                break;
            case 39:
                pagesDataSource.seedDataBase(PagesDataProviderBook3_9.dataItemPagesList);
                break;
            case 310:
                pagesDataSource.seedDataBase(PagesDataProviderBook3_10.dataItemPagesList);
                break;
            case 311:
                pagesDataSource.seedDataBase(PagesDataProviderBook3_11.dataItemPagesList);
                break;
            case 312:
                pagesDataSource.seedDataBase(PagesDataProviderBook3_12.dataItemPagesList);
                break;
            case 313:
                pagesDataSource.seedDataBase(PagesDataProviderBook3_13.dataItemPagesList);
                break;
            case 314:
                pagesDataSource.seedDataBase(PagesDataProviderBook3_14.dataItemPagesList);
                break;
            case 315:
                pagesDataSource.seedDataBase(PagesDataProviderBook3_15.dataItemPagesList);
                break;
            case 316:
                pagesDataSource.seedDataBase(PagesDataProviderBook3_16.dataItemPagesList);
                break;
            case 317:
                pagesDataSource.seedDataBase(PagesDataProviderBook3_17.dataItemPagesList);
                break;
            case 318:
                pagesDataSource.seedDataBase(PagesDataProviderBook3_18.dataItemPagesList);
                break;
            case 319:
                pagesDataSource.seedDataBase(PagesDataProviderBook3_19.dataItemPagesList);
                break;
            case 320:
                pagesDataSource.seedDataBase(PagesDataProviderBook3_20.dataItemPagesList);
                break;
            case 321:
                pagesDataSource.seedDataBase(PagesDataProviderBook3_21.dataItemPagesList);
                break;
            case 322:
                pagesDataSource.seedDataBase(PagesDataProviderBook3_22.dataItemPagesList);
                break;
        }
    }

    private void seedPagesBook4() {
        switch (chapter.getId()) {
            case 41:
                pagesDataSource.seedDataBase(PagesDataProviderBook4_1.dataItemPagesList);
                break;
            case 42:
                pagesDataSource.seedDataBase(PagesDataProviderBook4_2.dataItemPagesList);
                break;
            case 43:
                pagesDataSource.seedDataBase(PagesDataProviderBook4_3.dataItemPagesList);
                break;
            case 44:
                pagesDataSource.seedDataBase(PagesDataProviderBook4_4.dataItemPagesList);
                break;
            case 45:
                pagesDataSource.seedDataBase(PagesDataProviderBook4_5.dataItemPagesList);
                break;
            case 46:
                pagesDataSource.seedDataBase(PagesDataProviderBook4_6.dataItemPagesList);
                break;
            case 47:
                pagesDataSource.seedDataBase(PagesDataProviderBook4_7.dataItemPagesList);
                break;
            case 48:
                pagesDataSource.seedDataBase(PagesDataProviderBook4_8.dataItemPagesList);
                break;
            case 49:
                pagesDataSource.seedDataBase(PagesDataProviderBook4_9.dataItemPagesList);
                break;
            case 410:
                pagesDataSource.seedDataBase(PagesDataProviderBook4_10.dataItemPagesList);
                break;
            case 411:
                pagesDataSource.seedDataBase(PagesDataProviderBook4_11.dataItemPagesList);
                break;
            case 412:
                pagesDataSource.seedDataBase(PagesDataProviderBook4_12.dataItemPagesList);
                break;
            case 413:
                pagesDataSource.seedDataBase(PagesDataProviderBook4_13.dataItemPagesList);
                break;
            case 414:
                pagesDataSource.seedDataBase(PagesDataProviderBook4_14.dataItemPagesList);
                break;
            case 415:
                pagesDataSource.seedDataBase(PagesDataProviderBook4_15.dataItemPagesList);
                break;
            case 416:
                pagesDataSource.seedDataBase(PagesDataProviderBook4_16.dataItemPagesList);
                break;
            case 417:
                pagesDataSource.seedDataBase(PagesDataProviderBook4_17.dataItemPagesList);
                break;
            case 418:
                pagesDataSource.seedDataBase(PagesDataProviderBook4_18.dataItemPagesList);
                break;
            case 419:
                pagesDataSource.seedDataBase(PagesDataProviderBook4_19.dataItemPagesList);
                break;
            case 420:
                pagesDataSource.seedDataBase(PagesDataProviderBook4_20.dataItemPagesList);
                break;
            case 421:
                pagesDataSource.seedDataBase(PagesDataProviderBook4_21.dataItemPagesList);
                break;
            case 422:
                pagesDataSource.seedDataBase(PagesDataProviderBook4_22.dataItemPagesList);
                break;
            case 423:
                pagesDataSource.seedDataBase(PagesDataProviderBook4_23.dataItemPagesList);
                break;
            case 424:
                pagesDataSource.seedDataBase(PagesDataProviderBook4_24.dataItemPagesList);
                break;
            case 425:
                pagesDataSource.seedDataBase(PagesDataProviderBook4_25.dataItemPagesList);
                break;
            case 426:
                pagesDataSource.seedDataBase(PagesDataProviderBook4_26.dataItemPagesList);
                break;
            case 427:
                pagesDataSource.seedDataBase(PagesDataProviderBook4_27.dataItemPagesList);
                break;
            case 428:
                pagesDataSource.seedDataBase(PagesDataProviderBook4_28.dataItemPagesList);
                break;
            case 429:
                pagesDataSource.seedDataBase(PagesDataProviderBook4_29.dataItemPagesList);
                break;
            case 430:
                pagesDataSource.seedDataBase(PagesDataProviderBook4_30.dataItemPagesList);
                break;
            case 431:
                pagesDataSource.seedDataBase(PagesDataProviderBook4_31.dataItemPagesList);
                break;
            case 432:
                pagesDataSource.seedDataBase(PagesDataProviderBook4_32.dataItemPagesList);
                break;
            case 433:
                pagesDataSource.seedDataBase(PagesDataProviderBook4_33.dataItemPagesList);
                break;
        }
    }

    private void seedPagesBook5() {
        switch (chapter.getId()) {
            case 51:
                pagesDataSource.seedDataBase(PagesDataProviderBook5_1.dataItemPagesList);
                break;
            case 52:
                pagesDataSource.seedDataBase(PagesDataProviderBook5_2.dataItemPagesList);
                break;
            case 53:
                pagesDataSource.seedDataBase(PagesDataProviderBook5_3.dataItemPagesList);
                break;
            case 54:
                pagesDataSource.seedDataBase(PagesDataProviderBook5_4.dataItemPagesList);
                break;
            case 55:
                pagesDataSource.seedDataBase(PagesDataProviderBook5_5.dataItemPagesList);
                break;
            case 56:
                pagesDataSource.seedDataBase(PagesDataProviderBook5_6.dataItemPagesList);
                break;
            case 57:
                pagesDataSource.seedDataBase(PagesDataProviderBook5_7.dataItemPagesList);
                break;
            case 58:
                pagesDataSource.seedDataBase(PagesDataProviderBook5_8.dataItemPagesList);
                break;
            case 59:
                pagesDataSource.seedDataBase(PagesDataProviderBook5_9.dataItemPagesList);
                break;
            case 510:
                pagesDataSource.seedDataBase(PagesDataProviderBook5_10.dataItemPagesList);
                break;
            case 511:
                pagesDataSource.seedDataBase(PagesDataProviderBook5_11.dataItemPagesList);
                break;
            case 512:
                pagesDataSource.seedDataBase(PagesDataProviderBook5_12.dataItemPagesList);
                break;
            case 513:
                pagesDataSource.seedDataBase(PagesDataProviderBook5_13.dataItemPagesList);
                break;
            case 514:
                pagesDataSource.seedDataBase(PagesDataProviderBook5_14.dataItemPagesList);
                break;
            case 515:
                pagesDataSource.seedDataBase(PagesDataProviderBook5_15.dataItemPagesList);
                break;
            case 516:
                pagesDataSource.seedDataBase(PagesDataProviderBook5_16.dataItemPagesList);
                break;
            case 517:
                pagesDataSource.seedDataBase(PagesDataProviderBook5_17.dataItemPagesList);
                break;
            case 518:
                pagesDataSource.seedDataBase(PagesDataProviderBook5_18.dataItemPagesList);
                break;
            case 519:
                pagesDataSource.seedDataBase(PagesDataProviderBook5_19.dataItemPagesList);
                break;
            case 520:
                pagesDataSource.seedDataBase(PagesDataProviderBook5_20.dataItemPagesList);
                break;
            case 521:
                pagesDataSource.seedDataBase(PagesDataProviderBook5_21.dataItemPagesList);
                break;
            case 522:
                pagesDataSource.seedDataBase(PagesDataProviderBook5_22.dataItemPagesList);
                break;
            case 523:
                pagesDataSource.seedDataBase(PagesDataProviderBook5_23.dataItemPagesList);
                break;
            case 524:
                pagesDataSource.seedDataBase(PagesDataProviderBook5_24.dataItemPagesList);
                break;
            case 525:
                pagesDataSource.seedDataBase(PagesDataProviderBook5_25.dataItemPagesList);
                break;
            case 526:
                pagesDataSource.seedDataBase(PagesDataProviderBook5_26.dataItemPagesList);
                break;
            case 527:
                pagesDataSource.seedDataBase(PagesDataProviderBook5_27.dataItemPagesList);
                break;
            case 528:
                pagesDataSource.seedDataBase(PagesDataProviderBook5_28.dataItemPagesList);
                break;
            case 529:
                pagesDataSource.seedDataBase(PagesDataProviderBook5_29.dataItemPagesList);
                break;
            case 530:
                pagesDataSource.seedDataBase(PagesDataProviderBook5_30.dataItemPagesList);
                break;
            case 531:
                pagesDataSource.seedDataBase(PagesDataProviderBook5_31.dataItemPagesList);
                break;
            case 532:
                pagesDataSource.seedDataBase(PagesDataProviderBook5_32.dataItemPagesList);
                break;
            case 533:
                pagesDataSource.seedDataBase(PagesDataProviderBook5_33.dataItemPagesList);
                break;
            case 534:
                pagesDataSource.seedDataBase(PagesDataProviderBook5_34.dataItemPagesList);
                break;
            case 535:
                pagesDataSource.seedDataBase(PagesDataProviderBook5_35.dataItemPagesList);
                break;
            case 536:
                pagesDataSource.seedDataBase(PagesDataProviderBook5_36.dataItemPagesList);
                break;
            case 537:
                pagesDataSource.seedDataBase(PagesDataProviderBook5_37.dataItemPagesList);
                break;
            case 538:
                pagesDataSource.seedDataBase(PagesDataProviderBook5_38.dataItemPagesList);
                break;
        }
    }

    private void seedPagesBook6() {
        switch (chapter.getId()) {
            case 61:
                pagesDataSource.seedDataBase(PagesDataProviderBook6_1.dataItemPagesList);
                break;
            case 62:
                pagesDataSource.seedDataBase(PagesDataProviderBook6_2.dataItemPagesList);
                break;
            case 63:
                pagesDataSource.seedDataBase(PagesDataProviderBook6_3.dataItemPagesList);
                break;
            case 64:
                pagesDataSource.seedDataBase(PagesDataProviderBook6_4.dataItemPagesList);
                break;
            case 65:
                pagesDataSource.seedDataBase(PagesDataProviderBook6_5.dataItemPagesList);
                break;
            case 66:
                pagesDataSource.seedDataBase(PagesDataProviderBook6_6.dataItemPagesList);
                break;
            case 67:
                pagesDataSource.seedDataBase(PagesDataProviderBook6_7.dataItemPagesList);
                break;
            case 68:
                pagesDataSource.seedDataBase(PagesDataProviderBook6_8.dataItemPagesList);
                break;
            case 69:
                pagesDataSource.seedDataBase(PagesDataProviderBook6_9.dataItemPagesList);
                break;
            case 610:
                pagesDataSource.seedDataBase(PagesDataProviderBook6_10.dataItemPagesList);
                break;
            case 611:
                pagesDataSource.seedDataBase(PagesDataProviderBook6_11.dataItemPagesList);
                break;
            case 612:
                pagesDataSource.seedDataBase(PagesDataProviderBook6_12.dataItemPagesList);
                break;
            case 613:
                pagesDataSource.seedDataBase(PagesDataProviderBook6_13.dataItemPagesList);
                break;
            case 614:
                pagesDataSource.seedDataBase(PagesDataProviderBook6_14.dataItemPagesList);
                break;
            case 615:
                pagesDataSource.seedDataBase(PagesDataProviderBook6_15.dataItemPagesList);
                break;
            case 616:
                pagesDataSource.seedDataBase(PagesDataProviderBook6_16.dataItemPagesList);
                break;
            case 617:
                pagesDataSource.seedDataBase(PagesDataProviderBook6_17.dataItemPagesList);
                break;
            case 618:
                pagesDataSource.seedDataBase(PagesDataProviderBook6_18.dataItemPagesList);
                break;
            case 619:
                pagesDataSource.seedDataBase(PagesDataProviderBook6_19.dataItemPagesList);
                break;
            case 620:
                pagesDataSource.seedDataBase(PagesDataProviderBook6_20.dataItemPagesList);
                break;
            case 621:
                pagesDataSource.seedDataBase(PagesDataProviderBook6_21.dataItemPagesList);
                break;
            case 622:
                pagesDataSource.seedDataBase(PagesDataProviderBook6_22.dataItemPagesList);
                break;
            case 623:
                pagesDataSource.seedDataBase(PagesDataProviderBook6_23.dataItemPagesList);
                break;
            case 624:
                pagesDataSource.seedDataBase(PagesDataProviderBook6_24.dataItemPagesList);
                break;
            case 625:
                pagesDataSource.seedDataBase(PagesDataProviderBook6_25.dataItemPagesList);
                break;
            case 626:
                pagesDataSource.seedDataBase(PagesDataProviderBook6_26.dataItemPagesList);
                break;
            case 627:
                pagesDataSource.seedDataBase(PagesDataProviderBook6_27.dataItemPagesList);
                break;
            case 628:
                pagesDataSource.seedDataBase(PagesDataProviderBook6_28.dataItemPagesList);
                break;
            case 629:
                pagesDataSource.seedDataBase(PagesDataProviderBook6_29.dataItemPagesList);
                break;
            case 630:
                pagesDataSource.seedDataBase(PagesDataProviderBook6_30.dataItemPagesList);
                break;
        }
    }

    private void seedPagesBook7() {
        switch (chapter.getId()) {
            case 71:
                pagesDataSource.seedDataBase(PagesDataProviderBook7_1.dataItemPagesList);
                break;
            case 72:
                pagesDataSource.seedDataBase(PagesDataProviderBook7_2.dataItemPagesList);
                break;
            case 73:
                pagesDataSource.seedDataBase(PagesDataProviderBook7_3.dataItemPagesList);
                break;
            case 74:
                pagesDataSource.seedDataBase(PagesDataProviderBook7_4.dataItemPagesList);
                break;
            case 75:
                pagesDataSource.seedDataBase(PagesDataProviderBook7_5.dataItemPagesList);
                break;
            case 76:
                pagesDataSource.seedDataBase(PagesDataProviderBook7_6.dataItemPagesList);
                break;
            case 77:
                pagesDataSource.seedDataBase(PagesDataProviderBook7_7.dataItemPagesList);
                break;
            case 78:
                pagesDataSource.seedDataBase(PagesDataProviderBook7_8.dataItemPagesList);
                break;
            case 79:
                pagesDataSource.seedDataBase(PagesDataProviderBook7_9.dataItemPagesList);
                break;
            case 710:
                pagesDataSource.seedDataBase(PagesDataProviderBook7_10.dataItemPagesList);
                break;
            case 711:
                pagesDataSource.seedDataBase(PagesDataProviderBook7_11.dataItemPagesList);
                break;
            case 712:
                pagesDataSource.seedDataBase(PagesDataProviderBook7_12.dataItemPagesList);
                break;
            case 713:
                pagesDataSource.seedDataBase(PagesDataProviderBook7_13.dataItemPagesList);
                break;
            case 714:
                pagesDataSource.seedDataBase(PagesDataProviderBook7_14.dataItemPagesList);
                break;
            case 715:
                pagesDataSource.seedDataBase(PagesDataProviderBook7_15.dataItemPagesList);
                break;
            case 716:
                pagesDataSource.seedDataBase(PagesDataProviderBook7_16.dataItemPagesList);
                break;
            case 717:
                pagesDataSource.seedDataBase(PagesDataProviderBook7_17.dataItemPagesList);
                break;
            case 718:
                pagesDataSource.seedDataBase(PagesDataProviderBook7_18.dataItemPagesList);
                break;
            case 719:
                pagesDataSource.seedDataBase(PagesDataProviderBook7_19.dataItemPagesList);
                break;
            case 720:
                pagesDataSource.seedDataBase(PagesDataProviderBook7_20.dataItemPagesList);
                break;
            case 721:
                pagesDataSource.seedDataBase(PagesDataProviderBook7_21.dataItemPagesList);
                break;
            case 722:
                pagesDataSource.seedDataBase(PagesDataProviderBook7_22.dataItemPagesList);
                break;
            case 723:
                pagesDataSource.seedDataBase(PagesDataProviderBook7_23.dataItemPagesList);
                break;
            case 724:
                pagesDataSource.seedDataBase(PagesDataProviderBook7_24.dataItemPagesList);
                break;
            case 725:
                pagesDataSource.seedDataBase(PagesDataProviderBook7_25.dataItemPagesList);
                break;
            case 726:
                pagesDataSource.seedDataBase(PagesDataProviderBook7_26.dataItemPagesList);
                break;
            case 727:
                pagesDataSource.seedDataBase(PagesDataProviderBook7_27.dataItemPagesList);
                break;
            case 728:
                pagesDataSource.seedDataBase(PagesDataProviderBook7_28.dataItemPagesList);
                break;
            case 729:
                pagesDataSource.seedDataBase(PagesDataProviderBook7_29.dataItemPagesList);
                break;
            case 730:
                pagesDataSource.seedDataBase(PagesDataProviderBook7_30.dataItemPagesList);
                break;
            case 731:
                pagesDataSource.seedDataBase(PagesDataProviderBook7_31.dataItemPagesList);
                break;
            case 732:
                pagesDataSource.seedDataBase(PagesDataProviderBook7_32.dataItemPagesList);
                break;
            case 733:
                pagesDataSource.seedDataBase(PagesDataProviderBook7_33.dataItemPagesList);
                break;
            case 734:
                pagesDataSource.seedDataBase(PagesDataProviderBook7_34.dataItemPagesList);
                break;
            case 735:
                pagesDataSource.seedDataBase(PagesDataProviderBook7_35.dataItemPagesList);
                break;
            case 736:
                pagesDataSource.seedDataBase(PagesDataProviderBook7_36.dataItemPagesList);
                break;
            case 737:
                pagesDataSource.seedDataBase(PagesDataProviderBook7_37.dataItemPagesList);
                break;
        }
    }
}
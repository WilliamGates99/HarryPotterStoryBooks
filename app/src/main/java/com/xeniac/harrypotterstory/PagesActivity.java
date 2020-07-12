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

        if (chapter.getBookId() == 1) {
            seedPagesBook1();
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
        }
    }
}
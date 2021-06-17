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
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook2.PagesDataProviderBook2_1;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook2.PagesDataProviderBook2_2;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook2.PagesDataProviderBook2_3;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook3.PagesDataProviderBook3_1;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook3.PagesDataProviderBook3_2;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook3.PagesDataProviderBook3_3;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook4.PagesDataProviderBook4_1;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook4.PagesDataProviderBook4_2;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook4.PagesDataProviderBook4_3;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook4.PagesDataProviderBook4_4;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook4.PagesDataProviderBook4_5;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook4.PagesDataProviderBook4_6;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook5.PagesDataProviderBook5_1;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook5.PagesDataProviderBook5_2;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook5.PagesDataProviderBook5_3;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook5.PagesDataProviderBook5_4;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook5.PagesDataProviderBook5_5;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook6.PagesDataProviderBook6_1;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook6.PagesDataProviderBook6_2;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook6.PagesDataProviderBook6_3;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook6.PagesDataProviderBook6_4;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook7.PagesDataProviderBook7_1;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook7.PagesDataProviderBook7_2;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook7.PagesDataProviderBook7_3;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook7.PagesDataProviderBook7_4;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook7.PagesDataProviderBook7_5;
import com.xeniac.harrypotterstory.database.booksDataBase.BooksDataSource;
import com.xeniac.harrypotterstory.database.chaptersDataBase.ChaptersDataSource;
import com.xeniac.harrypotterstory.database.pagesDataBase.PagesDataSource;
import com.xeniac.harrypotterstory.models.DataItemChapters;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

public class PagesActivity extends AppCompatActivity {

    private BooksDataSource booksDataSource;
    private ChaptersDataSource chaptersDataSource;
    private PagesDataSource pagesDataSource;

    private DataItemChapters chapter;

    private NestedScrollView nestedScrollView;
    private ImageButton bookmarkGrayIB, bookmarkBlueIB;
    private ImageButton settingsBlackIB, settingsBlueIB;
    private ImageButton settingsModeDarkIB, settingsModeLightIB;
    private MaterialCardView settingsPanelCV;

    private PagesAdapter pagesAdapter;

    private SharedPreferences settingsPrefs;

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
        pagesInit();
    }

    @Override
    protected void onResume() {
        super.onResume();
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

    private void pagesInit() {
        LocaleModifier localeModifier = new LocaleModifier(this);
        localeModifier.setLocale();

        booksDataSource = new BooksDataSource(this);
        chaptersDataSource = new ChaptersDataSource(this);
        pagesDataSource = new PagesDataSource(this);

        chaptersDataSource.open();
        int chapterId = Objects.requireNonNull(getIntent().getExtras()).getInt(ChaptersAdapter.ITEM_KEY);
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
        pagesDataSource.open();
        RecyclerView pagesRV = findViewById(R.id.rv_pages);
        pagesAdapter = new PagesAdapter(this, pagesDataSource.getAllItems(chapter.getId()));
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

            chaptersDataSource.open();
            chapter.setReadScroll(scrollY);
            chaptersDataSource.updateChapters(chapter);
        });
    }

    public void upOnClick(View view) {
        nestedScrollView.smoothScrollTo(0, 0);
    }

    public void shareOnClick(View view) {
        booksDataSource.open();

        String shareString = String.format(getString(R.string.string_pages_share),
                getResources().getString(chapter.getTitle()),
                getResources().getString(booksDataSource.getBookTitle(chapter.getBookId()))
                , getStoreURL());

        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_TEXT, shareString);
        startActivity(Intent.createChooser(shareIntent, getString(R.string.string_pages_share_chooser)));
    }

    private String getStoreURL() {
        return String.format(getString(R.string.string_pages_share_url), getPackageName());
    }

    public void bookmarkGrayOnClick(View view) {
        chaptersDataSource.open();
        chapter.setFavorite(true);
        chaptersDataSource.updateChapters(chapter);
        bookmarkBlueIB.setVisibility(View.VISIBLE);
        bookmarkGrayIB.setVisibility(View.GONE);
    }

    public void bookmarkBlueOnClick(View view) {
        chaptersDataSource.open();
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
        PagesAdapter.FONT_SIZE_COUNTER = (byte) (PagesAdapter.FONT_SIZE_COUNTER + 1);

        if (PagesAdapter.FONT_SIZE_COUNTER < 2) {
            PagesAdapter.FONT_SIZE_CHANGER = 1;
            pagesAdapter.notifyDataSetChanged();
        } else {
            PagesAdapter.FONT_SIZE_COUNTER = 1;
        }
    }

    public void fontDecreaseOnClick(View view) {
        PagesAdapter.FONT_SIZE_COUNTER = (byte) (PagesAdapter.FONT_SIZE_COUNTER - 1);

        if (PagesAdapter.FONT_SIZE_COUNTER > -2) {
            PagesAdapter.FONT_SIZE_CHANGER = -1;
            pagesAdapter.notifyDataSetChanged();
        } else {
            PagesAdapter.FONT_SIZE_COUNTER = -1;
        }
    }

    private void settingsModeTogglesMethod() {
        settingsModeDarkIB = findViewById(R.id.ib_pages_settings_mode_dark);
        settingsModeLightIB = findViewById(R.id.ib_pages_settings_mode_light);

        settingsPrefs = getSharedPreferences(Constants.PREFERENCE_SETTINGS, MODE_PRIVATE);
        boolean nightMode = settingsPrefs.getBoolean(Constants.PREFERENCE_NIGHT_MODE_KEY, false);

        if (nightMode) {
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
                settingsPrefs.edit().putBoolean(Constants.PREFERENCE_NIGHT_MODE_KEY, false).apply();
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
            });
        }
    }

    private void darkModeToggleMethod() {
        if (settingsModeDarkIB.isPressed()) {
            settingsModeDarkIB.setClickable(false);
        } else {
            settingsModeDarkIB.setOnClickListener(v -> {
                settingsPrefs.edit().putBoolean(Constants.PREFERENCE_NIGHT_MODE_KEY, true).apply();
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
            });
        }
    }

    private void seedPagesData() {
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
        SharedPreferences seedingPrefs = getSharedPreferences(Constants.PREFERENCE_SEEDING, MODE_PRIVATE);

        switch (chapter.getId()) {
            case 11:
                boolean chapter11Seeded = seedingPrefs.getBoolean(Constants.PREFERENCE_CHAPTER_11_SEEDED, false);
                if (!chapter11Seeded) {
                    pagesDataSource.open();
                    pagesDataSource.seedDataBase(PagesDataProviderBook1_1.dataItemPagesList);
                    seedingPrefs.edit().putBoolean(Constants.PREFERENCE_CHAPTER_11_SEEDED, true).apply();
                }
                break;
            case 12:
                boolean chapter12Seeded = seedingPrefs.getBoolean(Constants.PREFERENCE_CHAPTER_12_SEEDED, false);
                if (!chapter12Seeded) {
                    pagesDataSource.open();
                    pagesDataSource.seedDataBase(PagesDataProviderBook1_2.dataItemPagesList);
                    seedingPrefs.edit().putBoolean(Constants.PREFERENCE_CHAPTER_12_SEEDED, true).apply();
                    break;
                }
            case 13:
                boolean chapter13Seeded = seedingPrefs.getBoolean(Constants.PREFERENCE_CHAPTER_13_SEEDED, false);
                if (!chapter13Seeded) {
                    pagesDataSource.open();
                    pagesDataSource.seedDataBase(PagesDataProviderBook1_3.dataItemPagesList);
                    seedingPrefs.edit().putBoolean(Constants.PREFERENCE_CHAPTER_13_SEEDED, true).apply();
                    break;
                }
        }
    }

    private void seedPagesBook2() {
        SharedPreferences seedingPrefs = getSharedPreferences(Constants.PREFERENCE_SEEDING, MODE_PRIVATE);

        switch (chapter.getId()) {
            case 21:
                boolean chapter21Seeded = seedingPrefs.getBoolean(Constants.PREFERENCE_CHAPTER_21_SEEDED, false);
                if (!chapter21Seeded) {
                    pagesDataSource.open();
                    pagesDataSource.seedDataBase(PagesDataProviderBook2_1.dataItemPagesList);
                    seedingPrefs.edit().putBoolean(Constants.PREFERENCE_CHAPTER_21_SEEDED, true).apply();
                    break;
                }
            case 22:
                boolean chapter22Seeded = seedingPrefs.getBoolean(Constants.PREFERENCE_CHAPTER_22_SEEDED, false);
                if (!chapter22Seeded) {
                    pagesDataSource.open();
                    pagesDataSource.seedDataBase(PagesDataProviderBook2_2.dataItemPagesList);
                    seedingPrefs.edit().putBoolean(Constants.PREFERENCE_CHAPTER_22_SEEDED, true).apply();
                }
                break;
            case 23:
                boolean chapter23Seeded = seedingPrefs.getBoolean(Constants.PREFERENCE_CHAPTER_23_SEEDED, false);
                if (!chapter23Seeded) {
                    pagesDataSource.open();
                    pagesDataSource.seedDataBase(PagesDataProviderBook2_3.dataItemPagesList);
                    seedingPrefs.edit().putBoolean(Constants.PREFERENCE_CHAPTER_23_SEEDED, true).apply();
                }
                break;
        }
    }

    private void seedPagesBook3() {
        SharedPreferences seedingPrefs = getSharedPreferences(Constants.PREFERENCE_SEEDING, MODE_PRIVATE);

        switch (chapter.getId()) {
            case 31:
                boolean chapter31Seeded = seedingPrefs.getBoolean(Constants.PREFERENCE_CHAPTER_31_SEEDED, false);
                if (!chapter31Seeded) {
                    pagesDataSource.open();
                    pagesDataSource.seedDataBase(PagesDataProviderBook3_1.dataItemPagesList);
                    seedingPrefs.edit().putBoolean(Constants.PREFERENCE_CHAPTER_31_SEEDED, true).apply();
                }
                break;
            case 32:
                boolean chapter32Seeded = seedingPrefs.getBoolean(Constants.PREFERENCE_CHAPTER_32_SEEDED, false);
                if (!chapter32Seeded) {
                    pagesDataSource.open();
                    pagesDataSource.seedDataBase(PagesDataProviderBook3_2.dataItemPagesList);
                    seedingPrefs.edit().putBoolean(Constants.PREFERENCE_CHAPTER_32_SEEDED, true).apply();
                }
                break;
            case 33:
                boolean chapter33Seeded = seedingPrefs.getBoolean(Constants.PREFERENCE_CHAPTER_33_SEEDED, false);
                if (!chapter33Seeded) {
                    pagesDataSource.open();
                    pagesDataSource.seedDataBase(PagesDataProviderBook3_3.dataItemPagesList);
                    seedingPrefs.edit().putBoolean(Constants.PREFERENCE_CHAPTER_33_SEEDED, true).apply();
                }
                break;
        }
    }

    private void seedPagesBook4() {
        SharedPreferences seedingPrefs = getSharedPreferences(Constants.PREFERENCE_SEEDING, MODE_PRIVATE);

        switch (chapter.getId()) {
            case 41:
                boolean chapter41Seeded = seedingPrefs.getBoolean(Constants.PREFERENCE_CHAPTER_41_SEEDED, false);
                if (!chapter41Seeded) {
                    pagesDataSource.open();
                    pagesDataSource.seedDataBase(PagesDataProviderBook4_1.dataItemPagesList);
                    seedingPrefs.edit().putBoolean(Constants.PREFERENCE_CHAPTER_41_SEEDED, true).apply();
                }
                break;
            case 42:
                boolean chapter42Seeded = seedingPrefs.getBoolean(Constants.PREFERENCE_CHAPTER_42_SEEDED, false);
                if (!chapter42Seeded) {
                    pagesDataSource.open();
                    pagesDataSource.seedDataBase(PagesDataProviderBook4_2.dataItemPagesList);
                    seedingPrefs.edit().putBoolean(Constants.PREFERENCE_CHAPTER_42_SEEDED, true).apply();
                }
                break;
            case 43:
                boolean chapter43Seeded = seedingPrefs.getBoolean(Constants.PREFERENCE_CHAPTER_43_SEEDED, false);
                if (!chapter43Seeded) {
                    pagesDataSource.open();
                    pagesDataSource.seedDataBase(PagesDataProviderBook4_3.dataItemPagesList);
                    seedingPrefs.edit().putBoolean(Constants.PREFERENCE_CHAPTER_43_SEEDED, true).apply();
                }
                break;
            case 44:
                boolean chapter44Seeded = seedingPrefs.getBoolean(Constants.PREFERENCE_CHAPTER_44_SEEDED, false);
                if (!chapter44Seeded) {
                    pagesDataSource.open();
                    pagesDataSource.seedDataBase(PagesDataProviderBook4_4.dataItemPagesList);
                    seedingPrefs.edit().putBoolean(Constants.PREFERENCE_CHAPTER_44_SEEDED, true).apply();
                }
                break;
            case 45:
                boolean chapter45Seeded = seedingPrefs.getBoolean(Constants.PREFERENCE_CHAPTER_45_SEEDED, false);
                if (!chapter45Seeded) {
                    pagesDataSource.open();
                    pagesDataSource.seedDataBase(PagesDataProviderBook4_5.dataItemPagesList);
                    seedingPrefs.edit().putBoolean(Constants.PREFERENCE_CHAPTER_45_SEEDED, true).apply();
                }
                break;
            case 46:
                boolean chapter46Seeded = seedingPrefs.getBoolean(Constants.PREFERENCE_CHAPTER_46_SEEDED, false);
                if (!chapter46Seeded) {
                    pagesDataSource.open();
                    pagesDataSource.seedDataBase(PagesDataProviderBook4_6.dataItemPagesList);
                    seedingPrefs.edit().putBoolean(Constants.PREFERENCE_CHAPTER_46_SEEDED, true).apply();
                }
                break;
        }
    }

    private void seedPagesBook5() {
        SharedPreferences seedingPrefs = getSharedPreferences(Constants.PREFERENCE_SEEDING, MODE_PRIVATE);

        switch (chapter.getId()) {
            case 51:
                boolean chapter51Seeded = seedingPrefs.getBoolean(Constants.PREFERENCE_CHAPTER_51_SEEDED, false);
                if (!chapter51Seeded) {
                    pagesDataSource.open();
                    pagesDataSource.seedDataBase(PagesDataProviderBook5_1.dataItemPagesList);
                    seedingPrefs.edit().putBoolean(Constants.PREFERENCE_CHAPTER_51_SEEDED, true).apply();
                }
                break;
            case 52:
                boolean chapter52Seeded = seedingPrefs.getBoolean(Constants.PREFERENCE_CHAPTER_52_SEEDED, false);
                if (!chapter52Seeded) {
                    pagesDataSource.open();
                    pagesDataSource.seedDataBase(PagesDataProviderBook5_2.dataItemPagesList);
                    seedingPrefs.edit().putBoolean(Constants.PREFERENCE_CHAPTER_52_SEEDED, true).apply();
                }
                break;
            case 53:
                boolean chapter53Seeded = seedingPrefs.getBoolean(Constants.PREFERENCE_CHAPTER_53_SEEDED, false);
                if (!chapter53Seeded) {
                    pagesDataSource.open();
                    pagesDataSource.seedDataBase(PagesDataProviderBook5_3.dataItemPagesList);
                    seedingPrefs.edit().putBoolean(Constants.PREFERENCE_CHAPTER_53_SEEDED, true).apply();
                }
                break;
            case 54:
                boolean chapter54Seeded = seedingPrefs.getBoolean(Constants.PREFERENCE_CHAPTER_54_SEEDED, false);
                if (!chapter54Seeded) {
                    pagesDataSource.open();
                    pagesDataSource.seedDataBase(PagesDataProviderBook5_4.dataItemPagesList);
                    seedingPrefs.edit().putBoolean(Constants.PREFERENCE_CHAPTER_54_SEEDED, true).apply();
                }
                break;
            case 55:
                boolean chapter55Seeded = seedingPrefs.getBoolean(Constants.PREFERENCE_CHAPTER_55_SEEDED, false);
                if (!chapter55Seeded) {
                    pagesDataSource.open();
                    pagesDataSource.seedDataBase(PagesDataProviderBook5_5.dataItemPagesList);
                    seedingPrefs.edit().putBoolean(Constants.PREFERENCE_CHAPTER_55_SEEDED, true).apply();
                }
                break;
        }
    }

    private void seedPagesBook6() {
        SharedPreferences seedingPrefs = getSharedPreferences(Constants.PREFERENCE_SEEDING, MODE_PRIVATE);

        switch (chapter.getId()) {
            case 61:
                boolean chapter61Seeded = seedingPrefs.getBoolean(Constants.PREFERENCE_CHAPTER_61_SEEDED, false);
                if (!chapter61Seeded) {
                    pagesDataSource.open();
                    pagesDataSource.seedDataBase(PagesDataProviderBook6_1.dataItemPagesList);
                    seedingPrefs.edit().putBoolean(Constants.PREFERENCE_CHAPTER_61_SEEDED, true).apply();
                }
                break;
            case 62:
                boolean chapter62Seeded = seedingPrefs.getBoolean(Constants.PREFERENCE_CHAPTER_62_SEEDED, false);
                if (!chapter62Seeded) {
                    pagesDataSource.open();
                    pagesDataSource.seedDataBase(PagesDataProviderBook6_2.dataItemPagesList);
                    seedingPrefs.edit().putBoolean(Constants.PREFERENCE_CHAPTER_62_SEEDED, true).apply();
                }
                break;
            case 63:
                boolean chapter63Seeded = seedingPrefs.getBoolean(Constants.PREFERENCE_CHAPTER_63_SEEDED, false);
                if (!chapter63Seeded) {
                    pagesDataSource.open();
                    pagesDataSource.seedDataBase(PagesDataProviderBook6_3.dataItemPagesList);
                    seedingPrefs.edit().putBoolean(Constants.PREFERENCE_CHAPTER_63_SEEDED, true).apply();
                }
                break;
            case 64:
                boolean chapter64Seeded = seedingPrefs.getBoolean(Constants.PREFERENCE_CHAPTER_64_SEEDED, false);
                if (!chapter64Seeded) {
                    pagesDataSource.open();
                    pagesDataSource.seedDataBase(PagesDataProviderBook6_4.dataItemPagesList);
                    seedingPrefs.edit().putBoolean(Constants.PREFERENCE_CHAPTER_64_SEEDED, true).apply();
                }
                break;
        }
    }

    private void seedPagesBook7() {
        SharedPreferences seedingPrefs = getSharedPreferences(Constants.PREFERENCE_SEEDING, MODE_PRIVATE);

        switch (chapter.getId()) {
            case 71:
                boolean chapter71Seeded = seedingPrefs.getBoolean(Constants.PREFERENCE_CHAPTER_71_SEEDED, false);
                if (!chapter71Seeded) {
                    pagesDataSource.open();
                    pagesDataSource.seedDataBase(PagesDataProviderBook7_1.dataItemPagesList);
                    seedingPrefs.edit().putBoolean(Constants.PREFERENCE_CHAPTER_71_SEEDED, true).apply();
                }
                break;
            case 72:
                boolean chapter72Seeded = seedingPrefs.getBoolean(Constants.PREFERENCE_CHAPTER_72_SEEDED, false);
                if (!chapter72Seeded) {
                    pagesDataSource.open();
                    pagesDataSource.seedDataBase(PagesDataProviderBook7_2.dataItemPagesList);
                    seedingPrefs.edit().putBoolean(Constants.PREFERENCE_CHAPTER_72_SEEDED, true).apply();
                }
                break;
            case 73:
                boolean chapter73Seeded = seedingPrefs.getBoolean(Constants.PREFERENCE_CHAPTER_73_SEEDED, false);
                if (!chapter73Seeded) {
                    pagesDataSource.open();
                    pagesDataSource.seedDataBase(PagesDataProviderBook7_3.dataItemPagesList);
                    seedingPrefs.edit().putBoolean(Constants.PREFERENCE_CHAPTER_73_SEEDED, true).apply();
                }
                break;
            case 74:
                boolean chapter74Seeded = seedingPrefs.getBoolean(Constants.PREFERENCE_CHAPTER_74_SEEDED, false);
                if (!chapter74Seeded) {
                    pagesDataSource.open();
                    pagesDataSource.seedDataBase(PagesDataProviderBook7_4.dataItemPagesList);
                    seedingPrefs.edit().putBoolean(Constants.PREFERENCE_CHAPTER_74_SEEDED, true).apply();
                }
                break;
            case 75:
                boolean chapter75Seeded = seedingPrefs.getBoolean(Constants.PREFERENCE_CHAPTER_75_SEEDED, false);
                if (!chapter75Seeded) {
                    pagesDataSource.open();
                    pagesDataSource.seedDataBase(PagesDataProviderBook7_5.dataItemPagesList);
                    seedingPrefs.edit().putBoolean(Constants.PREFERENCE_CHAPTER_75_SEEDED, true).apply();
                }
                break;
        }
    }
}
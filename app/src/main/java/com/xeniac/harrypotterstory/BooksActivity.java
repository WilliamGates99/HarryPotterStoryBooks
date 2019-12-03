package com.xeniac.harrypotterstory;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.xeniac.harrypotterstory.adapters.BooksAdapter;
import com.xeniac.harrypotterstory.adapters.ChaptersAdapter;
import com.xeniac.harrypotterstory.dataProviders.BooksDataProvider;
import com.xeniac.harrypotterstory.dataProviders.ChaptersDataProvider;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook1.PagesDataProviderBook1_1;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook1.PagesDataProviderBook1_10;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook1.PagesDataProviderBook1_11;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook1.PagesDataProviderBook1_12;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook1.PagesDataProviderBook1_13;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook1.PagesDataProviderBook1_14;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook1.PagesDataProviderBook1_15;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook1.PagesDataProviderBook1_16;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook1.PagesDataProviderBook1_17;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook1.PagesDataProviderBook1_2;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook1.PagesDataProviderBook1_3;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook1.PagesDataProviderBook1_4;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook1.PagesDataProviderBook1_5;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook1.PagesDataProviderBook1_6;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook1.PagesDataProviderBook1_7;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook1.PagesDataProviderBook1_8;
import com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook1.PagesDataProviderBook1_9;
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

import java.io.IOException;
import java.io.InputStream;

public class BooksActivity extends AppCompatActivity {

    public static final String READING_CHECK = "reading_check";
    public static final String READING_CHECK_KEY = "reading_check_key";

    private BooksDataSource booksDataSource;
    private ChaptersDataSource chaptersDataSource;
    private PagesDataSource pagesDataSource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);
        Toolbar toolbar = findViewById(R.id.toolbar_books);
        setSupportActionBar(toolbar);
        booksInitializer();
    }

    @Override
    protected void onResume() {
        super.onResume();
        booksDataSource.open();
        chaptersDataSource.open();
        pagesDataSource.open();
        continueReading();
    }

    @Override
    protected void onPause() {
        super.onPause();
        booksDataSource.close();
        chaptersDataSource.close();
        pagesDataSource.close();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_books, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == R.id.menu_books_favorites) {
            startActivity(new Intent(this, FavoritesActivity.class));
        }

        return super.onOptionsItemSelected(item);
    }

    private void booksInitializer() {
        seedBooksData();
        seedChaptersData();
        seedPagesData();
        booksRecyclerView();
        continueReading();
    }

    private void booksRecyclerView() {
        BooksAdapter booksAdapter = new BooksAdapter(this, booksDataSource.getAllItems());
        RecyclerView booksRV = findViewById(R.id.rv_books);
        booksRV.setHasFixedSize(true);
        booksRV.setAdapter(booksAdapter);
    }

    private void continueReading() {
        SharedPreferences preferences = getSharedPreferences(READING_CHECK, MODE_PRIVATE);
        boolean readingCheck = preferences.getBoolean(READING_CHECK_KEY, false);
        FrameLayout continueFL = findViewById(R.id.fl_books_continue);

        if (!readingCheck) {
            continueFL.setVisibility(View.GONE);
        } else {
            DataItemChapters item = chaptersDataSource.getReadingItem();

            ImageView continueIV = findViewById(R.id.iv_books_continue);
            LinearLayout continueLL = findViewById(R.id.ll_books_continue);
            TextView continueChapterTV = findViewById(R.id.tv_books_continue_chapter_title);
            TextView continueBookTV = findViewById(R.id.tv_books_continue_book_title);
            ProgressBar continuePB = findViewById(R.id.pb_books_continue);

            continueFL.setVisibility(View.VISIBLE);
            continueChapterTV.setText(item.getTitle());
            continueBookTV.setText(booksDataSource.getBookTitle(item.getBookId()));
            continuePB.setProgress(
                    (int) ((float) item.getReadScroll() * 100 / item.getTotalScroll()));

            try {
                String imageFile = booksDataSource.getBookCover(item.getBookId());
                InputStream inputStream = getAssets().open(imageFile);
                Drawable drawable = Drawable.createFromStream(inputStream, null);
                continueIV.setImageDrawable(drawable);
                continueIV.setClipToOutline(true);
            } catch (IOException e) {
                e.printStackTrace();
            }

            continueLL.setOnClickListener(v -> {
                Intent intent = new Intent(BooksActivity.this, PagesActivity.class);
                intent.putExtra(ChaptersAdapter.ITEM_KEY, item);
                startActivity(intent);
            });
        }
    }

    private void seedBooksData() {
        booksDataSource = new BooksDataSource(this);
        booksDataSource.open();
        booksDataSource.seedDataBase(BooksDataProvider.dataItemBooksList);
    }

    private void seedChaptersData() {
        chaptersDataSource = new ChaptersDataSource(this);
        chaptersDataSource.open();
        chaptersDataSource.seedDataBase(ChaptersDataProvider.dataItemChaptersList);
    }

    private void seedPagesData() {
        seedPagesBook1();
        seedPagesBook2();
        seedPagesBook3();
        seedPagesBook4();
        seedPagesBook5();
        seedPagesBook6();
        seedPagesBook7();
    }

    private void seedPagesBook1() {
        pagesDataSource = new PagesDataSource(this);
        pagesDataSource.open();

        pagesDataSource.seedDataBase(PagesDataProviderBook1_1.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook1_2.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook1_3.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook1_4.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook1_5.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook1_6.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook1_7.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook1_8.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook1_9.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook1_10.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook1_11.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook1_12.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook1_13.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook1_14.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook1_15.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook1_16.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook1_17.dataItemPagesList);
    }

    private void seedPagesBook2() {
        pagesDataSource = new PagesDataSource(this);
        pagesDataSource.open();

        pagesDataSource.seedDataBase(PagesDataProviderBook2_1.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook2_2.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook2_3.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook2_4.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook2_5.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook2_6.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook2_7.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook2_8.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook2_9.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook2_10.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook2_11.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook2_12.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook2_13.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook2_14.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook2_15.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook2_16.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook2_17.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook2_18.dataItemPagesList);
    }

    private void seedPagesBook3() {
        pagesDataSource = new PagesDataSource(this);
        pagesDataSource.open();

        pagesDataSource.seedDataBase(PagesDataProviderBook3_1.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook3_2.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook3_3.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook3_4.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook3_5.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook3_6.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook3_7.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook3_8.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook3_9.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook3_10.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook3_11.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook3_12.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook3_13.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook3_14.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook3_15.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook3_16.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook3_17.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook3_18.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook3_19.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook3_20.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook3_21.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook3_22.dataItemPagesList);
    }

    private void seedPagesBook4() {
        pagesDataSource = new PagesDataSource(this);
        pagesDataSource.open();

        pagesDataSource.seedDataBase(PagesDataProviderBook4_1.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook4_2.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook4_3.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook4_4.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook4_5.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook4_6.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook4_7.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook4_8.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook4_9.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook4_10.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook4_11.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook4_12.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook4_13.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook4_14.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook4_15.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook4_16.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook4_17.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook4_18.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook4_19.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook4_20.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook4_21.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook4_22.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook4_23.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook4_24.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook4_25.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook4_26.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook4_27.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook4_28.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook4_29.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook4_30.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook4_31.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook4_32.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook4_33.dataItemPagesList);
    }

    private void seedPagesBook5() {
        pagesDataSource = new PagesDataSource(this);
        pagesDataSource.open();

        pagesDataSource.seedDataBase(PagesDataProviderBook5_1.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook5_2.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook5_3.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook5_4.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook5_5.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook5_6.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook5_7.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook5_8.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook5_9.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook5_10.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook5_11.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook5_12.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook5_13.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook5_14.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook5_15.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook5_16.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook5_17.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook5_18.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook5_19.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook5_20.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook5_21.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook5_22.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook5_23.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook5_24.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook5_25.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook5_26.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook5_27.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook5_28.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook5_29.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook5_30.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook5_31.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook5_32.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook5_33.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook5_34.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook5_35.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook5_36.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook5_37.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook5_38.dataItemPagesList);
    }

    private void seedPagesBook6() {
        pagesDataSource = new PagesDataSource(this);
        pagesDataSource.open();

        pagesDataSource.seedDataBase(PagesDataProviderBook6_1.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook6_2.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook6_3.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook6_4.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook6_5.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook6_6.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook6_7.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook6_8.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook6_9.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook6_10.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook6_11.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook6_12.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook6_13.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook6_14.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook6_15.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook6_16.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook6_17.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook6_18.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook6_19.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook6_20.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook6_21.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook6_22.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook6_23.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook6_24.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook6_25.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook6_26.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook6_27.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook6_28.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook6_29.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook6_30.dataItemPagesList);
    }

    private void seedPagesBook7() {
        pagesDataSource = new PagesDataSource(this);
        pagesDataSource.open();

        pagesDataSource.seedDataBase(PagesDataProviderBook7_1.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook7_2.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook7_3.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook7_4.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook7_5.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook7_6.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook7_7.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook7_8.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook7_9.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook7_10.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook7_11.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook7_12.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook7_13.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook7_14.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook7_15.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook7_16.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook7_17.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook7_18.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook7_19.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook7_20.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook7_21.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook7_22.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook7_23.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook7_24.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook7_25.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook7_26.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook7_27.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook7_28.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook7_29.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook7_30.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook7_31.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook7_32.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook7_33.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook7_34.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook7_35.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook7_36.dataItemPagesList);
        pagesDataSource.seedDataBase(PagesDataProviderBook7_37.dataItemPagesList);
    }
}
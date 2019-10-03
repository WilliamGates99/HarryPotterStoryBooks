package com.xeniac.harrypotterstory.dataProviders;

import com.xeniac.harrypotterstory.R;
import com.xeniac.harrypotterstory.models.DataItemChapters;

import java.util.ArrayList;
import java.util.List;

public class ChaptersDataProvider3 {

    public static List<DataItemChapters> dataItemChaptersList;

    static {
        dataItemChaptersList = new ArrayList<>();

        addItem(new DataItemChapters("chapter_1", "1", R.string.string_book_3_chapters_title_1, "15", R.string.string_books_title_3, false));
        addItem(new DataItemChapters("chapter_2", "2", R.string.string_book_3_chapters_title_2, "15", R.string.string_books_title_3, false));
        addItem(new DataItemChapters("chapter_3", "3", R.string.string_book_3_chapters_title_3, "18", R.string.string_books_title_3, false));
        addItem(new DataItemChapters("chapter_4", "4", R.string.string_book_3_chapters_title_4, "20", R.string.string_books_title_3, false));
        addItem(new DataItemChapters("chapter_5", "5", R.string.string_book_3_chapters_title_5, "27", R.string.string_books_title_3, false));
        addItem(new DataItemChapters("chapter_6", "6", R.string.string_book_3_chapters_title_6, "27", R.string.string_books_title_3, false));
        addItem(new DataItemChapters("chapter_7", "7", R.string.string_book_3_chapters_title_7, "18", R.string.string_books_title_3, false));
        addItem(new DataItemChapters("chapter_8", "8", R.string.string_book_3_chapters_title_8, "21", R.string.string_books_title_3, false));
        addItem(new DataItemChapters("chapter_9", "9", R.string.string_book_3_chapters_title_9, "21", R.string.string_books_title_3, false));
        addItem(new DataItemChapters("chapter_10", "10", R.string.string_book_3_chapters_title_10, "28", R.string.string_books_title_3, false));
        addItem(new DataItemChapters("chapter_11", "11", R.string.string_book_3_chapters_title_11, "22", R.string.string_books_title_3, false));
        addItem(new DataItemChapters("chapter_12", "12", R.string.string_book_3_chapters_title_12, "19", R.string.string_books_title_3, false));
        addItem(new DataItemChapters("chapter_13", "13", R.string.string_book_3_chapters_title_13, "17", R.string.string_books_title_3, false));
        addItem(new DataItemChapters("chapter_14", "14", R.string.string_book_3_chapters_title_14, "22", R.string.string_books_title_3, false));
        addItem(new DataItemChapters("chapter_15", "15", R.string.string_book_3_chapters_title_15, "23", R.string.string_books_title_3, false));
        addItem(new DataItemChapters("chapter_16", "16", R.string.string_book_3_chapters_title_16, "18", R.string.string_books_title_3, false));
        addItem(new DataItemChapters("chapter_17", "17", R.string.string_book_3_chapters_title_17, "17", R.string.string_books_title_3, false));
        addItem(new DataItemChapters("chapter_18", "18", R.string.string_book_3_chapters_title_18, "9", R.string.string_books_title_3, false));
        addItem(new DataItemChapters("chapter_19", "19", R.string.string_book_3_chapters_title_19, "20", R.string.string_books_title_3, false));
        addItem(new DataItemChapters("chapter_20", "20", R.string.string_book_3_chapters_title_20, "8", R.string.string_books_title_3, false));
        addItem(new DataItemChapters("chapter_21", "21", R.string.string_book_3_chapters_title_21, "30", R.string.string_books_title_3, false));
        addItem(new DataItemChapters("chapter_22", "22", R.string.string_book_3_chapters_title_22, "20", R.string.string_books_title_3, false));
    }

    private static void addItem(DataItemChapters item) {
        dataItemChaptersList.add(item);
    }
}
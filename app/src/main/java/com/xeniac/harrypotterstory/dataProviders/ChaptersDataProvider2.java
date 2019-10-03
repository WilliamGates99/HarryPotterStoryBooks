package com.xeniac.harrypotterstory.dataProviders;

import com.xeniac.harrypotterstory.R;
import com.xeniac.harrypotterstory.models.DataItemChapters;

import java.util.ArrayList;
import java.util.List;

public class ChaptersDataProvider2 {

    public static List<DataItemChapters> dataItemChaptersList;

    static {
        dataItemChaptersList = new ArrayList<>();

        addItem(new DataItemChapters("chapter_1", "1", R.string.string_book_2_chapters_title_1, "11", R.string.string_books_title_2, false));
        addItem(new DataItemChapters("chapter_2", "2", R.string.string_book_2_chapters_title_2, "12", R.string.string_books_title_2, false));
        addItem(new DataItemChapters("chapter_3", "3", R.string.string_book_2_chapters_title_3, "18", R.string.string_books_title_2, false));
        addItem(new DataItemChapters("chapter_4", "4", R.string.string_book_2_chapters_title_4, "23", R.string.string_books_title_2, false));
        addItem(new DataItemChapters("chapter_5", "5", R.string.string_book_2_chapters_title_5, "21", R.string.string_books_title_2, false));
        addItem(new DataItemChapters("chapter_6", "6", R.string.string_book_2_chapters_title_6, "18", R.string.string_books_title_2, false));
        addItem(new DataItemChapters("chapter_7", "7", R.string.string_book_2_chapters_title_7, "18", R.string.string_books_title_2, false));
        addItem(new DataItemChapters("chapter_8", "8", R.string.string_book_2_chapters_title_8, "18", R.string.string_books_title_2, false));
        addItem(new DataItemChapters("chapter_9", "9", R.string.string_book_2_chapters_title_9, "21", R.string.string_books_title_2, false));
        addItem(new DataItemChapters("chapter_10", "10", R.string.string_book_2_chapters_title_10, "21", R.string.string_books_title_2, false));
        addItem(new DataItemChapters("chapter_11", "11", R.string.string_book_2_chapters_title_11, "23", R.string.string_books_title_2, false));
        addItem(new DataItemChapters("chapter_12", "12", R.string.string_book_2_chapters_title_12, "22", R.string.string_books_title_2, false));
        addItem(new DataItemChapters("chapter_13", "13", R.string.string_book_2_chapters_title_13, "33", R.string.string_books_title_2, false));
        addItem(new DataItemChapters("chapter_14", "14", R.string.string_book_2_chapters_title_14, "16", R.string.string_books_title_2, false));
        addItem(new DataItemChapters("chapter_15", "15", R.string.string_book_2_chapters_title_15, "18", R.string.string_books_title_2, false));
        addItem(new DataItemChapters("chapter_16", "16", R.string.string_book_2_chapters_title_16, "23", R.string.string_books_title_2, false));
        addItem(new DataItemChapters("chapter_17", "17", R.string.string_book_2_chapters_title_17, "21", R.string.string_books_title_2, false));
        addItem(new DataItemChapters("chapter_18", "18", R.string.string_book_2_chapters_title_18, "15", R.string.string_books_title_2, false));
    }

    private static void addItem(DataItemChapters item) {
        dataItemChaptersList.add(item);
    }
}
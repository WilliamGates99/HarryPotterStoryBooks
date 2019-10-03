package com.xeniac.harrypotterstory.dataProviders;

import com.xeniac.harrypotterstory.R;
import com.xeniac.harrypotterstory.models.DataItemChapters;

import java.util.ArrayList;
import java.util.List;

public class ChaptersDataProvider1 {

    public static List<DataItemChapters> dataItemChaptersList;

    static {
        dataItemChaptersList = new ArrayList<>();

        addItem(new DataItemChapters("chapter_1", "1", R.string.string_book_1_chapters_title_1, "17", R.string.string_books_title_1, false));
        addItem(new DataItemChapters("chapter_2", "2", R.string.string_book_1_chapters_title_2, "13", R.string.string_books_title_1, false));
        addItem(new DataItemChapters("chapter_3", "3", R.string.string_book_1_chapters_title_3, "15", R.string.string_books_title_1, false));
        addItem(new DataItemChapters("chapter_4", "4", R.string.string_book_1_chapters_title_4, "15", R.string.string_books_title_1, false));
        addItem(new DataItemChapters("chapter_5", "5", R.string.string_book_1_chapters_title_5, "27", R.string.string_books_title_1, false));
        addItem(new DataItemChapters("chapter_6", "6", R.string.string_book_1_chapters_title_6, "25", R.string.string_books_title_1, false));
        addItem(new DataItemChapters("chapter_7", "7", R.string.string_book_1_chapters_title_7, "18", R.string.string_books_title_1, false));
        addItem(new DataItemChapters("chapter_8", "8", R.string.string_book_1_chapters_title_8, "12", R.string.string_books_title_1, false));
        addItem(new DataItemChapters("chapter_9", "9", R.string.string_book_1_chapters_title_9, "20", R.string.string_books_title_1, false));
        addItem(new DataItemChapters("chapter_10", "10", R.string.string_book_1_chapters_title_10, "17", R.string.string_books_title_1, false));
        addItem(new DataItemChapters("chapter_11", "11", R.string.string_book_1_chapters_title_11, "14", R.string.string_books_title_1, false));
        addItem(new DataItemChapters("chapter_12", "12", R.string.string_book_1_chapters_title_12, "21", R.string.string_books_title_1, false));
        addItem(new DataItemChapters("chapter_13", "13", R.string.string_book_1_chapters_title_13, "13", R.string.string_books_title_1, false));
        addItem(new DataItemChapters("chapter_14", "14", R.string.string_book_1_chapters_title_14, "14", R.string.string_books_title_1, false));
        addItem(new DataItemChapters("chapter_15", "15", R.string.string_book_1_chapters_title_15, "20", R.string.string_books_title_1, false));
        addItem(new DataItemChapters("chapter_16", "16", R.string.string_book_1_chapters_title_16, "26", R.string.string_books_title_1, false));
        addItem(new DataItemChapters("chapter_17", "17", R.string.string_book_1_chapters_title_17, "22", R.string.string_books_title_1, false));
    }

    private static void addItem(DataItemChapters item) {
        dataItemChaptersList.add(item);
    }
}

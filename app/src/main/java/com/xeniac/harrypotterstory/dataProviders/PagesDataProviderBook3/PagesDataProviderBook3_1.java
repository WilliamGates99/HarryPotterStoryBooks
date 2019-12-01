package com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook3;

import com.xeniac.harrypotterstory.R;
import com.xeniac.harrypotterstory.models.DataItemPages;

import java.util.ArrayList;
import java.util.List;

public class PagesDataProviderBook3_1 {

    public static List<DataItemPages> dataItemPagesList;

    static {
        dataItemPagesList = new ArrayList<>();

        addItem(new DataItemPages(311, 1, R.string.string_book_3_chapter_1_page_1, 31));
        addItem(new DataItemPages(312, 2, R.string.string_book_3_chapter_1_page_2, 31));
        addItem(new DataItemPages(313, 3, R.string.string_book_3_chapter_1_page_3, 31));
        addItem(new DataItemPages(314, 4, R.string.string_book_3_chapter_1_page_4, 31));
        addItem(new DataItemPages(315, 5, R.string.string_book_3_chapter_1_page_5, 31));
        addItem(new DataItemPages(316, 6, R.string.string_book_3_chapter_1_page_6, 31));
        addItem(new DataItemPages(317, 7, R.string.string_book_3_chapter_1_page_7, 31));
        addItem(new DataItemPages(318, 8, R.string.string_book_3_chapter_1_page_8, 31));
        addItem(new DataItemPages(319, 9, R.string.string_book_3_chapter_1_page_9, 31));
        addItem(new DataItemPages(3110, 10, R.string.string_book_3_chapter_1_page_10, 31));
        addItem(new DataItemPages(3111, 11, R.string.string_book_3_chapter_1_page_11, 31));
        addItem(new DataItemPages(3112, 12, R.string.string_book_3_chapter_1_page_12, 31));
        addItem(new DataItemPages(3113, 13, R.string.string_book_3_chapter_1_page_13, 31));
        addItem(new DataItemPages(3114, 14, R.string.string_book_3_chapter_1_page_14, 31));
        addItem(new DataItemPages(3115, 15, R.string.string_book_3_chapter_1_page_15, 31));
    }

    private static void addItem(DataItemPages item) {
        dataItemPagesList.add(item);
    }
}
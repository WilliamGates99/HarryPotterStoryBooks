package com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook3;

import com.xeniac.harrypotterstory.R;
import com.xeniac.harrypotterstory.models.DataItemPages;

import java.util.ArrayList;
import java.util.List;

public class PagesDataProviderBook3_3 {

    public static List<DataItemPages> dataItemPagesList;

    static {
        dataItemPagesList = new ArrayList<>();

        addItem(new DataItemPages(331, 1, R.string.string_book_3_chapter_3_page_1, 33));
        addItem(new DataItemPages(332, 2, R.string.string_book_3_chapter_3_page_2, 33));
        addItem(new DataItemPages(333, 3, R.string.string_book_3_chapter_3_page_3, 33));
        addItem(new DataItemPages(334, 4, R.string.string_book_3_chapter_3_page_4, 33));
        addItem(new DataItemPages(335, 5, R.string.string_book_3_chapter_3_page_5, 33));
        addItem(new DataItemPages(336, 6, R.string.string_book_3_chapter_3_page_6, 33));
        addItem(new DataItemPages(337, 7, R.string.string_book_3_chapter_3_page_7, 33));
        addItem(new DataItemPages(338, 8, R.string.string_book_3_chapter_3_page_8, 33));
        addItem(new DataItemPages(339, 9, R.string.string_book_3_chapter_3_page_9, 33));
        addItem(new DataItemPages(3310, 10, R.string.string_book_3_chapter_3_page_10, 33));
        addItem(new DataItemPages(3311, 11, R.string.string_book_3_chapter_3_page_11, 33));
        addItem(new DataItemPages(3312, 12, R.string.string_book_3_chapter_3_page_12, 33));
        addItem(new DataItemPages(3313, 13, R.string.string_book_3_chapter_3_page_13, 33));
        addItem(new DataItemPages(3314, 14, R.string.string_book_3_chapter_3_page_14, 33));
        addItem(new DataItemPages(3315, 15, R.string.string_book_3_chapter_3_page_15, 33));
        addItem(new DataItemPages(3316, 16, R.string.string_book_3_chapter_3_page_16, 33));
        addItem(new DataItemPages(3317, 17, R.string.string_book_3_chapter_3_page_17, 33));
        addItem(new DataItemPages(3318, 18, R.string.string_book_3_chapter_3_page_18, 33));
    }

    private static void addItem(DataItemPages item) {
        dataItemPagesList.add(item);
    }
}
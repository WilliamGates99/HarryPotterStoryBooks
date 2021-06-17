package com.xeniac.harrypotterstorybooks.dataProviders.PagesDataProviderBook3;

import com.xeniac.harrypotterstorybooks.R;
import com.xeniac.harrypotterstorybooks.models.DataItemPages;

import java.util.ArrayList;
import java.util.List;

public class PagesDataProviderBook3_2 {

    public static List<DataItemPages> dataItemPagesList;

    static {
        dataItemPagesList = new ArrayList<>();

        addItem(new DataItemPages(321, 1, R.string.string_book_3_chapter_2_page_1, 32));
        addItem(new DataItemPages(322, 2, R.string.string_book_3_chapter_2_page_2, 32));
        addItem(new DataItemPages(323, 3, R.string.string_book_3_chapter_2_page_3, 32));
        addItem(new DataItemPages(324, 4, R.string.string_book_3_chapter_2_page_4, 32));
        addItem(new DataItemPages(325, 5, R.string.string_book_3_chapter_2_page_5, 32));
        addItem(new DataItemPages(326, 6, R.string.string_book_3_chapter_2_page_6, 32));
        addItem(new DataItemPages(327, 7, R.string.string_book_3_chapter_2_page_7, 32));
        addItem(new DataItemPages(328, 8, R.string.string_book_3_chapter_2_page_8, 32));
        addItem(new DataItemPages(329, 9, R.string.string_book_3_chapter_2_page_9, 32));
        addItem(new DataItemPages(3210, 10, R.string.string_book_3_chapter_2_page_10, 32));
        addItem(new DataItemPages(3211, 11, R.string.string_book_3_chapter_2_page_11, 32));
        addItem(new DataItemPages(3212, 12, R.string.string_book_3_chapter_2_page_12, 32));
        addItem(new DataItemPages(3213, 13, R.string.string_book_3_chapter_2_page_13, 32));
        addItem(new DataItemPages(3214, 14, R.string.string_book_3_chapter_2_page_14, 32));
        addItem(new DataItemPages(3215, 15, R.string.string_book_3_chapter_2_page_15, 32));
    }

    private static void addItem(DataItemPages item) {
        dataItemPagesList.add(item);
    }
}
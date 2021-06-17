package com.xeniac.harrypotterstorybooks.dataProviders.PagesDataProviderBook4;

import com.xeniac.harrypotterstorybooks.R;
import com.xeniac.harrypotterstorybooks.models.DataItemPages;

import java.util.ArrayList;
import java.util.List;

public class PagesDataProviderBook4_5 {

    public static List<DataItemPages> dataItemPagesList;

    static {
        dataItemPagesList = new ArrayList<>();

        addItem(new DataItemPages(451, 1, R.string.string_book_4_chapter_5_page_1, 45));
        addItem(new DataItemPages(452, 2, R.string.string_book_4_chapter_5_page_2, 45));
        addItem(new DataItemPages(453, 3, R.string.string_book_4_chapter_5_page_3, 45));
        addItem(new DataItemPages(454, 4, R.string.string_book_4_chapter_5_page_4, 45));
        addItem(new DataItemPages(455, 5, R.string.string_book_4_chapter_5_page_5, 45));
        addItem(new DataItemPages(456, 6, R.string.string_book_4_chapter_5_page_6, 45));
        addItem(new DataItemPages(457, 7, R.string.string_book_4_chapter_5_page_7, 45));
        addItem(new DataItemPages(458, 8, R.string.string_book_4_chapter_5_page_8, 45));
        addItem(new DataItemPages(459, 9, R.string.string_book_4_chapter_5_page_9, 45));
        addItem(new DataItemPages(4510, 10, R.string.string_book_4_chapter_5_page_10, 45));
        addItem(new DataItemPages(4511, 11, R.string.string_book_4_chapter_5_page_11, 45));
        addItem(new DataItemPages(4512, 12, R.string.string_book_4_chapter_5_page_12, 45));
        addItem(new DataItemPages(4513, 13, R.string.string_book_4_chapter_5_page_13, 45));
        addItem(new DataItemPages(4514, 14, R.string.string_book_4_chapter_5_page_14, 45));
    }

    private static void addItem(DataItemPages item) {
        dataItemPagesList.add(item);
    }
}
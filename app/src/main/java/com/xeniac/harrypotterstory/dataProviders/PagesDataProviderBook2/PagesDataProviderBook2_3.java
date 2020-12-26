package com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook2;

import com.xeniac.harrypotterstory.R;
import com.xeniac.harrypotterstory.models.DataItemPages;

import java.util.ArrayList;
import java.util.List;

public class PagesDataProviderBook2_3 {

    public static List<DataItemPages> dataItemPagesList;

    static {
        dataItemPagesList = new ArrayList<>();

        addItem(new DataItemPages(231, 1, R.string.string_book_2_chapter_3_page_1, 23));
        addItem(new DataItemPages(232, 2, R.string.string_book_2_chapter_3_page_2, 23));
        addItem(new DataItemPages(233, 3, R.string.string_book_2_chapter_3_page_3, 23));
        addItem(new DataItemPages(234, 4, R.string.string_book_2_chapter_3_page_4, 23));
        addItem(new DataItemPages(235, 5, R.string.string_book_2_chapter_3_page_5, 23));
        addItem(new DataItemPages(236, 6, R.string.string_book_2_chapter_3_page_6, 23));
        addItem(new DataItemPages(237, 7, R.string.string_book_2_chapter_3_page_7, 23));
        addItem(new DataItemPages(238, 8, R.string.string_book_2_chapter_3_page_8, 23));
        addItem(new DataItemPages(239, 9, R.string.string_book_2_chapter_3_page_9, 23));
        addItem(new DataItemPages(2310, 10, R.string.string_book_2_chapter_3_page_10, 23));
    }

    private static void addItem(DataItemPages item) {
        dataItemPagesList.add(item);
    }
}
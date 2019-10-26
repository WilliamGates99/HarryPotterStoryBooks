package com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook1;

import com.xeniac.harrypotterstory.R;
import com.xeniac.harrypotterstory.models.DataItemPages;

import java.util.ArrayList;
import java.util.List;

public class PagesDataProviderBook1_8 {

    public static List<DataItemPages> dataItemPagesList;

    static {
        dataItemPagesList = new ArrayList<>();

        addItem(new DataItemPages(181, 1, R.string.string_book_1_chapter_8_page_1, 18, false));
        addItem(new DataItemPages(182, 2, R.string.string_book_1_chapter_8_page_2, 18, false));
        addItem(new DataItemPages(183, 3, R.string.string_book_1_chapter_8_page_3, 18, false));
        addItem(new DataItemPages(184, 4, R.string.string_book_1_chapter_8_page_4, 18, false));
        addItem(new DataItemPages(185, 5, R.string.string_book_1_chapter_8_page_5, 18, false));
        addItem(new DataItemPages(186, 6, R.string.string_book_1_chapter_8_page_6, 18, false));
        addItem(new DataItemPages(187, 7, R.string.string_book_1_chapter_8_page_7, 18, false));
        addItem(new DataItemPages(188, 8, R.string.string_book_1_chapter_8_page_8, 18, false));
        addItem(new DataItemPages(189, 9, R.string.string_book_1_chapter_8_page_9, 18, false));
        addItem(new DataItemPages(1810, 10, R.string.string_book_1_chapter_8_page_10, 18, false));
        addItem(new DataItemPages(1811, 11, R.string.string_book_1_chapter_8_page_11, 18, false));
        addItem(new DataItemPages(1812, 12, R.string.string_book_1_chapter_8_page_12, 18, false));
    }

    private static void addItem(DataItemPages item) {
        dataItemPagesList.add(item);
    }
}
package com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook1;

import com.xeniac.harrypotterstory.R;
import com.xeniac.harrypotterstory.models.DataItemPages;

import java.util.ArrayList;
import java.util.List;

public class PagesDataProviderBook1_4 {

    public static List<DataItemPages> dataItemPagesList;

    static {
        dataItemPagesList = new ArrayList<>();

        addItem(new DataItemPages(141, 1, R.string.string_book_1_chapter_4_page_1, 14, false));
        addItem(new DataItemPages(142, 2, R.string.string_book_1_chapter_4_page_2, 14, false));
        addItem(new DataItemPages(143, 3, R.string.string_book_1_chapter_4_page_3, 14, false));
        addItem(new DataItemPages(144, 4, R.string.string_book_1_chapter_4_page_4, 14, false));
        addItem(new DataItemPages(145, 5, R.string.string_book_1_chapter_4_page_5, 14, false));
        addItem(new DataItemPages(146, 6, R.string.string_book_1_chapter_4_page_6, 14, false));
        addItem(new DataItemPages(147, 7, R.string.string_book_1_chapter_4_page_7, 14, false));
        addItem(new DataItemPages(148, 8, R.string.string_book_1_chapter_4_page_8, 14, false));
        addItem(new DataItemPages(149, 9, R.string.string_book_1_chapter_4_page_9, 14, false));
        addItem(new DataItemPages(1410, 10, R.string.string_book_1_chapter_4_page_10, 14, false));
        addItem(new DataItemPages(1411, 11, R.string.string_book_1_chapter_4_page_11, 14, false));
        addItem(new DataItemPages(1412, 12, R.string.string_book_1_chapter_4_page_12, 14, false));
        addItem(new DataItemPages(1413, 13, R.string.string_book_1_chapter_4_page_13, 14, false));
        addItem(new DataItemPages(1414, 14, R.string.string_book_1_chapter_4_page_14, 14, false));
        addItem(new DataItemPages(1415, 15, R.string.string_book_1_chapter_4_page_15, 14, false));
    }

    private static void addItem(DataItemPages item) {
        dataItemPagesList.add(item);
    }
}
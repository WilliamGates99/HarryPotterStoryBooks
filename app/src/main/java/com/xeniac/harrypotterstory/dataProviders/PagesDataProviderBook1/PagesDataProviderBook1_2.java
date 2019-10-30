package com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook1;

import com.xeniac.harrypotterstory.R;
import com.xeniac.harrypotterstory.models.DataItemPages;

import java.util.ArrayList;
import java.util.List;

public class PagesDataProviderBook1_2 {

    public static List<DataItemPages> dataItemPagesList;

    static {
        dataItemPagesList = new ArrayList<>();

        addItem(new DataItemPages(121, 1, R.string.string_book_1_chapter_2_page_1, 12));
        addItem(new DataItemPages(122, 2, R.string.string_book_1_chapter_2_page_2, 12));
        addItem(new DataItemPages(123, 3, R.string.string_book_1_chapter_2_page_3, 12));
        addItem(new DataItemPages(124, 4, R.string.string_book_1_chapter_2_page_4, 12));
        addItem(new DataItemPages(125, 5, R.string.string_book_1_chapter_2_page_5, 12));
        addItem(new DataItemPages(126, 6, R.string.string_book_1_chapter_2_page_6, 12));
        addItem(new DataItemPages(127, 7, R.string.string_book_1_chapter_2_page_7, 12));
        addItem(new DataItemPages(128, 8, R.string.string_book_1_chapter_2_page_8, 12));
        addItem(new DataItemPages(129, 9, R.string.string_book_1_chapter_2_page_9, 12));
        addItem(new DataItemPages(1210, 10, R.string.string_book_1_chapter_2_page_10, 12));
        addItem(new DataItemPages(1211, 11, R.string.string_book_1_chapter_2_page_11, 12));
        addItem(new DataItemPages(1212, 12, R.string.string_book_1_chapter_2_page_12, 12));
        addItem(new DataItemPages(1213, 13, R.string.string_book_1_chapter_2_page_13, 12));
    }

    private static void addItem(DataItemPages item) {
        dataItemPagesList.add(item);
    }
}
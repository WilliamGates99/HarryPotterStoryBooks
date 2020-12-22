package com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook5;

import com.xeniac.harrypotterstory.R;
import com.xeniac.harrypotterstory.models.DataItemPages;

import java.util.ArrayList;
import java.util.List;

public class PagesDataProviderBook5_8 {

    public static List<DataItemPages> dataItemPagesList;

    static {
        dataItemPagesList = new ArrayList<>();

        addItem(new DataItemPages(581, 1, R.string.string_book_5_chapter_8_page_1, 58));
        addItem(new DataItemPages(582, 2, R.string.string_book_5_chapter_8_page_2, 58));
        addItem(new DataItemPages(583, 3, R.string.string_book_5_chapter_8_page_3, 58));
        addItem(new DataItemPages(584, 4, R.string.string_book_5_chapter_8_page_4, 58));
        addItem(new DataItemPages(585, 5, R.string.string_book_5_chapter_8_page_5, 58));
        addItem(new DataItemPages(586, 6, R.string.string_book_5_chapter_8_page_6, 58));
        addItem(new DataItemPages(587, 7, R.string.string_book_5_chapter_8_page_7, 58));
        addItem(new DataItemPages(588, 8, R.string.string_book_5_chapter_8_page_8, 58));
        addItem(new DataItemPages(589, 9, R.string.string_book_5_chapter_8_page_9, 58));
        addItem(new DataItemPages(5810, 10, R.string.string_book_5_chapter_8_page_10, 58));
        addItem(new DataItemPages(5811, 11, R.string.string_book_5_chapter_8_page_11, 58));
        addItem(new DataItemPages(5812, 12, R.string.string_book_5_chapter_8_page_12, 58));
        addItem(new DataItemPages(5813, 13, R.string.string_book_5_chapter_8_page_13, 58));
        addItem(new DataItemPages(5814, 14, R.string.string_book_5_chapter_8_page_14, 58));
        addItem(new DataItemPages(5815, 15, R.string.string_book_5_chapter_8_page_15, 58));
    }

    private static void addItem(DataItemPages item) {
        dataItemPagesList.add(item);
    }
}
package com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook4;

import com.xeniac.harrypotterstory.R;
import com.xeniac.harrypotterstory.models.DataItemPages;

import java.util.ArrayList;
import java.util.List;

public class PagesDataProviderBook4_10 {

    public static List<DataItemPages> dataItemPagesList;

    static {
        dataItemPagesList = new ArrayList<>();

        addItem(new DataItemPages(4101, 1, R.string.string_book_4_chapter_10_page_1, 410));
        addItem(new DataItemPages(4102, 2, R.string.string_book_4_chapter_10_page_2, 410));
        addItem(new DataItemPages(4103, 3, R.string.string_book_4_chapter_10_page_3, 410));
        addItem(new DataItemPages(4104, 4, R.string.string_book_4_chapter_10_page_4, 410));
        addItem(new DataItemPages(4105, 5, R.string.string_book_4_chapter_10_page_5, 410));
        addItem(new DataItemPages(4106, 6, R.string.string_book_4_chapter_10_page_6, 410));
        addItem(new DataItemPages(4107, 7, R.string.string_book_4_chapter_10_page_7, 410));
        addItem(new DataItemPages(4108, 8, R.string.string_book_4_chapter_10_page_8, 410));
        addItem(new DataItemPages(4109, 9, R.string.string_book_4_chapter_10_page_9, 410));
        addItem(new DataItemPages(41010, 10, R.string.string_book_4_chapter_10_page_10, 410));
        addItem(new DataItemPages(41011, 11, R.string.string_book_4_chapter_10_page_11, 410));
        addItem(new DataItemPages(41012, 12, R.string.string_book_4_chapter_10_page_12, 410));
        addItem(new DataItemPages(41013, 13, R.string.string_book_4_chapter_10_page_13, 410));
    }

    private static void addItem(DataItemPages item) {
        dataItemPagesList.add(item);
    }
}
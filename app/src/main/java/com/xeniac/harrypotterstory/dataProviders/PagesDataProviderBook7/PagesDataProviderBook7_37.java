package com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook7;

import com.xeniac.harrypotterstory.R;
import com.xeniac.harrypotterstory.models.DataItemPages;

import java.util.ArrayList;
import java.util.List;

public class PagesDataProviderBook7_37 {

    public static List<DataItemPages> dataItemPagesList;

    static {
        dataItemPagesList = new ArrayList<>();

        addItem(new DataItemPages(7371, 1, R.string.string_book_7_chapter_37_page_1, 737));
        addItem(new DataItemPages(7372, 2, R.string.string_book_7_chapter_37_page_2, 737));
        addItem(new DataItemPages(7373, 3, R.string.string_book_7_chapter_37_page_3, 737));
        addItem(new DataItemPages(7374, 4, R.string.string_book_7_chapter_37_page_4, 737));
        addItem(new DataItemPages(7375, 5, R.string.string_book_7_chapter_37_page_5, 737));
        addItem(new DataItemPages(7376, 6, R.string.string_book_7_chapter_37_page_6, 737));
        addItem(new DataItemPages(7377, 7, R.string.string_book_7_chapter_37_page_7, 737));
    }

    private static void addItem(DataItemPages item) {
        dataItemPagesList.add(item);
    }
}
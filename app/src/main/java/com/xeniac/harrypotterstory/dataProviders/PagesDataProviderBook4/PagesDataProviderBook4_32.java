package com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook4;

import com.xeniac.harrypotterstory.R;
import com.xeniac.harrypotterstory.models.DataItemPages;

import java.util.ArrayList;
import java.util.List;

public class PagesDataProviderBook4_32 {

    public static List<DataItemPages> dataItemPagesList;

    static {
        dataItemPagesList = new ArrayList<>();

        addItem(new DataItemPages(4321, 1, R.string.string_book_4_chapter_32_page_1, 432));
        addItem(new DataItemPages(4322, 2, R.string.string_book_4_chapter_32_page_2, 432));
        addItem(new DataItemPages(4323, 3, R.string.string_book_4_chapter_32_page_3, 432));
        addItem(new DataItemPages(4324, 4, R.string.string_book_4_chapter_32_page_4, 432));
        addItem(new DataItemPages(4325, 5, R.string.string_book_4_chapter_32_page_5, 432));
        addItem(new DataItemPages(4326, 6, R.string.string_book_4_chapter_32_page_6, 432));
        addItem(new DataItemPages(4327, 7, R.string.string_book_4_chapter_32_page_7, 432));
        addItem(new DataItemPages(4328, 8, R.string.string_book_4_chapter_32_page_8, 432));
    }

    private static void addItem(DataItemPages item) {
        dataItemPagesList.add(item);
    }
}
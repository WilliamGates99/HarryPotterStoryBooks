package com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook4;

import com.xeniac.harrypotterstory.R;
import com.xeniac.harrypotterstory.models.DataItemPages;

import java.util.ArrayList;
import java.util.List;

public class PagesDataProviderBook4_6 {

    public static List<DataItemPages> dataItemPagesList;

    static {
        dataItemPagesList = new ArrayList<>();

        addItem(new DataItemPages(461, 1, R.string.string_book_4_chapter_6_page_1, 46));
        addItem(new DataItemPages(462, 2, R.string.string_book_4_chapter_6_page_2, 46));
        addItem(new DataItemPages(463, 3, R.string.string_book_4_chapter_6_page_3, 46));
        addItem(new DataItemPages(464, 4, R.string.string_book_4_chapter_6_page_4, 46));
        addItem(new DataItemPages(465, 5, R.string.string_book_4_chapter_6_page_5, 46));
        addItem(new DataItemPages(466, 6, R.string.string_book_4_chapter_6_page_6, 46));
        addItem(new DataItemPages(467, 7, R.string.string_book_4_chapter_6_page_7, 46));
        addItem(new DataItemPages(468, 8, R.string.string_book_4_chapter_6_page_8, 46));
        addItem(new DataItemPages(469, 9, R.string.string_book_4_chapter_6_page_9, 46));
        addItem(new DataItemPages(4610, 10, R.string.string_book_4_chapter_6_page_10, 46));
    }

    private static void addItem(DataItemPages item) {
        dataItemPagesList.add(item);
    }
}
package com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook4;

import com.xeniac.harrypotterstory.R;
import com.xeniac.harrypotterstory.models.DataItemPages;

import java.util.ArrayList;
import java.util.List;

public class PagesDataProviderBook4_1 {

    public static List<DataItemPages> dataItemPagesList;

    static {
        dataItemPagesList = new ArrayList<>();

        addItem(new DataItemPages(411, 1, R.string.string_book_4_chapter_1_page_1, 41));
        addItem(new DataItemPages(412, 2, R.string.string_book_4_chapter_1_page_2, 41));
        addItem(new DataItemPages(413, 3, R.string.string_book_4_chapter_1_page_3, 41));
        addItem(new DataItemPages(414, 4, R.string.string_book_4_chapter_1_page_4, 41));
        addItem(new DataItemPages(415, 5, R.string.string_book_4_chapter_1_page_5, 41));
        addItem(new DataItemPages(416, 6, R.string.string_book_4_chapter_1_page_6, 41));
        addItem(new DataItemPages(417, 7, R.string.string_book_4_chapter_1_page_7, 41));
        addItem(new DataItemPages(418, 8, R.string.string_book_4_chapter_1_page_8, 41));
        addItem(new DataItemPages(419, 9, R.string.string_book_4_chapter_1_page_9, 41));
        addItem(new DataItemPages(4110, 10, R.string.string_book_4_chapter_1_page_10, 41));
        addItem(new DataItemPages(4111, 11, R.string.string_book_4_chapter_1_page_11, 41));
        addItem(new DataItemPages(4112, 12, R.string.string_book_4_chapter_1_page_12, 41));
        addItem(new DataItemPages(4113, 13, R.string.string_book_4_chapter_1_page_13, 41));
        addItem(new DataItemPages(4114, 14, R.string.string_book_4_chapter_1_page_14, 41));
        addItem(new DataItemPages(4115, 15, R.string.string_book_4_chapter_1_page_15, 41));
    }

    private static void addItem(DataItemPages item) {
        dataItemPagesList.add(item);
    }
}
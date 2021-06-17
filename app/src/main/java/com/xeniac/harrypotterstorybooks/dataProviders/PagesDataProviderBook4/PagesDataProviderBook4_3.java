package com.xeniac.harrypotterstorybooks.dataProviders.PagesDataProviderBook4;

import com.xeniac.harrypotterstorybooks.R;
import com.xeniac.harrypotterstorybooks.models.DataItemPages;

import java.util.ArrayList;
import java.util.List;

public class PagesDataProviderBook4_3 {

    public static List<DataItemPages> dataItemPagesList;

    static {
        dataItemPagesList = new ArrayList<>();

        addItem(new DataItemPages(431, 1, R.string.string_book_4_chapter_3_page_1, 43));
        addItem(new DataItemPages(432, 2, R.string.string_book_4_chapter_3_page_2, 43));
        addItem(new DataItemPages(433, 3, R.string.string_book_4_chapter_3_page_3, 43));
        addItem(new DataItemPages(434, 4, R.string.string_book_4_chapter_3_page_4, 43));
        addItem(new DataItemPages(435, 5, R.string.string_book_4_chapter_3_page_5, 43));
        addItem(new DataItemPages(436, 6, R.string.string_book_4_chapter_3_page_6, 43));
        addItem(new DataItemPages(437, 7, R.string.string_book_4_chapter_3_page_7, 43));
        addItem(new DataItemPages(438, 8, R.string.string_book_4_chapter_3_page_8, 43));
        addItem(new DataItemPages(439, 9, R.string.string_book_4_chapter_3_page_9, 43));
        addItem(new DataItemPages(4310, 10, R.string.string_book_4_chapter_3_page_10, 43));
        addItem(new DataItemPages(4311, 11, R.string.string_book_4_chapter_3_page_11, 43));
        addItem(new DataItemPages(4312, 12, R.string.string_book_4_chapter_3_page_12, 43));
        addItem(new DataItemPages(4313, 13, R.string.string_book_4_chapter_3_page_13, 43));
    }

    private static void addItem(DataItemPages item) {
        dataItemPagesList.add(item);
    }
}
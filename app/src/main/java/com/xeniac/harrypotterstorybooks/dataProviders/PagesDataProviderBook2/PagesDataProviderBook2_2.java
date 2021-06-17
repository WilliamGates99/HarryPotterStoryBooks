package com.xeniac.harrypotterstorybooks.dataProviders.PagesDataProviderBook2;

import com.xeniac.harrypotterstorybooks.R;
import com.xeniac.harrypotterstorybooks.models.DataItemPages;

import java.util.ArrayList;
import java.util.List;

public class PagesDataProviderBook2_2 {

    public static List<DataItemPages> dataItemPagesList;

    static {
        dataItemPagesList = new ArrayList<>();

        addItem(new DataItemPages(221, 1, R.string.string_book_2_chapter_2_page_1, 22));
        addItem(new DataItemPages(222, 2, R.string.string_book_2_chapter_2_page_2, 22));
        addItem(new DataItemPages(223, 3, R.string.string_book_2_chapter_2_page_3, 22));
        addItem(new DataItemPages(224, 4, R.string.string_book_2_chapter_2_page_4, 22));
        addItem(new DataItemPages(225, 5, R.string.string_book_2_chapter_2_page_5, 22));
        addItem(new DataItemPages(226, 6, R.string.string_book_2_chapter_2_page_6, 22));
        addItem(new DataItemPages(227, 7, R.string.string_book_2_chapter_2_page_7, 22));
        addItem(new DataItemPages(228, 8, R.string.string_book_2_chapter_2_page_8, 22));
        addItem(new DataItemPages(229, 9, R.string.string_book_2_chapter_2_page_9, 22));
        addItem(new DataItemPages(2210, 10, R.string.string_book_2_chapter_2_page_10, 22));
        addItem(new DataItemPages(2211, 11, R.string.string_book_2_chapter_2_page_11, 22));
        addItem(new DataItemPages(2212, 12, R.string.string_book_2_chapter_2_page_12, 22));
    }

    private static void addItem(DataItemPages item) {
        dataItemPagesList.add(item);
    }
}
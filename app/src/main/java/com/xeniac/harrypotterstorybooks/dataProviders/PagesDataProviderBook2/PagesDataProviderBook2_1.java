package com.xeniac.harrypotterstorybooks.dataProviders.PagesDataProviderBook2;

import com.xeniac.harrypotterstorybooks.R;
import com.xeniac.harrypotterstorybooks.models.DataItemPages;

import java.util.ArrayList;
import java.util.List;

public class PagesDataProviderBook2_1 {

    public static List<DataItemPages> dataItemPagesList;

    static {
        dataItemPagesList = new ArrayList<>();

        addItem(new DataItemPages(211, 1, R.string.string_book_2_chapter_1_page_1, 21));
        addItem(new DataItemPages(212, 2, R.string.string_book_2_chapter_1_page_2, 21));
        addItem(new DataItemPages(213, 3, R.string.string_book_2_chapter_1_page_3, 21));
        addItem(new DataItemPages(214, 4, R.string.string_book_2_chapter_1_page_4, 21));
        addItem(new DataItemPages(215, 5, R.string.string_book_2_chapter_1_page_5, 21));
        addItem(new DataItemPages(216, 6, R.string.string_book_2_chapter_1_page_6, 21));
        addItem(new DataItemPages(217, 7, R.string.string_book_2_chapter_1_page_7, 21));
        addItem(new DataItemPages(218, 8, R.string.string_book_2_chapter_1_page_8, 21));
        addItem(new DataItemPages(219, 9, R.string.string_book_2_chapter_1_page_9, 21));
        addItem(new DataItemPages(2110, 10, R.string.string_book_2_chapter_1_page_10, 21));
        addItem(new DataItemPages(2111, 11, R.string.string_book_2_chapter_1_page_11, 21));
    }

    private static void addItem(DataItemPages item) {
        dataItemPagesList.add(item);
    }
}
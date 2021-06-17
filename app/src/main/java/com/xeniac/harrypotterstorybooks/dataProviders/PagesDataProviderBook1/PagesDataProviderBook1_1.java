package com.xeniac.harrypotterstorybooks.dataProviders.PagesDataProviderBook1;

import com.xeniac.harrypotterstorybooks.R;
import com.xeniac.harrypotterstorybooks.models.DataItemPages;

import java.util.ArrayList;
import java.util.List;

public class PagesDataProviderBook1_1 {

    public static List<DataItemPages> dataItemPagesList;

    static {
        dataItemPagesList = new ArrayList<>();

        addItem(new DataItemPages(111, 1, R.string.string_book_1_chapter_1_page_1, 11));
        addItem(new DataItemPages(112, 2, R.string.string_book_1_chapter_1_page_2, 11));
        addItem(new DataItemPages(113, 3, R.string.string_book_1_chapter_1_page_3, 11));
        addItem(new DataItemPages(114, 4, R.string.string_book_1_chapter_1_page_4, 11));
        addItem(new DataItemPages(115, 5, R.string.string_book_1_chapter_1_page_5, 11));
        addItem(new DataItemPages(116, 6, R.string.string_book_1_chapter_1_page_6, 11));
        addItem(new DataItemPages(117, 7, R.string.string_book_1_chapter_1_page_7, 11));
        addItem(new DataItemPages(118, 8, R.string.string_book_1_chapter_1_page_8, 11));
        addItem(new DataItemPages(119, 9, R.string.string_book_1_chapter_1_page_9, 11));
        addItem(new DataItemPages(1110, 10, R.string.string_book_1_chapter_1_page_10, 11));
        addItem(new DataItemPages(1111, 11, R.string.string_book_1_chapter_1_page_11, 11));
        addItem(new DataItemPages(1112, 12, R.string.string_book_1_chapter_1_page_12, 11));
        addItem(new DataItemPages(1113, 13, R.string.string_book_1_chapter_1_page_13, 11));
        addItem(new DataItemPages(1114, 14, R.string.string_book_1_chapter_1_page_14, 11));
        addItem(new DataItemPages(1115, 15, R.string.string_book_1_chapter_1_page_15, 11));
        addItem(new DataItemPages(1116, 16, R.string.string_book_1_chapter_1_page_16, 11));
        addItem(new DataItemPages(1117, 17, R.string.string_book_1_chapter_1_page_17, 11));
    }

    private static void addItem(DataItemPages item) {
        dataItemPagesList.add(item);
    }
}
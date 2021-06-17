package com.xeniac.harrypotterstorybooks.dataProviders.PagesDataProviderBook6;

import com.xeniac.harrypotterstorybooks.R;
import com.xeniac.harrypotterstorybooks.models.DataItemPages;

import java.util.ArrayList;
import java.util.List;

public class PagesDataProviderBook6_1 {

    public static List<DataItemPages> dataItemPagesList;

    static {
        dataItemPagesList = new ArrayList<>();

        addItem(new DataItemPages(611, 1, R.string.string_book_6_chapter_1_page_1, 61));
        addItem(new DataItemPages(612, 2, R.string.string_book_6_chapter_1_page_2, 61));
        addItem(new DataItemPages(613, 3, R.string.string_book_6_chapter_1_page_3, 61));
        addItem(new DataItemPages(614, 4, R.string.string_book_6_chapter_1_page_4, 61));
        addItem(new DataItemPages(615, 5, R.string.string_book_6_chapter_1_page_5, 61));
        addItem(new DataItemPages(616, 6, R.string.string_book_6_chapter_1_page_6, 61));
        addItem(new DataItemPages(617, 7, R.string.string_book_6_chapter_1_page_7, 61));
        addItem(new DataItemPages(618, 8, R.string.string_book_6_chapter_1_page_8, 61));
        addItem(new DataItemPages(619, 9, R.string.string_book_6_chapter_1_page_9, 61));
        addItem(new DataItemPages(6110, 10, R.string.string_book_6_chapter_1_page_10, 61));
        addItem(new DataItemPages(6111, 11, R.string.string_book_6_chapter_1_page_11, 61));
        addItem(new DataItemPages(6112, 12, R.string.string_book_6_chapter_1_page_12, 61));
        addItem(new DataItemPages(6113, 13, R.string.string_book_6_chapter_1_page_13, 61));
        addItem(new DataItemPages(6114, 14, R.string.string_book_6_chapter_1_page_14, 61));
        addItem(new DataItemPages(6115, 15, R.string.string_book_6_chapter_1_page_15, 61));
        addItem(new DataItemPages(6116, 16, R.string.string_book_6_chapter_1_page_16, 61));
        addItem(new DataItemPages(6117, 17, R.string.string_book_6_chapter_1_page_17, 61));
        addItem(new DataItemPages(6118, 18, R.string.string_book_6_chapter_1_page_18, 61));
    }

    private static void addItem(DataItemPages item) {
        dataItemPagesList.add(item);
    }
}
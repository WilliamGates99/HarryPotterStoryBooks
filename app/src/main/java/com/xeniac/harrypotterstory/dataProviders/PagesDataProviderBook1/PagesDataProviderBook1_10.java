package com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook1;

import com.xeniac.harrypotterstory.R;
import com.xeniac.harrypotterstory.models.DataItemPages;

import java.util.ArrayList;
import java.util.List;

public class PagesDataProviderBook1_10 {

    public static List<DataItemPages> dataItemPagesList;

    static {
        dataItemPagesList = new ArrayList<>();

        addItem(new DataItemPages("page_1", 1, R.string.string_book_1_chapter_10_page_1, "book_1_chapter_10", false));
        addItem(new DataItemPages("page_2", 2, R.string.string_book_1_chapter_10_page_2, "book_1_chapter_10", false));
        addItem(new DataItemPages("page_3", 3, R.string.string_book_1_chapter_10_page_3, "book_1_chapter_10", false));
        addItem(new DataItemPages("page_4", 4, R.string.string_book_1_chapter_10_page_4, "book_1_chapter_10", false));
        addItem(new DataItemPages("page_5", 5, R.string.string_book_1_chapter_10_page_5, "book_1_chapter_10", false));
        addItem(new DataItemPages("page_6", 6, R.string.string_book_1_chapter_10_page_6, "book_1_chapter_10", false));
        addItem(new DataItemPages("page_7", 7, R.string.string_book_1_chapter_10_page_7, "book_1_chapter_10", false));
        addItem(new DataItemPages("page_8", 8, R.string.string_book_1_chapter_10_page_8, "book_1_chapter_10", false));
        addItem(new DataItemPages("page_9", 9, R.string.string_book_1_chapter_10_page_9, "book_1_chapter_10", false));
        addItem(new DataItemPages("page_10", 10, R.string.string_book_1_chapter_10_page_10, "book_1_chapter_10", false));
        addItem(new DataItemPages("page_11", 11, R.string.string_book_1_chapter_10_page_11, "book_1_chapter_10", false));
        addItem(new DataItemPages("page_12", 12, R.string.string_book_1_chapter_10_page_12, "book_1_chapter_10", false));
        addItem(new DataItemPages("page_13", 13, R.string.string_book_1_chapter_10_page_13, "book_1_chapter_10", false));
        addItem(new DataItemPages("page_14", 14, R.string.string_book_1_chapter_10_page_14, "book_1_chapter_10", false));
        addItem(new DataItemPages("page_15", 15, R.string.string_book_1_chapter_10_page_15, "book_1_chapter_10", false));
        addItem(new DataItemPages("page_16", 16, R.string.string_book_1_chapter_10_page_16, "book_1_chapter_10", false));
        addItem(new DataItemPages("page_17", 17, R.string.string_book_1_chapter_10_page_17, "book_1_chapter_10", false));
    }

    private static void addItem(DataItemPages item) {
        dataItemPagesList.add(item);
    }
}

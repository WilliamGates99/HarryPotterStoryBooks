package com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook1;

import com.xeniac.harrypotterstory.R;
import com.xeniac.harrypotterstory.models.DataItemPages;

import java.util.ArrayList;
import java.util.List;

public class PagesDataProviderBook1_7 {

    public static List<DataItemPages> dataItemPagesList;

    static {
        dataItemPagesList = new ArrayList<>();

        addItem(new DataItemPages("page_1", "1", R.string.string_book_1_chapter_7_page_1));
        addItem(new DataItemPages("page_2", "2", R.string.string_book_1_chapter_7_page_2));
        addItem(new DataItemPages("page_3", "3", R.string.string_book_1_chapter_7_page_3));
        addItem(new DataItemPages("page_4", "4", R.string.string_book_1_chapter_7_page_4));
        addItem(new DataItemPages("page_5", "5", R.string.string_book_1_chapter_7_page_5));
        addItem(new DataItemPages("page_6", "6", R.string.string_book_1_chapter_7_page_6));
        addItem(new DataItemPages("page_7", "7", R.string.string_book_1_chapter_7_page_7));
        addItem(new DataItemPages("page_8", "8", R.string.string_book_1_chapter_7_page_8));
        addItem(new DataItemPages("page_9", "9", R.string.string_book_1_chapter_7_page_9));
        addItem(new DataItemPages("page_10", "10", R.string.string_book_1_chapter_7_page_10));
        addItem(new DataItemPages("page_11", "11", R.string.string_book_1_chapter_7_page_11));
        addItem(new DataItemPages("page_12", "12", R.string.string_book_1_chapter_7_page_12));
        addItem(new DataItemPages("page_13", "13", R.string.string_book_1_chapter_7_page_13));
        addItem(new DataItemPages("page_14", "14", R.string.string_book_1_chapter_7_page_14));
        addItem(new DataItemPages("page_15", "15", R.string.string_book_1_chapter_7_page_15));
        addItem(new DataItemPages("page_16", "16", R.string.string_book_1_chapter_7_page_16));
        addItem(new DataItemPages("page_17", "17", R.string.string_book_1_chapter_7_page_17));
        addItem(new DataItemPages("page_18", "18", R.string.string_book_1_chapter_7_page_18));
    }

    private static void addItem(DataItemPages item) {
        dataItemPagesList.add(item);
    }
}

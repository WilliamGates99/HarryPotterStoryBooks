package com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook1;

import com.xeniac.harrypotterstory.R;
import com.xeniac.harrypotterstory.models.DataItemPages;

import java.util.ArrayList;
import java.util.List;

public class PagesDataProviderBook1_14 {

    public static List<DataItemPages> dataItemPagesList;

    static {
        dataItemPagesList = new ArrayList<>();

        addItem(new DataItemPages(1141, 1, R.string.string_book_1_chapter_14_page_1, 114));
        addItem(new DataItemPages(1142, 2, R.string.string_book_1_chapter_14_page_2, 114));
        addItem(new DataItemPages(1143, 3, R.string.string_book_1_chapter_14_page_3, 114));
        addItem(new DataItemPages(1144, 4, R.string.string_book_1_chapter_14_page_4, 114));
        addItem(new DataItemPages(1145, 5, R.string.string_book_1_chapter_14_page_5, 114));
        addItem(new DataItemPages(1146, 6, R.string.string_book_1_chapter_14_page_6, 114));
        addItem(new DataItemPages(1147, 7, R.string.string_book_1_chapter_14_page_7, 114));
        addItem(new DataItemPages(1148, 8, R.string.string_book_1_chapter_14_page_8, 114));
        addItem(new DataItemPages(1149, 9, R.string.string_book_1_chapter_14_page_9, 114));
        addItem(new DataItemPages(11410, 10, R.string.string_book_1_chapter_14_page_10, 114));
        addItem(new DataItemPages(11411, 11, R.string.string_book_1_chapter_14_page_11, 114));
        addItem(new DataItemPages(11412, 12, R.string.string_book_1_chapter_14_page_12, 114));
        addItem(new DataItemPages(11413, 13, R.string.string_book_1_chapter_14_page_13, 114));
        addItem(new DataItemPages(11414, 14, R.string.string_book_1_chapter_14_page_14, 114));
    }

    private static void addItem(DataItemPages item) {
        dataItemPagesList.add(item);
    }
}
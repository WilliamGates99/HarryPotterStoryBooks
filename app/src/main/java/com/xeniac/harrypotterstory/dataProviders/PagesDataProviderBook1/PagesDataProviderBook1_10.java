package com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook1;

import com.xeniac.harrypotterstory.R;
import com.xeniac.harrypotterstory.models.DataItemPages;

import java.util.ArrayList;
import java.util.List;

public class PagesDataProviderBook1_10 {

    public static List<DataItemPages> dataItemPagesList;

    static {
        dataItemPagesList = new ArrayList<>();

        addItem(new DataItemPages(1101, 1, R.string.string_book_1_chapter_10_page_1, 110, false));
        addItem(new DataItemPages(1102, 2, R.string.string_book_1_chapter_10_page_2, 110, false));
        addItem(new DataItemPages(1103, 3, R.string.string_book_1_chapter_10_page_3, 110, false));
        addItem(new DataItemPages(1104, 4, R.string.string_book_1_chapter_10_page_4, 110, false));
        addItem(new DataItemPages(1105, 5, R.string.string_book_1_chapter_10_page_5, 110, false));
        addItem(new DataItemPages(1106, 6, R.string.string_book_1_chapter_10_page_6, 110, false));
        addItem(new DataItemPages(1107, 7, R.string.string_book_1_chapter_10_page_7, 110, false));
        addItem(new DataItemPages(1108, 8, R.string.string_book_1_chapter_10_page_8, 110, false));
        addItem(new DataItemPages(1109, 9, R.string.string_book_1_chapter_10_page_9, 110, false));
        addItem(new DataItemPages(11010, 10, R.string.string_book_1_chapter_10_page_10, 110, false));
        addItem(new DataItemPages(11011, 11, R.string.string_book_1_chapter_10_page_11, 110, false));
        addItem(new DataItemPages(11012, 12, R.string.string_book_1_chapter_10_page_12, 110, false));
        addItem(new DataItemPages(11013, 13, R.string.string_book_1_chapter_10_page_13, 110, false));
        addItem(new DataItemPages(11014, 14, R.string.string_book_1_chapter_10_page_14, 110, false));
        addItem(new DataItemPages(11015, 15, R.string.string_book_1_chapter_10_page_15, 110, false));
        addItem(new DataItemPages(11016, 16, R.string.string_book_1_chapter_10_page_16, 110, false));
        addItem(new DataItemPages(11017, 17, R.string.string_book_1_chapter_10_page_17, 110, false));
    }

    private static void addItem(DataItemPages item) {
        dataItemPagesList.add(item);
    }
}
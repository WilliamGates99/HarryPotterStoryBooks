package com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook1;

import com.xeniac.harrypotterstory.R;
import com.xeniac.harrypotterstory.models.DataItemPages;

import java.util.ArrayList;
import java.util.List;

public class PagesDataProviderBook1_13 {

    public static List<DataItemPages> dataItemPagesList;

    static {
        dataItemPagesList = new ArrayList<>();

        addItem(new DataItemPages(1131, 1, R.string.string_book_1_chapter_13_page_1, 113, false));
        addItem(new DataItemPages(1132, 2, R.string.string_book_1_chapter_13_page_2, 113, false));
        addItem(new DataItemPages(1133, 3, R.string.string_book_1_chapter_13_page_3, 113, false));
        addItem(new DataItemPages(1134, 4, R.string.string_book_1_chapter_13_page_4, 113, false));
        addItem(new DataItemPages(1135, 5, R.string.string_book_1_chapter_13_page_5, 113, false));
        addItem(new DataItemPages(1136, 6, R.string.string_book_1_chapter_13_page_6, 113, false));
        addItem(new DataItemPages(1137, 7, R.string.string_book_1_chapter_13_page_7, 113, false));
        addItem(new DataItemPages(1138, 8, R.string.string_book_1_chapter_13_page_8, 113, false));
        addItem(new DataItemPages(1139, 9, R.string.string_book_1_chapter_13_page_9, 113, false));
        addItem(new DataItemPages(11310, 10, R.string.string_book_1_chapter_13_page_10, 113, false));
        addItem(new DataItemPages(11311, 11, R.string.string_book_1_chapter_13_page_11, 113, false));
        addItem(new DataItemPages(11312, 12, R.string.string_book_1_chapter_13_page_12, 113, false));
        addItem(new DataItemPages(11313, 13, R.string.string_book_1_chapter_13_page_13, 113, false));
    }

    private static void addItem(DataItemPages item) {
        dataItemPagesList.add(item);
    }
}
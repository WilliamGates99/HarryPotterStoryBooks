package com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook1;

import com.xeniac.harrypotterstory.R;
import com.xeniac.harrypotterstory.models.DataItemPages;

import java.util.ArrayList;
import java.util.List;

public class PagesDataProviderBook1_3 {

    public static List<DataItemPages> dataItemPagesList;

    static {
        dataItemPagesList = new ArrayList<>();

        addItem(new DataItemPages(131, 1, R.string.string_book_1_chapter_3_page_1, 13, false));
        addItem(new DataItemPages(132, 2, R.string.string_book_1_chapter_3_page_2, 13, false));
        addItem(new DataItemPages(133, 3, R.string.string_book_1_chapter_3_page_3, 13, false));
        addItem(new DataItemPages(134, 4, R.string.string_book_1_chapter_3_page_4, 13, false));
        addItem(new DataItemPages(135, 5, R.string.string_book_1_chapter_3_page_5, 13, false));
        addItem(new DataItemPages(136, 6, R.string.string_book_1_chapter_3_page_6, 13, false));
        addItem(new DataItemPages(137, 7, R.string.string_book_1_chapter_3_page_7, 13, false));
        addItem(new DataItemPages(138, 8, R.string.string_book_1_chapter_3_page_8, 13, false));
        addItem(new DataItemPages(139, 9, R.string.string_book_1_chapter_3_page_9, 13, false));
        addItem(new DataItemPages(1310, 10, R.string.string_book_1_chapter_3_page_10, 13, false));
        addItem(new DataItemPages(1311, 11, R.string.string_book_1_chapter_3_page_11, 13, false));
        addItem(new DataItemPages(1312, 12, R.string.string_book_1_chapter_3_page_12, 13, false));
        addItem(new DataItemPages(1313, 13, R.string.string_book_1_chapter_3_page_13, 13, false));
        addItem(new DataItemPages(1314, 14, R.string.string_book_1_chapter_3_page_14, 13, false));
        addItem(new DataItemPages(1315, 15, R.string.string_book_1_chapter_3_page_15, 13, false));
    }

    private static void addItem(DataItemPages item) {
        dataItemPagesList.add(item);
    }
}
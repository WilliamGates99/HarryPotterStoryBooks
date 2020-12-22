package com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook7;

import com.xeniac.harrypotterstory.R;
import com.xeniac.harrypotterstory.models.DataItemPages;

import java.util.ArrayList;
import java.util.List;

public class PagesDataProviderBook7_27 {

    public static List<DataItemPages> dataItemPagesList;

    static {
        dataItemPagesList = new ArrayList<>();

        addItem(new DataItemPages(7271, 1, R.string.string_book_7_chapter_27_page_1, 727));
        addItem(new DataItemPages(7272, 2, R.string.string_book_7_chapter_27_page_2, 727));
        addItem(new DataItemPages(7273, 3, R.string.string_book_7_chapter_27_page_3, 727));
        addItem(new DataItemPages(7274, 4, R.string.string_book_7_chapter_27_page_4, 727));
        addItem(new DataItemPages(7275, 5, R.string.string_book_7_chapter_27_page_5, 727));
        addItem(new DataItemPages(7276, 6, R.string.string_book_7_chapter_27_page_6, 727));
        addItem(new DataItemPages(7277, 7, R.string.string_book_7_chapter_27_page_7, 727));
        addItem(new DataItemPages(7278, 8, R.string.string_book_7_chapter_27_page_8, 727));
        addItem(new DataItemPages(7279, 9, R.string.string_book_7_chapter_27_page_9, 727));
        addItem(new DataItemPages(72710, 10, R.string.string_book_7_chapter_27_page_10, 727));
    }

    private static void addItem(DataItemPages item) {
        dataItemPagesList.add(item);
    }
}
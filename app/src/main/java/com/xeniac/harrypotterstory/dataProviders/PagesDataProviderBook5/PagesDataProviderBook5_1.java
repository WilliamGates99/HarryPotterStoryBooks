package com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook5;

import com.xeniac.harrypotterstory.R;
import com.xeniac.harrypotterstory.models.DataItemPages;

import java.util.ArrayList;
import java.util.List;

public class PagesDataProviderBook5_1 {

    public static List<DataItemPages> dataItemPagesList;

    static {
        dataItemPagesList = new ArrayList<>();

        addItem(new DataItemPages(511, 1, R.string.string_book_5_chapter_1_page_1, 51));
        addItem(new DataItemPages(512, 2, R.string.string_book_5_chapter_1_page_2, 51));
        addItem(new DataItemPages(513, 3, R.string.string_book_5_chapter_1_page_3, 51));
        addItem(new DataItemPages(514, 4, R.string.string_book_5_chapter_1_page_4, 51));
        addItem(new DataItemPages(515, 5, R.string.string_book_5_chapter_1_page_5, 51));
        addItem(new DataItemPages(516, 6, R.string.string_book_5_chapter_1_page_6, 51));
        addItem(new DataItemPages(517, 7, R.string.string_book_5_chapter_1_page_7, 51));
        addItem(new DataItemPages(518, 8, R.string.string_book_5_chapter_1_page_8, 51));
        addItem(new DataItemPages(519, 9, R.string.string_book_5_chapter_1_page_9, 51));
        addItem(new DataItemPages(5110, 10, R.string.string_book_5_chapter_1_page_10, 51));
        addItem(new DataItemPages(5111, 11, R.string.string_book_5_chapter_1_page_11, 51));
        addItem(new DataItemPages(5112, 12, R.string.string_book_5_chapter_1_page_12, 51));
        addItem(new DataItemPages(5113, 13, R.string.string_book_5_chapter_1_page_13, 51));
        addItem(new DataItemPages(5114, 14, R.string.string_book_5_chapter_1_page_14, 51));
        addItem(new DataItemPages(5115, 15, R.string.string_book_5_chapter_1_page_15, 51));
        addItem(new DataItemPages(5116, 16, R.string.string_book_5_chapter_1_page_16, 51));
        addItem(new DataItemPages(5117, 17, R.string.string_book_5_chapter_1_page_17, 51));
        addItem(new DataItemPages(5118, 18, R.string.string_book_5_chapter_1_page_18, 51));
        addItem(new DataItemPages(5119, 19, R.string.string_book_5_chapter_1_page_19, 51));
    }

    private static void addItem(DataItemPages item) {
        dataItemPagesList.add(item);
    }
}
package com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook3;

import com.xeniac.harrypotterstory.R;
import com.xeniac.harrypotterstory.models.DataItemPages;

import java.util.ArrayList;
import java.util.List;

public class PagesDataProviderBook3_20 {

    public static List<DataItemPages> dataItemPagesList;

    static {
        dataItemPagesList = new ArrayList<>();

        addItem(new DataItemPages(3201, 1, R.string.string_book_3_chapter_20_page_1, 320));
        addItem(new DataItemPages(3202, 2, R.string.string_book_3_chapter_20_page_2, 320));
        addItem(new DataItemPages(3203, 3, R.string.string_book_3_chapter_20_page_3, 320));
        addItem(new DataItemPages(3204, 4, R.string.string_book_3_chapter_20_page_4, 320));
        addItem(new DataItemPages(3205, 5, R.string.string_book_3_chapter_20_page_5, 320));
        addItem(new DataItemPages(3206, 6, R.string.string_book_3_chapter_20_page_6, 320));
        addItem(new DataItemPages(3207, 7, R.string.string_book_3_chapter_20_page_7, 320));
        addItem(new DataItemPages(3208, 8, R.string.string_book_3_chapter_20_page_8, 320));
    }

    private static void addItem(DataItemPages item) {
        dataItemPagesList.add(item);
    }
}
package com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook3;

import com.xeniac.harrypotterstory.R;
import com.xeniac.harrypotterstory.models.DataItemPages;

import java.util.ArrayList;
import java.util.List;

public class PagesDataProviderBook3_18 {

    public static List<DataItemPages> dataItemPagesList;

    static {
        dataItemPagesList = new ArrayList<>();

        addItem(new DataItemPages(3181, 1, R.string.string_book_3_chapter_18_page_1, 318));
        addItem(new DataItemPages(3182, 2, R.string.string_book_3_chapter_18_page_2, 318));
        addItem(new DataItemPages(3183, 3, R.string.string_book_3_chapter_18_page_3, 318));
        addItem(new DataItemPages(3184, 4, R.string.string_book_3_chapter_18_page_4, 318));
        addItem(new DataItemPages(3185, 5, R.string.string_book_3_chapter_18_page_5, 318));
        addItem(new DataItemPages(3186, 6, R.string.string_book_3_chapter_18_page_6, 318));
        addItem(new DataItemPages(3187, 7, R.string.string_book_3_chapter_18_page_7, 318));
        addItem(new DataItemPages(3188, 8, R.string.string_book_3_chapter_18_page_8, 318));
        addItem(new DataItemPages(3189, 9, R.string.string_book_3_chapter_18_page_9, 318));
    }

    private static void addItem(DataItemPages item) {
        dataItemPagesList.add(item);
    }
}
package com.xeniac.harrypotterstorybooks.dataProviders.PagesDataProviderBook7;

import com.xeniac.harrypotterstorybooks.R;
import com.xeniac.harrypotterstorybooks.models.DataItemPages;

import java.util.ArrayList;
import java.util.List;

public class PagesDataProviderBook7_1 {

    public static List<DataItemPages> dataItemPagesList;

    static {
        dataItemPagesList = new ArrayList<>();

        addItem(new DataItemPages(711, 1, R.string.string_book_7_chapter_1_page_1, 71));
        addItem(new DataItemPages(712, 2, R.string.string_book_7_chapter_1_page_2, 71));
        addItem(new DataItemPages(713, 3, R.string.string_book_7_chapter_1_page_3, 71));
        addItem(new DataItemPages(714, 4, R.string.string_book_7_chapter_1_page_4, 71));
        addItem(new DataItemPages(715, 5, R.string.string_book_7_chapter_1_page_5, 71));
        addItem(new DataItemPages(716, 6, R.string.string_book_7_chapter_1_page_6, 71));
        addItem(new DataItemPages(717, 7, R.string.string_book_7_chapter_1_page_7, 71));
        addItem(new DataItemPages(718, 8, R.string.string_book_7_chapter_1_page_8, 71));
        addItem(new DataItemPages(719, 9, R.string.string_book_7_chapter_1_page_9, 71));
        addItem(new DataItemPages(7110, 10, R.string.string_book_7_chapter_1_page_10, 71));
        addItem(new DataItemPages(7111, 11, R.string.string_book_7_chapter_1_page_11, 71));
        addItem(new DataItemPages(7112, 12, R.string.string_book_7_chapter_1_page_12, 71));
    }

    private static void addItem(DataItemPages item) {
        dataItemPagesList.add(item);
    }
}
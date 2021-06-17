package com.xeniac.harrypotterstorybooks.dataProviders.PagesDataProviderBook4;

import com.xeniac.harrypotterstorybooks.R;
import com.xeniac.harrypotterstorybooks.models.DataItemPages;

import java.util.ArrayList;
import java.util.List;

public class PagesDataProviderBook4_4 {

    public static List<DataItemPages> dataItemPagesList;

    static {
        dataItemPagesList = new ArrayList<>();

        addItem(new DataItemPages(441, 1, R.string.string_book_4_chapter_4_page_1, 44));
        addItem(new DataItemPages(442, 2, R.string.string_book_4_chapter_4_page_2, 44));
        addItem(new DataItemPages(443, 3, R.string.string_book_4_chapter_4_page_3, 44));
        addItem(new DataItemPages(444, 4, R.string.string_book_4_chapter_4_page_4, 44));
        addItem(new DataItemPages(445, 5, R.string.string_book_4_chapter_4_page_5, 44));
        addItem(new DataItemPages(446, 6, R.string.string_book_4_chapter_4_page_6, 44));
        addItem(new DataItemPages(447, 7, R.string.string_book_4_chapter_4_page_7, 44));
        addItem(new DataItemPages(448, 8, R.string.string_book_4_chapter_4_page_8, 44));
        addItem(new DataItemPages(449, 9, R.string.string_book_4_chapter_4_page_9, 44));
        addItem(new DataItemPages(4410, 10, R.string.string_book_4_chapter_4_page_10, 44));
        addItem(new DataItemPages(4411, 11, R.string.string_book_4_chapter_4_page_11, 44));
        addItem(new DataItemPages(4412, 12, R.string.string_book_4_chapter_4_page_12, 44));
    }

    private static void addItem(DataItemPages item) {
        dataItemPagesList.add(item);
    }
}
package com.xeniac.harrypotterstorybooks.dataProviders.PagesDataProviderBook4;

import com.xeniac.harrypotterstorybooks.R;
import com.xeniac.harrypotterstorybooks.models.DataItemPages;

import java.util.ArrayList;
import java.util.List;

public class PagesDataProviderBook4_2 {

    public static List<DataItemPages> dataItemPagesList;

    static {
        dataItemPagesList = new ArrayList<>();

        addItem(new DataItemPages(421, 1, R.string.string_book_4_chapter_2_page_1, 42));
        addItem(new DataItemPages(422, 2, R.string.string_book_4_chapter_2_page_2, 42));
        addItem(new DataItemPages(423, 3, R.string.string_book_4_chapter_2_page_3, 42));
        addItem(new DataItemPages(424, 4, R.string.string_book_4_chapter_2_page_4, 42));
        addItem(new DataItemPages(425, 5, R.string.string_book_4_chapter_2_page_5, 42));
        addItem(new DataItemPages(426, 6, R.string.string_book_4_chapter_2_page_6, 42));
        addItem(new DataItemPages(427, 7, R.string.string_book_4_chapter_2_page_7, 42));
        addItem(new DataItemPages(428, 8, R.string.string_book_4_chapter_2_page_8, 42));
        addItem(new DataItemPages(429, 9, R.string.string_book_4_chapter_2_page_9, 42));
        addItem(new DataItemPages(4210, 10, R.string.string_book_4_chapter_2_page_10, 42));
    }

    private static void addItem(DataItemPages item) {
        dataItemPagesList.add(item);
    }
}
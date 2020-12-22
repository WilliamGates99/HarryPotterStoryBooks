package com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook4;

import com.xeniac.harrypotterstory.R;
import com.xeniac.harrypotterstory.models.DataItemPages;

import java.util.ArrayList;
import java.util.List;

public class PagesDataProviderBook4_11 {

    public static List<DataItemPages> dataItemPagesList;

    static {
        dataItemPagesList = new ArrayList<>();

        addItem(new DataItemPages(4111, 1, R.string.string_book_4_chapter_11_page_1, 411));
        addItem(new DataItemPages(4112, 2, R.string.string_book_4_chapter_11_page_2, 411));
        addItem(new DataItemPages(4113, 3, R.string.string_book_4_chapter_11_page_3, 411));
        addItem(new DataItemPages(4114, 4, R.string.string_book_4_chapter_11_page_4, 411));
        addItem(new DataItemPages(4115, 5, R.string.string_book_4_chapter_11_page_5, 411));
        addItem(new DataItemPages(4116, 6, R.string.string_book_4_chapter_11_page_6, 411));
        addItem(new DataItemPages(4117, 7, R.string.string_book_4_chapter_11_page_7, 411));
        addItem(new DataItemPages(4118, 8, R.string.string_book_4_chapter_11_page_8, 411));
        addItem(new DataItemPages(4119, 9, R.string.string_book_4_chapter_11_page_9, 411));
        addItem(new DataItemPages(41110, 10, R.string.string_book_4_chapter_11_page_10, 411));
        addItem(new DataItemPages(41111, 11, R.string.string_book_4_chapter_11_page_11, 411));
        addItem(new DataItemPages(41112, 12, R.string.string_book_4_chapter_11_page_12, 411));
        addItem(new DataItemPages(41113, 13, R.string.string_book_4_chapter_11_page_13, 411));
    }

    private static void addItem(DataItemPages item) {
        dataItemPagesList.add(item);
    }
}
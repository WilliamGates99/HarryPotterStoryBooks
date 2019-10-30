package com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook1;

import com.xeniac.harrypotterstory.R;
import com.xeniac.harrypotterstory.models.DataItemPages;

import java.util.ArrayList;
import java.util.List;

public class PagesDataProviderBook1_11 {

    public static List<DataItemPages> dataItemPagesList;

    static {
        dataItemPagesList = new ArrayList<>();

        addItem(new DataItemPages(1111, 1, R.string.string_book_1_chapter_11_page_1, 111));
        addItem(new DataItemPages(1112, 2, R.string.string_book_1_chapter_11_page_2, 111));
        addItem(new DataItemPages(1113, 3, R.string.string_book_1_chapter_11_page_3, 111));
        addItem(new DataItemPages(1114, 4, R.string.string_book_1_chapter_11_page_4, 111));
        addItem(new DataItemPages(1115, 5, R.string.string_book_1_chapter_11_page_5, 111));
        addItem(new DataItemPages(1116, 6, R.string.string_book_1_chapter_11_page_6, 111));
        addItem(new DataItemPages(1117, 7, R.string.string_book_1_chapter_11_page_7, 111));
        addItem(new DataItemPages(1118, 8, R.string.string_book_1_chapter_11_page_8, 111));
        addItem(new DataItemPages(1119, 9, R.string.string_book_1_chapter_11_page_9, 111));
        addItem(new DataItemPages(11110, 10, R.string.string_book_1_chapter_11_page_10, 111));
        addItem(new DataItemPages(11111, 11, R.string.string_book_1_chapter_11_page_11, 111));
        addItem(new DataItemPages(11112, 12, R.string.string_book_1_chapter_11_page_12, 111));
        addItem(new DataItemPages(11113, 13, R.string.string_book_1_chapter_11_page_13, 111));
        addItem(new DataItemPages(11114, 14, R.string.string_book_1_chapter_11_page_14, 111));
    }

    private static void addItem(DataItemPages item) {
        dataItemPagesList.add(item);
    }
}
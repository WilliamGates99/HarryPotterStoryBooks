package com.xeniac.harrypotterstorybooks.dataProviders.PagesDataProviderBook7;

import com.xeniac.harrypotterstorybooks.R;
import com.xeniac.harrypotterstorybooks.models.DataItemPages;

import java.util.ArrayList;
import java.util.List;

public class PagesDataProviderBook7_3 {

    public static List<DataItemPages> dataItemPagesList;

    static {
        dataItemPagesList = new ArrayList<>();

        addItem(new DataItemPages(731, 1, R.string.string_book_7_chapter_3_page_1, 73));
        addItem(new DataItemPages(732, 2, R.string.string_book_7_chapter_3_page_2, 73));
        addItem(new DataItemPages(733, 3, R.string.string_book_7_chapter_3_page_3, 73));
        addItem(new DataItemPages(734, 4, R.string.string_book_7_chapter_3_page_4, 73));
        addItem(new DataItemPages(735, 5, R.string.string_book_7_chapter_3_page_5, 73));
        addItem(new DataItemPages(736, 6, R.string.string_book_7_chapter_3_page_6, 73));
        addItem(new DataItemPages(737, 7, R.string.string_book_7_chapter_3_page_7, 73));
        addItem(new DataItemPages(738, 8, R.string.string_book_7_chapter_3_page_8, 73));
        addItem(new DataItemPages(739, 9, R.string.string_book_7_chapter_3_page_9, 73));
        addItem(new DataItemPages(7310, 10, R.string.string_book_7_chapter_3_page_10, 73));
        addItem(new DataItemPages(7311, 11, R.string.string_book_7_chapter_3_page_11, 73));
        addItem(new DataItemPages(7312, 12, R.string.string_book_7_chapter_3_page_12, 73));
        addItem(new DataItemPages(7313, 13, R.string.string_book_7_chapter_3_page_13, 73));
    }

    private static void addItem(DataItemPages item) {
        dataItemPagesList.add(item);
    }
}
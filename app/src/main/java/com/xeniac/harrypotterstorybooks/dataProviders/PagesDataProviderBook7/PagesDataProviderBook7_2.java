package com.xeniac.harrypotterstorybooks.dataProviders.PagesDataProviderBook7;

import com.xeniac.harrypotterstorybooks.R;
import com.xeniac.harrypotterstorybooks.models.DataItemPages;

import java.util.ArrayList;
import java.util.List;

public class PagesDataProviderBook7_2 {

    public static List<DataItemPages> dataItemPagesList;

    static {
        dataItemPagesList = new ArrayList<>();

        addItem(new DataItemPages(721, 1, R.string.string_book_7_chapter_2_page_1, 72));
        addItem(new DataItemPages(722, 2, R.string.string_book_7_chapter_2_page_2, 72));
        addItem(new DataItemPages(723, 3, R.string.string_book_7_chapter_2_page_3, 72));
        addItem(new DataItemPages(724, 4, R.string.string_book_7_chapter_2_page_4, 72));
        addItem(new DataItemPages(725, 5, R.string.string_book_7_chapter_2_page_5, 72));
        addItem(new DataItemPages(726, 6, R.string.string_book_7_chapter_2_page_6, 72));
        addItem(new DataItemPages(727, 7, R.string.string_book_7_chapter_2_page_7, 72));
        addItem(new DataItemPages(728, 8, R.string.string_book_7_chapter_2_page_8, 72));
        addItem(new DataItemPages(729, 9, R.string.string_book_7_chapter_2_page_9, 72));
        addItem(new DataItemPages(7210, 10, R.string.string_book_7_chapter_2_page_10, 72));
        addItem(new DataItemPages(7211, 11, R.string.string_book_7_chapter_2_page_11, 72));
        addItem(new DataItemPages(7212, 12, R.string.string_book_7_chapter_2_page_12, 72));
        addItem(new DataItemPages(7213, 13, R.string.string_book_7_chapter_2_page_13, 72));
        addItem(new DataItemPages(7214, 14, R.string.string_book_7_chapter_2_page_14, 72));
        addItem(new DataItemPages(7215, 15, R.string.string_book_7_chapter_2_page_15, 72));
        addItem(new DataItemPages(7216, 16, R.string.string_book_7_chapter_2_page_16, 72));
        addItem(new DataItemPages(7217, 17, R.string.string_book_7_chapter_2_page_17, 72));
    }

    private static void addItem(DataItemPages item) {
        dataItemPagesList.add(item);
    }
}
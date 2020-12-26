package com.xeniac.harrypotterstory.dataProviders.PagesDataProviderBook1;

import com.xeniac.harrypotterstory.R;
import com.xeniac.harrypotterstory.models.DataItemPages;

import java.util.ArrayList;
import java.util.List;

public class PagesDataProviderBook1_3 {

    public static List<DataItemPages> dataItemPagesList;

    static {
        dataItemPagesList = new ArrayList<>();

        addItem(new DataItemPages(131, 1, R.string.string_book_1_chapter_3_page_1, 13));
        addItem(new DataItemPages(132, 2, R.string.string_book_1_chapter_3_page_2, 13));
        addItem(new DataItemPages(133, 3, R.string.string_book_1_chapter_3_page_3, 13));
    }

    private static void addItem(DataItemPages item) {
        dataItemPagesList.add(item);
    }
}
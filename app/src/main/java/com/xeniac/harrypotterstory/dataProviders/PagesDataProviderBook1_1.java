package com.xeniac.harrypotterstory.dataProviders;

import com.xeniac.harrypotterstory.R;
import com.xeniac.harrypotterstory.models.DataItemPages;

import java.util.ArrayList;
import java.util.List;

public class PagesDataProviderBook1_1 {

    public static List<DataItemPages> dataItemPagesList;

    static {
        dataItemPagesList = new ArrayList<>();

        addItem(new DataItemPages("page_1", "1", R.string.string_book_1_page_1));
        addItem(new DataItemPages("page_2", "2", R.string.string_book_1_page_1));
        addItem(new DataItemPages("page_3", "3", R.string.string_book_1_page_1));
        addItem(new DataItemPages("page_4", "4", R.string.string_book_1_page_1));
        addItem(new DataItemPages("page_5", "5", R.string.string_book_1_page_1));
        addItem(new DataItemPages("page_6", "6", R.string.string_book_1_page_1));
        addItem(new DataItemPages("page_7", "7", R.string.string_book_1_page_1));
    }

    private static void addItem(DataItemPages item) {
        dataItemPagesList.add(item);
    }
}

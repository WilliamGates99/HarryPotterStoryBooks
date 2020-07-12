package com.xeniac.harrypotterstory.dataProviders;

import com.xeniac.harrypotterstory.R;
import com.xeniac.harrypotterstory.models.DataItemBooks;

import java.util.ArrayList;
import java.util.List;

public class BooksDataProvider {

    public static List<DataItemBooks> dataItemBooksList;

    static {
        dataItemBooksList = new ArrayList<>();

        addItem(new DataItemBooks(1, R.string.string_books_title_1, R.string.string_books_title_gist_1, "ic_cover_books_1.jpg"));
    }

    private static void addItem(DataItemBooks item) {
        dataItemBooksList.add(item);
    }
}
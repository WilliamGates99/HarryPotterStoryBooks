package com.xeniac.harrypotterstory.dataProviders;

import com.xeniac.harrypotterstory.R;
import com.xeniac.harrypotterstory.models.DataItemBooks;

import java.util.ArrayList;
import java.util.List;

public class BooksDataProvider {

    public static List<DataItemBooks> dataItemBooksList;

    static {
        dataItemBooksList = new ArrayList<>();

        addItem(new DataItemBooks("book_1", R.string.string_books_title_1, R.string.string_books_title_gist_1, "ic_cover_books_1.jpg"));
        addItem(new DataItemBooks("book_2", R.string.string_books_title_2, R.string.string_books_title_gist_2, "ic_cover_books_2.jpg"));
        addItem(new DataItemBooks("book_3", R.string.string_books_title_3, R.string.string_books_title_gist_3, "ic_cover_books_3.jpg"));
        addItem(new DataItemBooks("book_4", R.string.string_books_title_4, R.string.string_books_title_gist_4, "ic_cover_books_4.jpg"));
        addItem(new DataItemBooks("book_5", R.string.string_books_title_5, R.string.string_books_title_gist_5, "ic_cover_books_5.jpg"));
        addItem(new DataItemBooks("book_6", R.string.string_books_title_6, R.string.string_books_title_gist_6, "ic_cover_books_6.jpg"));
        addItem(new DataItemBooks("book_7", R.string.string_books_title_7, R.string.string_books_title_gist_7, "ic_cover_books_7.jpg"));
    }

    private static void addItem(DataItemBooks item) {
        dataItemBooksList.add(item);
    }
}
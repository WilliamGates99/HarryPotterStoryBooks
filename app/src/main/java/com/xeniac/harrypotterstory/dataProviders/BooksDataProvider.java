package com.xeniac.harrypotterstory.dataProviders;

import com.xeniac.harrypotterstory.R;
import com.xeniac.harrypotterstory.models.DataItemBooks;

import java.util.ArrayList;
import java.util.List;

public class BooksDataProvider {

    public static List<DataItemBooks> dataItemBooksList;

    static {
        dataItemBooksList = new ArrayList<>();

        addItem(new DataItemBooks(1, R.string.string_books_title_1, R.string.string_books_title_gist_1, "ic_cover_books_1.jpg", 309, 0));
        addItem(new DataItemBooks(2, R.string.string_books_title_2, R.string.string_books_title_gist_2, "ic_cover_books_2.jpg", 352, 0));
        addItem(new DataItemBooks(3, R.string.string_books_title_3, R.string.string_books_title_gist_3, "ic_cover_books_3.jpg", 435, 0));
        addItem(new DataItemBooks(4, R.string.string_books_title_4, R.string.string_books_title_gist_4, "ic_cover_books_4.jpg", 658, 0));
        addItem(new DataItemBooks(5, R.string.string_books_title_5, R.string.string_books_title_gist_5, "ic_cover_books_5.jpg", 870, 0));
        addItem(new DataItemBooks(6, R.string.string_books_title_6, R.string.string_books_title_gist_6, "ic_cover_books_6.jpg", 674, 0));
        addItem(new DataItemBooks(7, R.string.string_books_title_7, R.string.string_books_title_gist_7, "ic_cover_books_7.jpg", 770, 0));
    }

    private static void addItem(DataItemBooks item) {
        dataItemBooksList.add(item);
    }
}
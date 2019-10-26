package com.xeniac.harrypotterstory.database.chaptersDataBase;

import com.xeniac.harrypotterstory.database.booksDataBase.BooksTable;

public class ChaptersTable {
    static final String TABLE_CHAPTERS = "chapters";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_NUMBER = "number";
    public static final String COLUMN_TITLE = "title";
    public static final String COLUMN_TOTAL_PAGES = "totalPages";
    public static final String COLUMN_READ_PAGES = "readPages";
    public static final String COLUMN_BOOK_ID = "bookId";
    public static final String COLUMN_COVER = "cover";
    public static final String COLUMN_FAVORITE = "favorite";
    public static final String COLUMN_READING = "reading";

    static final String[] ALL_IDS = {COLUMN_ID};
    static final String[] ALL_COLUMNS = {COLUMN_ID, COLUMN_NUMBER, COLUMN_TITLE, COLUMN_TOTAL_PAGES,
            COLUMN_READ_PAGES, COLUMN_BOOK_ID, COLUMN_COVER, COLUMN_FAVORITE, COLUMN_READING};

    public static final String SQL_CREATE =
            "CREATE TABLE " + TABLE_CHAPTERS + "(" +
                    COLUMN_ID + " INTEGER PRIMARY KEY," +
                    COLUMN_NUMBER + " INTEGER," +
                    COLUMN_TITLE + " INTEGER," +
                    COLUMN_TOTAL_PAGES + " INTEGER," +
                    COLUMN_READ_PAGES + " INTEGER," +
                    COLUMN_BOOK_ID + " INTEGER," +
                    COLUMN_COVER + " TEXT," +
                    COLUMN_FAVORITE + " INTEGER," +
                    COLUMN_READING + " INTEGER," +
                    "FOREIGN KEY (" + COLUMN_BOOK_ID + ") REFERENCES books(" + BooksTable.COLUMN_ID + "));";
}
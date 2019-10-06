package com.xeniac.harrypotterstory.database;

public class ChaptersTable {
    static final String TABLE_CHAPTERS = "chapters";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_NUMBER = "number";
    public static final String COLUMN_TITLE = "title";
    public static final String COLUMN_PAGE = "page";
    public static final String COLUMN_BOOK_TITLE = "bookTitle";
    public static final String COLUMN_FAVORITE = "favorite";

    static final String[] ALL_IDS = {COLUMN_ID};
    static final String[] ALL_COLUMNS = {COLUMN_ID, COLUMN_NUMBER, COLUMN_TITLE,
            COLUMN_PAGE, COLUMN_BOOK_TITLE, COLUMN_FAVORITE};

    static final String SQL_CREATE =
            "CREATE TABLE " + TABLE_CHAPTERS + "(" +
                    COLUMN_ID + " TEXT PRIMARY KEY," +
                    COLUMN_NUMBER + " TEXT," +
                    COLUMN_TITLE + " INTEGER," +
                    COLUMN_PAGE + " TEXT," +
                    COLUMN_BOOK_TITLE + " INTEGER," +
                    COLUMN_FAVORITE + " INTEGER" + ");";
}

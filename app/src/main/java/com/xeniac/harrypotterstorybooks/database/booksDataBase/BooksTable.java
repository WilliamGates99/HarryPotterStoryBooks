package com.xeniac.harrypotterstorybooks.database.booksDataBase;

public class BooksTable {
    static final String TABLE_BOOKS = "books";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_TITLE = "title";
    public static final String COLUMN_GIST = "gist";
    public static final String COLUMN_COVER = "cover";

    static final String[] ALL_IDS = {COLUMN_ID};
    static final String[] ALL_COLUMNS = {COLUMN_ID, COLUMN_TITLE, COLUMN_GIST, COLUMN_COVER};

    public static final String SQL_CREATE =
            "CREATE TABLE " + TABLE_BOOKS + "(" +
                    COLUMN_ID + " INTEGER PRIMARY KEY," +
                    COLUMN_TITLE + " INTEGER," +
                    COLUMN_GIST + " INTEGER," +
                    COLUMN_COVER + " TEXT" + ");";
}
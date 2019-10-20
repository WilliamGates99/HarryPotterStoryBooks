package com.xeniac.harrypotterstory.database;

public class PagesTable {
    static final String TABLE_PAGES = "pages";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_NUMBER = "number";
    public static final String COLUMN_TEXT = "text";
    public static final String COLUMN_CHAPTER_ID = "chapterId";
    public static final String COLUMN_READ = "read";

    static final String[] ALL_IDS = {COLUMN_ID};
    static final String[] ALL_COLUMNS = {COLUMN_ID, COLUMN_NUMBER, COLUMN_TEXT, COLUMN_READ};

    static final String SQL_CREATE =
            "CREATE TABLE " + TABLE_PAGES + "(" +
                    COLUMN_ID + " TEXT PRIMARY KEY," +
                    COLUMN_NUMBER + " INTEGER," +
                    COLUMN_TEXT + " INTEGER," +
                    COLUMN_CHAPTER_ID + " TEXT," +
                    COLUMN_READ + " INTEGER" + ");";
}

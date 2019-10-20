package com.xeniac.harrypotterstory.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBOpenHelper extends SQLiteOpenHelper {

    private static final String DB_FILE_NAME = "harry_potter_story.db";
    private static int DB_VERSION = 1;

    DBOpenHelper(@Nullable Context context) {
        super(context, DB_FILE_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(ChaptersTable.SQL_CREATE);
        db.execSQL(PagesTable.SQL_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        oldVersion = DB_VERSION;
        newVersion = oldVersion + 1;
        DB_VERSION = newVersion;
    }
}
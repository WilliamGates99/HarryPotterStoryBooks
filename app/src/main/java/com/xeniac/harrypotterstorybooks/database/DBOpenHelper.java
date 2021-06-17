package com.xeniac.harrypotterstorybooks.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.xeniac.harrypotterstorybooks.Constants;
import com.xeniac.harrypotterstorybooks.database.booksDataBase.BooksTable;
import com.xeniac.harrypotterstorybooks.database.chaptersDataBase.ChaptersTable;
import com.xeniac.harrypotterstorybooks.database.pagesDataBase.PagesTable;

public class DBOpenHelper extends SQLiteOpenHelper {

    private static int DB_VERSION = 1;

    public DBOpenHelper(@Nullable Context context) {
        super(context, Constants.DB_FILE_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(BooksTable.SQL_CREATE);
        db.execSQL(ChaptersTable.SQL_CREATE);
        db.execSQL(PagesTable.SQL_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        oldVersion = DB_VERSION;
        newVersion = oldVersion + 1;
        DB_VERSION = newVersion;
    }

    @Override
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        oldVersion = DB_VERSION;
        newVersion = oldVersion - 1;
        DB_VERSION = newVersion;
    }
}
package com.xeniac.harrypotterstory.database.pagesDataBase;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

import com.xeniac.harrypotterstory.database.DBOpenHelper;
import com.xeniac.harrypotterstory.models.DataItemPages;

import java.util.ArrayList;
import java.util.List;

public class PagesDataSource {

    private SQLiteDatabase mDatabase;
    private SQLiteOpenHelper mDbOpenHelper;

    public PagesDataSource(Context context) {
        mDbOpenHelper = new DBOpenHelper(context);
        mDatabase = mDbOpenHelper.getWritableDatabase();
    }

    public void open() {
        mDatabase = mDbOpenHelper.getWritableDatabase();
    }

    public void close() {
        mDbOpenHelper.close();
    }

    private void createItem(DataItemPages item) {
        ContentValues values = item.toValues();
        mDatabase.insert(PagesTable.TABLE_PAGES, null, values);
    }

    public void seedDataBase(List<DataItemPages> dataItemPagesList) {
        for (DataItemPages item : dataItemPagesList) {
            try {
                boolean pageExists = pageExist(item.getId());
                if (!pageExists) {
                    createItem(item);
                }
            } catch (SQLiteException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean pageExist(int pageId) {
        String[] pagesId = {String.valueOf(pageId)};
        Cursor cursor = mDatabase.query(PagesTable.TABLE_PAGES, PagesTable.ALL_IDS,
                PagesTable.COLUMN_ID + "=?", pagesId,
                null, null, null);

        boolean exists = (cursor.getCount() > 0);
        cursor.close();
        return exists;
    }

    public List<DataItemPages> getAllItems(int chapterId) {
        List<DataItemPages> dataItemPagesList = new ArrayList<>();

        Cursor cursor;

        if (chapterId == 0) {
            cursor = mDatabase.query(PagesTable.TABLE_PAGES, PagesTable.ALL_COLUMNS, null,
                    null, null, null, null);
        } else {
            String[] chapterIds = {String.valueOf(chapterId)};
            cursor = mDatabase.query(PagesTable.TABLE_PAGES,
                    PagesTable.ALL_COLUMNS, PagesTable.COLUMN_CHAPTER_ID + "=?",
                    chapterIds, null, null, null);
        }

        while (cursor.moveToNext()) {
            DataItemPages item = new DataItemPages();
            item.setId(cursor.getInt(cursor.getColumnIndex(PagesTable.COLUMN_ID)));
            item.setNumber(cursor.getInt(cursor.getColumnIndex(PagesTable.COLUMN_NUMBER)));
            item.setText(cursor.getInt(cursor.getColumnIndex(PagesTable.COLUMN_TEXT)));
            item.setChapterId(cursor.getInt(cursor.getColumnIndex(PagesTable.COLUMN_CHAPTER_ID)));
            dataItemPagesList.add(item);
        }

        cursor.close();
        return dataItemPagesList;
    }
}
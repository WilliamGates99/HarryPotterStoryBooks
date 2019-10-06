package com.xeniac.harrypotterstory.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

import com.xeniac.harrypotterstory.models.DataItemChapters;

import java.util.ArrayList;
import java.util.List;

public class DataSource {

    private SQLiteDatabase mDatabase;
    private SQLiteOpenHelper mDbOpenHelper;

    public DataSource(Context context) {
        mDbOpenHelper = new DBOpenHelper(context);
        mDatabase = mDbOpenHelper.getWritableDatabase();
    }

    public void open() {
        mDatabase = mDbOpenHelper.getWritableDatabase();
    }

    public void close() {
        mDbOpenHelper.close();
    }

    private void createItem(DataItemChapters item) {
        ContentValues values = item.toValues();
        mDatabase.insert(ChaptersTable.TABLE_CHAPTERS, null, values);
    }

    public void seedDataBase(List<DataItemChapters> dataItemChaptersList) {
        for (DataItemChapters item : dataItemChaptersList) {
            try {
                boolean chapterExists = chapterExist(item.getId());
                if (!chapterExists) {
                    createItem(item);
                }
            } catch (SQLiteException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean chapterExist(String chapterId) {
        String[] quantitiesId = {chapterId};
        Cursor cursor = mDatabase.query(ChaptersTable.TABLE_CHAPTERS, ChaptersTable.ALL_IDS,
                ChaptersTable.COLUMN_ID + "=?", quantitiesId, null,
                null, ChaptersTable.COLUMN_TITLE);

        boolean exists = (cursor.getCount() > 0);
        cursor.close();
        return exists;
    }

    public List<DataItemChapters> getAllItems(int bookFilter, boolean favoriteFilter) {
        List<DataItemChapters> dataItemChaptersList = new ArrayList<>();

        Cursor cursor;

        if (bookFilter == 0 && favoriteFilter) {
            String[] favorites = {"1"};
            cursor = mDatabase.query(ChaptersTable.TABLE_CHAPTERS,
                    ChaptersTable.ALL_COLUMNS, ChaptersTable.COLUMN_FAVORITE + "=?",
                    favorites, null, null, null);
        } else {
            String[] books = {String.valueOf(bookFilter)};
            cursor = mDatabase.query(ChaptersTable.TABLE_CHAPTERS,
                    ChaptersTable.ALL_COLUMNS, ChaptersTable.COLUMN_BOOK_TITLE + "=?",
                    books, null, null, null);
        }

        while (cursor.moveToNext()) {
            DataItemChapters item = new DataItemChapters();
            item.setId(cursor.getString(cursor.getColumnIndex(ChaptersTable.COLUMN_ID)));
            item.setNumber(cursor.getString(cursor.getColumnIndex(ChaptersTable.COLUMN_NUMBER)));
            item.setTitle(cursor.getInt(cursor.getColumnIndex(ChaptersTable.COLUMN_TITLE)));
            item.setPage(cursor.getString(cursor.getColumnIndex(ChaptersTable.COLUMN_PAGE)));
            item.setBookTitle(cursor.getInt(cursor.getColumnIndex(ChaptersTable.COLUMN_BOOK_TITLE)));
            item.setFavorite(cursor.getInt(cursor.getColumnIndex(ChaptersTable.COLUMN_FAVORITE)) > 0);
            dataItemChaptersList.add(item);
        }

        cursor.close();
        return dataItemChaptersList;
    }

    public void updateFavorite(DataItemChapters item) {
        String[] ids = {item.getId()};

        ContentValues values = new ContentValues();
        values.put(ChaptersTable.COLUMN_ID, item.getId());
        values.put(ChaptersTable.COLUMN_NUMBER, item.getNumber());
        values.put(ChaptersTable.COLUMN_TITLE, item.getTitle());
        values.put(ChaptersTable.COLUMN_PAGE, item.getPage());
        values.put(ChaptersTable.COLUMN_BOOK_TITLE, item.getBookTitle());
        values.put(ChaptersTable.COLUMN_FAVORITE, item.isFavorite());

        mDatabase.update(ChaptersTable.TABLE_CHAPTERS, values,
                ChaptersTable.COLUMN_ID + "=?", ids);
    }
}
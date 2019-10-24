package com.xeniac.harrypotterstory.database.chaptersDataBase;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

import com.xeniac.harrypotterstory.database.DBOpenHelper;
import com.xeniac.harrypotterstory.models.DataItemChapters;

import java.util.ArrayList;
import java.util.List;

public class ChaptersDataSource {

    private SQLiteDatabase mDatabase;
    private SQLiteOpenHelper mDbOpenHelper;

    public ChaptersDataSource(Context context) {
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
        String[] chaptersId = {chapterId};
        Cursor cursor = mDatabase.query(ChaptersTable.TABLE_CHAPTERS, ChaptersTable.ALL_IDS,
                ChaptersTable.COLUMN_ID + "=?", chaptersId,
                null, null, null);

        boolean exists = (cursor.getCount() > 0);
        cursor.close();
        return exists;
    }

    public List<DataItemChapters> getAllItems(String bookFilter, boolean favoriteFilter) {
        List<DataItemChapters> dataItemChaptersList = new ArrayList<>();

        Cursor cursor;

        if (bookFilter == null && favoriteFilter) {
            String[] favorites = {"1"};
            cursor = mDatabase.query(ChaptersTable.TABLE_CHAPTERS,
                    ChaptersTable.ALL_COLUMNS, ChaptersTable.COLUMN_FAVORITE + "=?",
                    favorites, null, null, null);
        } else if (bookFilter != null && !favoriteFilter) {
            String[] books = {bookFilter};
            cursor = mDatabase.query(ChaptersTable.TABLE_CHAPTERS,
                    ChaptersTable.ALL_COLUMNS, ChaptersTable.COLUMN_BOOK_ID + "=?",
                    books, null, null, null);
        } else {
            cursor = mDatabase.query(ChaptersTable.TABLE_CHAPTERS, ChaptersTable.ALL_COLUMNS,
                    null, null, null, null, null);
        }

        while (cursor.moveToNext()) {
            DataItemChapters item = new DataItemChapters();
            item.setId(cursor.getString(cursor.getColumnIndex(ChaptersTable.COLUMN_ID)));
            item.setNumber(cursor.getInt(cursor.getColumnIndex(ChaptersTable.COLUMN_NUMBER)));
            item.setTitle(cursor.getInt(cursor.getColumnIndex(ChaptersTable.COLUMN_TITLE)));
            item.setTotalPages(cursor.getInt(cursor.getColumnIndex(ChaptersTable.COLUMN_TOTAL_PAGES)));
            item.setReadPages(cursor.getInt(cursor.getColumnIndex(ChaptersTable.COLUMN_READ_PAGES)));
            item.setBookId(cursor.getString(cursor.getColumnIndex(ChaptersTable.COLUMN_BOOK_ID)));
            item.setCover(cursor.getString(cursor.getColumnIndex(ChaptersTable.COLUMN_COVER)));
            item.setFavorite(cursor.getInt(cursor.getColumnIndex(ChaptersTable.COLUMN_FAVORITE)) > 0);
            item.setReading(cursor.getInt(cursor.getColumnIndex(ChaptersTable.COLUMN_READING)) > 0);
            dataItemChaptersList.add(item);
        }

        cursor.close();
        return dataItemChaptersList;
    }

    public DataItemChapters getReadingItem() {
        DataItemChapters item = new DataItemChapters();

        String[] favorites = {"1"};
        Cursor cursor = mDatabase.query(ChaptersTable.TABLE_CHAPTERS,
                ChaptersTable.ALL_COLUMNS, ChaptersTable.COLUMN_READING + "=?",
                favorites, null, null, null);

        while (cursor.moveToNext()) {
            item.setId(cursor.getString(cursor.getColumnIndex(ChaptersTable.COLUMN_ID)));
            item.setNumber(cursor.getInt(cursor.getColumnIndex(ChaptersTable.COLUMN_NUMBER)));
            item.setTitle(cursor.getInt(cursor.getColumnIndex(ChaptersTable.COLUMN_TITLE)));
            item.setTotalPages(cursor.getInt(cursor.getColumnIndex(ChaptersTable.COLUMN_TOTAL_PAGES)));
            item.setReadPages(cursor.getInt(cursor.getColumnIndex(ChaptersTable.COLUMN_READ_PAGES)));
            item.setBookId(cursor.getString(cursor.getColumnIndex(ChaptersTable.COLUMN_BOOK_ID)));
            item.setCover(cursor.getString(cursor.getColumnIndex(ChaptersTable.COLUMN_COVER)));
            item.setFavorite(cursor.getInt(cursor.getColumnIndex(ChaptersTable.COLUMN_FAVORITE)) > 0);
            item.setReading(cursor.getInt(cursor.getColumnIndex(ChaptersTable.COLUMN_READING)) > 0);
        }

        cursor.close();
        return item;
    }

    public void updateFavorite(DataItemChapters item) {
        String[] ids = {item.getId()};

        ContentValues values = new ContentValues();
        values.put(ChaptersTable.COLUMN_ID, item.getId());
        values.put(ChaptersTable.COLUMN_NUMBER, item.getNumber());
        values.put(ChaptersTable.COLUMN_TITLE, item.getTitle());
        values.put(ChaptersTable.COLUMN_TOTAL_PAGES, item.getTotalPages());
        values.put(ChaptersTable.COLUMN_READ_PAGES, item.getReadPages());
        values.put(ChaptersTable.COLUMN_BOOK_ID, item.getBookId());
        values.put(ChaptersTable.COLUMN_COVER, item.getCover());
        values.put(ChaptersTable.COLUMN_FAVORITE, item.isFavorite());
        values.put(ChaptersTable.COLUMN_READING, item.isReading());

        mDatabase.update(ChaptersTable.TABLE_CHAPTERS, values,
                ChaptersTable.COLUMN_ID + "=?", ids);
    }

    public void updateReading(DataItemChapters item) {
        String[] ids = {item.getId()};

        ContentValues values = new ContentValues();
        values.put(ChaptersTable.COLUMN_ID, item.getId());
        values.put(ChaptersTable.COLUMN_NUMBER, item.getNumber());
        values.put(ChaptersTable.COLUMN_TITLE, item.getTitle());
        values.put(ChaptersTable.COLUMN_TOTAL_PAGES, item.getTotalPages());
        values.put(ChaptersTable.COLUMN_READ_PAGES, item.getReadPages());
        values.put(ChaptersTable.COLUMN_BOOK_ID, item.getBookId());
        values.put(ChaptersTable.COLUMN_COVER, item.getCover());
        values.put(ChaptersTable.COLUMN_FAVORITE, item.isFavorite());
        values.put(ChaptersTable.COLUMN_READING, item.isReading());

        mDatabase.update(ChaptersTable.TABLE_CHAPTERS, values,
                ChaptersTable.COLUMN_ID + "=?", ids);
    }

    public void updateReadPages(DataItemChapters item) {
        String[] ids = {item.getId()};

        ContentValues values = new ContentValues();
        values.put(ChaptersTable.COLUMN_ID, item.getId());
        values.put(ChaptersTable.COLUMN_NUMBER, item.getNumber());
        values.put(ChaptersTable.COLUMN_TITLE, item.getTitle());
        values.put(ChaptersTable.COLUMN_TOTAL_PAGES, item.getTotalPages());
        values.put(ChaptersTable.COLUMN_READ_PAGES, item.getReadPages());
        values.put(ChaptersTable.COLUMN_BOOK_ID, item.getBookId());
        values.put(ChaptersTable.COLUMN_COVER, item.getCover());
        values.put(ChaptersTable.COLUMN_FAVORITE, item.isFavorite());
        values.put(ChaptersTable.COLUMN_READING, item.isReading());

        mDatabase.update(ChaptersTable.TABLE_CHAPTERS, values,
                ChaptersTable.COLUMN_ID + "=?", ids);
    }
}
package com.xeniac.harrypotterstorybooks.database.chaptersDataBase;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

import com.xeniac.harrypotterstorybooks.database.DBOpenHelper;
import com.xeniac.harrypotterstorybooks.models.DataItemChapters;

import java.util.ArrayList;
import java.util.List;

public class ChaptersDataSource {

    private SQLiteDatabase mDatabase;
    private final SQLiteOpenHelper mDbOpenHelper;

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

    private boolean chapterExist(int chapterId) {
        String[] chapterIds = {String.valueOf(chapterId)};
        Cursor cursor = mDatabase.query(ChaptersTable.TABLE_CHAPTERS, ChaptersTable.ALL_IDS,
                ChaptersTable.COLUMN_ID + "=?", chapterIds,
                null, null, null);

        boolean exists = (cursor.getCount() > 0);
        cursor.close();
        return exists;
    }

    public List<DataItemChapters> getAllItems(int bookId, boolean favorite) {
        List<DataItemChapters> dataItemChaptersList = new ArrayList<>();

        Cursor cursor;

        if (bookId == 0 && favorite) {
            String[] favorites = {"1"};
            cursor = mDatabase.query(ChaptersTable.TABLE_CHAPTERS,
                    ChaptersTable.ALL_COLUMNS, ChaptersTable.COLUMN_FAVORITE + "=?",
                    favorites, null, null, null);
        } else if (bookId != 0 && !favorite) {
            String[] bookIds = {String.valueOf(bookId)};
            cursor = mDatabase.query(ChaptersTable.TABLE_CHAPTERS,
                    ChaptersTable.ALL_COLUMNS, ChaptersTable.COLUMN_BOOK_ID + "=?",
                    bookIds, null, null, null);
        } else {
            cursor = mDatabase.query(ChaptersTable.TABLE_CHAPTERS, ChaptersTable.ALL_COLUMNS,
                    null, null, null, null, null);
        }

        while (cursor.moveToNext()) {
            DataItemChapters item = new DataItemChapters();
            item.setId(cursor.getInt(cursor.getColumnIndex(ChaptersTable.COLUMN_ID)));
            item.setNumber(cursor.getInt(cursor.getColumnIndex(ChaptersTable.COLUMN_NUMBER)));
            item.setTitle(cursor.getInt(cursor.getColumnIndex(ChaptersTable.COLUMN_TITLE)));
            item.setPages(cursor.getInt(cursor.getColumnIndex(ChaptersTable.COLUMN_PAGES)));
            item.setTotalScroll(cursor.getInt(cursor.getColumnIndex(ChaptersTable.COLUMN_TOTAL_SCROLL)));
            item.setReadScroll(cursor.getInt(cursor.getColumnIndex(ChaptersTable.COLUMN_READ_SCROLL)));
            item.setBookId(cursor.getInt(cursor.getColumnIndex(ChaptersTable.COLUMN_BOOK_ID)));
            item.setCover(cursor.getString(cursor.getColumnIndex(ChaptersTable.COLUMN_COVER)));
            item.setFavorite(cursor.getInt(cursor.getColumnIndex(ChaptersTable.COLUMN_FAVORITE)) > 0);
            item.setReleased(cursor.getInt(cursor.getColumnIndex(ChaptersTable.COLUMN_RELEASED)) > 0);
            dataItemChaptersList.add(item);
        }

        cursor.close();
        return dataItemChaptersList;
    }

    public DataItemChapters getReadingItem(int chapterId) {
        DataItemChapters item = new DataItemChapters();

        String[] chapterIds = {String.valueOf(chapterId)};
        Cursor cursor = mDatabase.query(ChaptersTable.TABLE_CHAPTERS,
                ChaptersTable.ALL_COLUMNS, ChaptersTable.COLUMN_ID + "=?",
                chapterIds, null, null, null);

        while (cursor.moveToNext()) {
            item.setId(cursor.getInt(cursor.getColumnIndex(ChaptersTable.COLUMN_ID)));
            item.setNumber(cursor.getInt(cursor.getColumnIndex(ChaptersTable.COLUMN_NUMBER)));
            item.setTitle(cursor.getInt(cursor.getColumnIndex(ChaptersTable.COLUMN_TITLE)));
            item.setPages(cursor.getInt(cursor.getColumnIndex(ChaptersTable.COLUMN_PAGES)));
            item.setTotalScroll(cursor.getInt(cursor.getColumnIndex(ChaptersTable.COLUMN_TOTAL_SCROLL)));
            item.setReadScroll(cursor.getInt(cursor.getColumnIndex(ChaptersTable.COLUMN_READ_SCROLL)));
            item.setBookId(cursor.getInt(cursor.getColumnIndex(ChaptersTable.COLUMN_BOOK_ID)));
            item.setCover(cursor.getString(cursor.getColumnIndex(ChaptersTable.COLUMN_COVER)));
            item.setFavorite(cursor.getInt(cursor.getColumnIndex(ChaptersTable.COLUMN_FAVORITE)) > 0);
            item.setReleased(cursor.getInt(cursor.getColumnIndex(ChaptersTable.COLUMN_RELEASED)) > 0);
        }

        cursor.close();
        return item;
    }

    public void updateChapters(DataItemChapters item) {
        String[] ids = {String.valueOf(item.getId())};

        ContentValues values = new ContentValues();
        values.put(ChaptersTable.COLUMN_ID, item.getId());
        values.put(ChaptersTable.COLUMN_NUMBER, item.getNumber());
        values.put(ChaptersTable.COLUMN_TITLE, item.getTitle());
        values.put(ChaptersTable.COLUMN_PAGES, item.getPages());
        values.put(ChaptersTable.COLUMN_TOTAL_SCROLL, item.getTotalScroll());
        values.put(ChaptersTable.COLUMN_READ_SCROLL, item.getReadScroll());
        values.put(ChaptersTable.COLUMN_BOOK_ID, item.getBookId());
        values.put(ChaptersTable.COLUMN_COVER, item.getCover());
        values.put(ChaptersTable.COLUMN_FAVORITE, item.isFavorite());
        values.put(ChaptersTable.COLUMN_RELEASED, item.isReleased());

        mDatabase.update(ChaptersTable.TABLE_CHAPTERS, values,
                ChaptersTable.COLUMN_ID + "=?", ids);
    }
}
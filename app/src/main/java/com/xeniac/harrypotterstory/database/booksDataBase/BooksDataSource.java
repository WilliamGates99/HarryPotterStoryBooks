package com.xeniac.harrypotterstory.database.booksDataBase;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

import com.xeniac.harrypotterstory.database.DBOpenHelper;
import com.xeniac.harrypotterstory.models.DataItemBooks;

import java.util.ArrayList;
import java.util.List;

public class BooksDataSource {

    private SQLiteDatabase mDatabase;
    private SQLiteOpenHelper mDbOpenHelper;

    public BooksDataSource(Context context) {
        mDbOpenHelper = new DBOpenHelper(context);
        mDatabase = mDbOpenHelper.getWritableDatabase();
    }

    public void open() {
        mDatabase = mDbOpenHelper.getWritableDatabase();
    }

    public void close() {
        mDbOpenHelper.close();
    }

    private void createItem(DataItemBooks item) {
        ContentValues values = item.toValues();
        mDatabase.insert(BooksTable.TABLE_BOOKS, null, values);
    }

    public void seedDataBase(List<DataItemBooks> dataItemBooksList) {
        for (DataItemBooks item : dataItemBooksList) {
            try {
                boolean bookExists = bookExist(item.getId());
                if (!bookExists) {
                    createItem(item);
                }
            } catch (SQLiteException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean bookExist(int bookId) {
        String[] booksId = {String.valueOf(bookId)};
        Cursor cursor = mDatabase.query(BooksTable.TABLE_BOOKS, BooksTable.ALL_IDS,
                BooksTable.COLUMN_ID + "=?", booksId,
                null, null, null);

        boolean exists = (cursor.getCount() > 0);
        cursor.close();
        return exists;
    }

    public List<DataItemBooks> getAllItems() {
        List<DataItemBooks> dataItemBooksList = new ArrayList<>();

        Cursor cursor = mDatabase.query(BooksTable.TABLE_BOOKS, BooksTable.ALL_COLUMNS,
                null, null, null, null, null);

        while (cursor.moveToNext()) {
            DataItemBooks item = new DataItemBooks();
            item.setId(cursor.getInt(cursor.getColumnIndex(BooksTable.COLUMN_ID)));
            item.setTitle(cursor.getInt(cursor.getColumnIndex(BooksTable.COLUMN_TITLE)));
            item.setGist(cursor.getInt(cursor.getColumnIndex(BooksTable.COLUMN_GIST)));
            item.setCover(cursor.getString(cursor.getColumnIndex(BooksTable.COLUMN_COVER)));
            dataItemBooksList.add(item);
        }

        cursor.close();
        return dataItemBooksList;
    }

    public int getBookTitle(int bookFilter) {
        int bookTitle = 0;

        String[] bookId = {String.valueOf(bookFilter)};
        Cursor cursor = mDatabase.query(BooksTable.TABLE_BOOKS, BooksTable.ALL_COLUMNS,
                BooksTable.COLUMN_ID + "=?", bookId, null, null, null);

        while (cursor.moveToNext()) {
            bookTitle = cursor.getInt(cursor.getColumnIndex(BooksTable.COLUMN_TITLE));
        }

        cursor.close();
        return bookTitle;
    }

    public String getBookCover(int bookFilter) {
        String bookCover = null;

        String[] bookId = {String.valueOf(bookFilter)};
        Cursor cursor = mDatabase.query(BooksTable.TABLE_BOOKS, BooksTable.ALL_COLUMNS,
                BooksTable.COLUMN_ID + "=?", bookId, null, null, null);

        while (cursor.moveToNext()) {
            bookCover = cursor.getString(cursor.getColumnIndex(BooksTable.COLUMN_COVER));
        }

        cursor.close();
        return bookCover;
    }
}
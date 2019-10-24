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

    private boolean bookExist(String bookId) {
        String[] booksId = {bookId};
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
            item.setId(cursor.getString(cursor.getColumnIndex(BooksTable.COLUMN_ID)));
            item.setTitle(cursor.getInt(cursor.getColumnIndex(BooksTable.COLUMN_TITLE)));
            item.setGist(cursor.getInt(cursor.getColumnIndex(BooksTable.COLUMN_GIST)));
            item.setCover(cursor.getString(cursor.getColumnIndex(BooksTable.COLUMN_COVER)));
            item.setTotalPages(cursor.getInt(cursor.getColumnIndex(BooksTable.COLUMN_TOTAL_PAGES)));
            item.setReadPages(cursor.getInt(cursor.getColumnIndex(BooksTable.COLUMN_READ_PAGES)));
            dataItemBooksList.add(item);
        }

        cursor.close();
        return dataItemBooksList;
    }

    public int getBookTitle(String bookFilter) {
        int bookTitle = 0;

        String[] bookId = {bookFilter};
        Cursor cursor = mDatabase.query(BooksTable.TABLE_BOOKS, BooksTable.ALL_COLUMNS,
                BooksTable.COLUMN_ID + "=?", bookId, null, null, null);

        while (cursor.moveToNext()) {
            bookTitle = cursor.getInt(cursor.getColumnIndex(BooksTable.COLUMN_TITLE));
        }

        cursor.close();
        return bookTitle;
    }

//    public void updateFavorite(DataItemBooks item) {
//        String[] ids = {item.getId()};
//
//        ContentValues values = new ContentValues();
//        values.put(BooksTable.COLUMN_ID, item.getId());
//        values.put(BooksTable.COLUMN_TITLE, item.getTitle());
//        values.put(BooksTable.COLUMN_GIST, item.getGist());
//        values.put(BooksTable.COLUMN_COVER, item.getCover());
//        values.put(BooksTable.COLUMN_TOTAL_PAGES, item.getTotalPages());
//        values.put(BooksTable.COLUMN_READ_PAGES, item.getReadPages());
//
//        mDatabase.update(BooksTable.TABLE_BOOKS, values,
//                BooksTable.COLUMN_ID + "=?", ids);
//    }
}

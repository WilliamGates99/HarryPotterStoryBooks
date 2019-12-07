package com.xeniac.harrypotterstory.models;

import android.content.ContentValues;

import com.xeniac.harrypotterstory.database.booksDataBase.BooksTable;

public class DataItemBooks {

    private int id;
    private int title;
    private int gist;
    private String cover;

    public DataItemBooks() {
    }

    public DataItemBooks(int id, int title, int gist, String cover) {
        this.id = id;
        this.title = title;
        this.gist = gist;
        this.cover = cover;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTitle() {
        return title;
    }

    public void setTitle(int title) {
        this.title = title;
    }

    public int getGist() {
        return gist;
    }

    public void setGist(int gist) {
        this.gist = gist;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public ContentValues toValues() {
        ContentValues values = new ContentValues(4);

        values.put(BooksTable.COLUMN_ID, id);
        values.put(BooksTable.COLUMN_TITLE, title);
        values.put(BooksTable.COLUMN_GIST, gist);
        values.put(BooksTable.COLUMN_COVER, cover);

        return values;
    }

    @Override
    public String toString() {
        return "DataItemBooks{" +
                "id=" + id +
                ", title=" + title +
                ", gist=" + gist +
                ", cover='" + cover + '\'' +
                '}';
    }
}
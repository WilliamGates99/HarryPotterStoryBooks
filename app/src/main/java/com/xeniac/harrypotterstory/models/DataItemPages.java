package com.xeniac.harrypotterstory.models;

import android.content.ContentValues;

import com.xeniac.harrypotterstory.database.PagesTable;

public class DataItemPages {

    private String id;
    private int number;
    private int text;
    private String chapterId;
    private boolean read;

    public DataItemPages() {
    }

    public DataItemPages(String id, int number, int text, String chapterId, boolean read) {
        this.id = id;
        this.number = number;
        this.text = text;
        this.chapterId = chapterId;
        this.read = read;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getText() {
        return text;
    }

    public void setText(int text) {
        this.text = text;
    }

    public String getChapterId() {
        return chapterId;
    }

    public void setChapterId(String chapterId) {
        this.chapterId = chapterId;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public ContentValues toValues() {
        ContentValues values = new ContentValues(5);

        values.put(PagesTable.COLUMN_ID, id);
        values.put(PagesTable.COLUMN_NUMBER, number);
        values.put(PagesTable.COLUMN_TEXT, text);
        values.put(PagesTable.COLUMN_CHAPTER_ID, chapterId);
        values.put(PagesTable.COLUMN_READ, read);

        return values;
    }

    @Override
    public String toString() {
        return "DataItemPages{" +
                "id='" + id + '\'' +
                ", number=" + number +
                ", text=" + text +
                ", chapterId='" + chapterId + '\'' +
                ", read=" + read +
                '}';
    }
}

package com.xeniac.harrypotterstory.models;

import android.content.ContentValues;

import com.xeniac.harrypotterstory.database.pagesDataBase.PagesTable;

public class DataItemPages {

    private int id;
    private int number;
    private int text;
    private int chapterId;

    public DataItemPages() {
    }

    public DataItemPages(int id, int number, int text, int chapterId) {
        this.id = id;
        this.number = number;
        this.text = text;
        this.chapterId = chapterId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getChapterId() {
        return chapterId;
    }

    public void setChapterId(int chapterId) {
        this.chapterId = chapterId;
    }

    public ContentValues toValues() {
        ContentValues values = new ContentValues(4);

        values.put(PagesTable.COLUMN_ID, id);
        values.put(PagesTable.COLUMN_NUMBER, number);
        values.put(PagesTable.COLUMN_TEXT, text);
        values.put(PagesTable.COLUMN_CHAPTER_ID, chapterId);

        return values;
    }

    @Override
    public String toString() {
        return "DataItemPages{" +
                "id=" + id +
                ", number=" + number +
                ", text=" + text +
                ", chapterId=" + chapterId +
                '}';
    }
}
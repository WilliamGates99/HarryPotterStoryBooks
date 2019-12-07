package com.xeniac.harrypotterstory.models;

import android.content.ContentValues;

import com.xeniac.harrypotterstory.database.chaptersDataBase.ChaptersTable;

public class DataItemChapters {

    private int id;
    private int number;
    private int title;
    private int pages;
    private int totalScroll;
    private int readScroll;
    private int bookId;
    private String cover;
    private boolean favorite;
    private boolean released;

    public DataItemChapters() {
    }

    public DataItemChapters(int id, int number, int title, int pages, int totalScroll,
                            int readScroll, int bookId, String cover,
                            boolean favorite, boolean released) {
        this.id = id;
        this.number = number;
        this.title = title;
        this.pages = pages;
        this.totalScroll = totalScroll;
        this.readScroll = readScroll;
        this.bookId = bookId;
        this.cover = cover;
        this.favorite = favorite;
        this.released = released;
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

    public int getTitle() {
        return title;
    }

    public void setTitle(int title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getTotalScroll() {
        return totalScroll;
    }

    public void setTotalScroll(int totalScroll) {
        this.totalScroll = totalScroll;
    }

    public int getReadScroll() {
        return readScroll;
    }

    public void setReadScroll(int readScroll) {
        this.readScroll = readScroll;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public boolean isReleased() {
        return released;
    }

    public void setReleased(boolean released) {
        this.released = released;
    }

    public ContentValues toValues() {
        ContentValues values = new ContentValues(10);

        values.put(ChaptersTable.COLUMN_ID, id);
        values.put(ChaptersTable.COLUMN_NUMBER, number);
        values.put(ChaptersTable.COLUMN_TITLE, title);
        values.put(ChaptersTable.COLUMN_PAGES, pages);
        values.put(ChaptersTable.COLUMN_TOTAL_SCROLL, totalScroll);
        values.put(ChaptersTable.COLUMN_READ_SCROLL, readScroll);
        values.put(ChaptersTable.COLUMN_BOOK_ID, bookId);
        values.put(ChaptersTable.COLUMN_COVER, cover);
        values.put(ChaptersTable.COLUMN_FAVORITE, favorite);
        values.put(ChaptersTable.COLUMN_RELEASED, released);

        return values;
    }

    @Override
    public String toString() {
        return "DataItemChapters{" +
                "id=" + id +
                ", number=" + number +
                ", title=" + title +
                ", pages=" + pages +
                ", totalScroll=" + totalScroll +
                ", readScroll=" + readScroll +
                ", bookId=" + bookId +
                ", cover='" + cover + '\'' +
                ", favorite=" + favorite +
                ", released=" + released +
                '}';
    }
}
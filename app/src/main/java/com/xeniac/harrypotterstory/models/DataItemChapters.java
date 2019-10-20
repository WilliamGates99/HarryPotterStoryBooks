package com.xeniac.harrypotterstory.models;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;

import com.xeniac.harrypotterstory.database.ChaptersTable;

public class DataItemChapters implements Parcelable {

    private String id;
    private int number;
    private int title;
    private int pages;
    private int readPages;
    private int bookTitle;
    private String cover;
    private boolean favorite;

    public DataItemChapters() {
    }

    public DataItemChapters(String id, int number, int title, int pages,
                            int readPages, int bookTitle, String cover, boolean favorite) {
        this.id = id;
        this.number = number;
        this.title = title;
        this.pages = pages;
        this.readPages = readPages;
        this.bookTitle = bookTitle;
        this.cover = cover;
        this.favorite = favorite;
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

    public int getReadPages() {
        return readPages;
    }

    public void setReadPages(int readPages) {
        this.readPages = readPages;
    }

    public int getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(int bookTitle) {
        this.bookTitle = bookTitle;
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

    public ContentValues toValues() {
        ContentValues values = new ContentValues(8);

        values.put(ChaptersTable.COLUMN_ID, id);
        values.put(ChaptersTable.COLUMN_NUMBER, number);
        values.put(ChaptersTable.COLUMN_TITLE, title);
        values.put(ChaptersTable.COLUMN_PAGES, pages);
        values.put(ChaptersTable.COLUMN_READ_PAGES, readPages);
        values.put(ChaptersTable.COLUMN_BOOK_TITLE, bookTitle);
        values.put(ChaptersTable.COLUMN_COVER, cover);
        values.put(ChaptersTable.COLUMN_FAVORITE, favorite);

        return values;
    }

    @Override
    public String toString() {
        return "DataItemChapters{" +
                "id='" + id + '\'' +
                ", number=" + number +
                ", title=" + title +
                ", pages=" + pages +
                ", readPages=" + readPages +
                ", bookTitle=" + bookTitle +
                ", cover='" + cover + '\'' +
                ", favorite=" + favorite +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeInt(this.number);
        dest.writeInt(this.title);
        dest.writeInt(this.pages);
        dest.writeInt(this.readPages);
        dest.writeInt(this.bookTitle);
        dest.writeString(this.cover);
        dest.writeByte(this.favorite ? (byte) 1 : (byte) 0);
    }

    protected DataItemChapters(Parcel in) {
        this.id = in.readString();
        this.number = in.readInt();
        this.title = in.readInt();
        this.pages = in.readInt();
        this.readPages = in.readInt();
        this.bookTitle = in.readInt();
        this.cover = in.readString();
        this.favorite = in.readByte() != 0;
    }

    public static final Creator<DataItemChapters> CREATOR = new Creator<DataItemChapters>() {
        @Override
        public DataItemChapters createFromParcel(Parcel source) {
            return new DataItemChapters(source);
        }

        @Override
        public DataItemChapters[] newArray(int size) {
            return new DataItemChapters[size];
        }
    };
}
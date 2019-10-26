package com.xeniac.harrypotterstory.models;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;

import com.xeniac.harrypotterstory.database.chaptersDataBase.ChaptersTable;

public class DataItemChapters implements Parcelable {

    private int id;
    private int number;
    private int title;
    private int totalPages;
    private int readPages;
    private int bookId;
    private String cover;
    private boolean favorite;
    private boolean reading;

    public DataItemChapters() {
    }

    public DataItemChapters(int id, int number, int title, int totalPages, int readPages,
                            int bookId, String cover, boolean favorite, boolean reading) {
        this.id = id;
        this.number = number;
        this.title = title;
        this.totalPages = totalPages;
        this.readPages = readPages;
        this.bookId = bookId;
        this.cover = cover;
        this.favorite = favorite;
        this.reading = reading;
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

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getReadPages() {
        return readPages;
    }

    public void setReadPages(int readPages) {
        this.readPages = readPages;
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

    public boolean isReading() {
        return reading;
    }

    public void setReading(boolean reading) {
        this.reading = reading;
    }

    public ContentValues toValues() {
        ContentValues values = new ContentValues(9);

        values.put(ChaptersTable.COLUMN_ID, id);
        values.put(ChaptersTable.COLUMN_NUMBER, number);
        values.put(ChaptersTable.COLUMN_TITLE, title);
        values.put(ChaptersTable.COLUMN_TOTAL_PAGES, totalPages);
        values.put(ChaptersTable.COLUMN_READ_PAGES, readPages);
        values.put(ChaptersTable.COLUMN_BOOK_ID, bookId);
        values.put(ChaptersTable.COLUMN_COVER, cover);
        values.put(ChaptersTable.COLUMN_FAVORITE, favorite);
        values.put(ChaptersTable.COLUMN_READING, reading);

        return values;
    }

    @Override
    public String toString() {
        return "DataItemChapters{" +
                "id=" + id +
                ", number=" + number +
                ", title=" + title +
                ", totalPages=" + totalPages +
                ", readPages=" + readPages +
                ", bookId=" + bookId +
                ", cover='" + cover + '\'' +
                ", favorite=" + favorite +
                ", reading=" + reading +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeInt(this.number);
        dest.writeInt(this.title);
        dest.writeInt(this.totalPages);
        dest.writeInt(this.readPages);
        dest.writeInt(this.bookId);
        dest.writeString(this.cover);
        dest.writeByte(this.favorite ? (byte) 1 : (byte) 0);
        dest.writeByte(this.reading ? (byte) 1 : (byte) 0);
    }

    private DataItemChapters(Parcel in) {
        this.id = in.readInt();
        this.number = in.readInt();
        this.title = in.readInt();
        this.totalPages = in.readInt();
        this.readPages = in.readInt();
        this.bookId = in.readInt();
        this.cover = in.readString();
        this.favorite = in.readByte() != 0;
        this.reading = in.readByte() != 0;
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
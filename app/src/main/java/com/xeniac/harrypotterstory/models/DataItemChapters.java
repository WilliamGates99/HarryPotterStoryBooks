package com.xeniac.harrypotterstory.models;

import android.os.Parcel;
import android.os.Parcelable;

public class DataItemChapters implements Parcelable {

    private String id;
    private String number;
    private int title;
    private String page;
    private int bookTitle;
    private boolean bookmark;

    public DataItemChapters() {
    }

    public DataItemChapters(String id, String number, int title,
                            String page, int bookTitle, boolean bookmark) {
        this.id = id;
        this.number = number;
        this.title = title;
        this.page = page;
        this.bookTitle = bookTitle;
        this.bookmark = bookmark;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getTitle() {
        return title;
    }

    public void setTitle(int title) {
        this.title = title;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public int getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(int bookTitle) {
        this.bookTitle = bookTitle;
    }

    public boolean isBookmark() {
        return bookmark;
    }

    public void setBookmark(boolean bookmark) {
        this.bookmark = bookmark;
    }

    @Override
    public String toString() {
        return "DataItemChapters{" +
                "id='" + id + '\'' +
                ", number='" + number + '\'' +
                ", title=" + title +
                ", page='" + page + '\'' +
                ", bookTitle=" + bookTitle +
                ", bookmark=" + bookmark +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.number);
        dest.writeInt(this.title);
        dest.writeString(this.page);
        dest.writeInt(this.bookTitle);
        dest.writeByte(this.bookmark ? (byte) 1 : (byte) 0);
    }

    protected DataItemChapters(Parcel in) {
        this.id = in.readString();
        this.number = in.readString();
        this.title = in.readInt();
        this.page = in.readString();
        this.bookTitle = in.readInt();
        this.bookmark = in.readByte() != 0;
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

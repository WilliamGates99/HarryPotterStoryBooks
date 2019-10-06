package com.xeniac.harrypotterstory.models;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;

import com.xeniac.harrypotterstory.database.ChaptersTable;

public class DataItemChapters implements Parcelable {

    private String id;
    private String number;
    private int title;
    private String page;
    private int bookTitle;
    private boolean favorite;

    public DataItemChapters() {
    }

    public DataItemChapters(String id, String number, int title,
                            String page, int bookTitle, boolean favorite) {
        this.id = id;
        this.number = number;
        this.title = title;
        this.page = page;
        this.bookTitle = bookTitle;
        this.favorite = favorite;
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

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public ContentValues toValues() {
        ContentValues values = new ContentValues(6);

        values.put(ChaptersTable.COLUMN_ID, id);
        values.put(ChaptersTable.COLUMN_NUMBER, number);
        values.put(ChaptersTable.COLUMN_TITLE, title);
        values.put(ChaptersTable.COLUMN_PAGE, page);
        values.put(ChaptersTable.COLUMN_BOOK_TITLE, bookTitle);
        values.put(ChaptersTable.COLUMN_FAVORITE, favorite);

        return values;
    }

    @Override
    public String toString() {
        return "DataItemChapters{" +
                "id='" + id + '\'' +
                ", number='" + number + '\'' +
                ", title=" + title +
                ", page='" + page + '\'' +
                ", bookTitle=" + bookTitle +
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
        dest.writeString(this.number);
        dest.writeInt(this.title);
        dest.writeString(this.page);
        dest.writeInt(this.bookTitle);
        dest.writeByte(this.favorite ? (byte) 1 : (byte) 0);
    }

    protected DataItemChapters(Parcel in) {
        this.id = in.readString();
        this.number = in.readString();
        this.title = in.readInt();
        this.page = in.readString();
        this.bookTitle = in.readInt();
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

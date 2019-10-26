package com.xeniac.harrypotterstory.models;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;

import com.xeniac.harrypotterstory.database.booksDataBase.BooksTable;

public class DataItemBooks implements Parcelable {

    private int id;
    private int title;
    private int gist;
    private String cover;
    private int totalPages;
    private int readPages;

    public DataItemBooks() {
    }

    public DataItemBooks(int id, int title, int gist, String cover, int totalPages, int readPages) {
        this.id = id;
        this.title = title;
        this.gist = gist;
        this.cover = cover;
        this.totalPages = totalPages;
        this.readPages = readPages;
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

    public ContentValues toValues() {
        ContentValues values = new ContentValues(6);

        values.put(BooksTable.COLUMN_ID, id);
        values.put(BooksTable.COLUMN_TITLE, title);
        values.put(BooksTable.COLUMN_GIST, gist);
        values.put(BooksTable.COLUMN_COVER, cover);
        values.put(BooksTable.COLUMN_TOTAL_PAGES, totalPages);
        values.put(BooksTable.COLUMN_READ_PAGES, readPages);

        return values;
    }

    @Override
    public String toString() {
        return "DataItemBooks{" +
                "id=" + id +
                ", title=" + title +
                ", gist=" + gist +
                ", cover='" + cover + '\'' +
                ", totalPages=" + totalPages +
                ", readPages=" + readPages +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeInt(this.title);
        dest.writeInt(this.gist);
        dest.writeString(this.cover);
        dest.writeInt(this.totalPages);
        dest.writeInt(this.readPages);
    }

    private DataItemBooks(Parcel in) {
        this.id = in.readInt();
        this.title = in.readInt();
        this.gist = in.readInt();
        this.cover = in.readString();
        this.totalPages = in.readInt();
        this.readPages = in.readInt();
    }

    public static final Creator<DataItemBooks> CREATOR = new Creator<DataItemBooks>() {
        @Override
        public DataItemBooks createFromParcel(Parcel source) {
            return new DataItemBooks(source);
        }

        @Override
        public DataItemBooks[] newArray(int size) {
            return new DataItemBooks[size];
        }
    };
}
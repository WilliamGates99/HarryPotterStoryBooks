package com.xeniac.harrypotterstory.models;

import android.os.Parcel;
import android.os.Parcelable;

public class DataItemBooks implements Parcelable {

    private String id;
    private int title;
    private int gist;
    private String image;

    public DataItemBooks() {
    }

    public DataItemBooks(String id, int title, int gist, String image) {
        this.id = id;
        this.title = title;
        this.gist = gist;
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "DataItemBooks{" +
                "id='" + id + '\'' +
                ", title=" + title +
                ", gist=" + gist +
                ", image='" + image + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeInt(this.title);
        dest.writeInt(this.gist);
        dest.writeString(this.image);
    }

    protected DataItemBooks(Parcel in) {
        this.id = in.readString();
        this.title = in.readInt();
        this.gist = in.readInt();
        this.image = in.readString();
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
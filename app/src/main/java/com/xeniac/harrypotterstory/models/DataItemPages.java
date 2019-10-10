package com.xeniac.harrypotterstory.models;

public class DataItemPages {

    private String id;
    private String number;
    private int text;

    public DataItemPages() {
    }

    public DataItemPages(String id, String number, int text) {
        this.id = id;
        this.number = number;
        this.text = text;
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

    public int getText() {
        return text;
    }

    public void setText(int text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "DataItemPages{" +
                "id='" + id + '\'' +
                ", number='" + number + '\'' +
                ", text=" + text +
                '}';
    }
}

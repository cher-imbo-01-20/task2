package com.company;

public class Book {
    int page_count;
    String name;

    Book(int p, String n) {
        page_count=p;
        name=n;
    }
    public int getPage_count() {
        return page_count;
    }

    public String getName() {
        return name;
    }

    public void setPage_count(int page_count) {
        this.page_count = page_count;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "page_count=" + page_count +
                ", name='" + name + '\'' +
                '}';
    }
}

package com.myorganisation.ioc;

public class Book {

    int bookId;
    String bookName;

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public Book(int bookId, String bookName) {
        this.bookId = bookId;
        this.bookName = bookName;
    }
}

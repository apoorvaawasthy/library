package com.example.MyApp3;

public class BookNotFoundException extends RuntimeException {

    public BookNotFoundException(int id) {
        super("Book id not found : " + id);
    }
}

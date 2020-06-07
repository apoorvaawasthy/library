package com.example.MyApp3;

import com.example.MyApp3.Book;

public class BookValidator {
    public boolean isValid(Book book){

        return book.getTitle() != "" && !book.getTitle().equals(null);
    }
}
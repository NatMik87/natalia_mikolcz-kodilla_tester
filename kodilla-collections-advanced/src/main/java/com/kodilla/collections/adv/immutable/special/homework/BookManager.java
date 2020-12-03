package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager{


    public Book createBook(String title, String author){
        for (Book book : books) {
            if(book.getAuthor().equals(author) && book.getTitle().equals(title))
                return book;
        }
        Book result = new Book(title, author);
        books.add(result);
        return result;
    }

    static List<Book> books = new ArrayList<>();

}

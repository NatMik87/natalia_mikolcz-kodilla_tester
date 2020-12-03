package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        Book book = new BookManager().createBook("Harry Potter","J.K.Rowlling");
        Book book1 = new BookManager().createBook("Ronnie","J.K.Rowlling");
        Book book2 = new BookManager().createBook("Alice","J.K.Rowlling");
        Book book3 = new BookManager().createBook("Harry Potter","J.K.Rowlling");

        System.out.println(book);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

    }
}

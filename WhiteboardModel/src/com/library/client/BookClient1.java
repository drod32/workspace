package com.library.client;

import com.library.Book;
import com.library.FullShelfException;
import com.library.Genre;
import com.library.OffShelfException;

import java.util.Arrays;

public class BookClient1 {

    public static void main(String[] args) throws FullShelfException, OffShelfException {



        Book book1 = new Book("The Long Walk", Genre.THRILLER,
                "Richard Bachman", false);


        Book book2 = new Book("Hippie", Genre.FICTION,
                "Paulo Coelho", false);


        Book book3 = new Book("Wheel Of Time Book One: The Eye Of The World", Genre.FANTASY,
                "Robert Jordan", true);


        Book book4 = new Book("Jurassic Park", Genre.ACTION,
                "Michael Crichton", true);


        Book book5 = new Book("The Joy Luck Club", Genre.FICTION,
                "Amy Tan", true);






        book1.readBook();

        book2.readBook();

        book3.readBook();

        book1. returnBookToShelf();







    }
}



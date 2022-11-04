package com.library.client;

import com.library.Book;
import com.library.Genre;

import java.util.Arrays;

public class BookClient1 {

    public static void main(String[] args) {



        Book book1 = new Book("The Long Walk", Genre.THRILLER,
                "Richard Bachman", false);
        book1. addToLibrary();

        Book book2 = new Book("Hippie", Genre.FICTION,
                "Paulo Coelho", false);
        book2. addToLibrary();

        Book book3 = new Book("Wheel Of Time Book One: The Eye Of The World", Genre.FANTASY,
                "Robert Jordan", true);
        book3. addToLibrary();

        Book book4 = new Book("Jurassic Park", Genre.ACTION,
                "Michael Crichton", true);
        book4. addToLibrary();

        Book book5 = new Book("The Joy Luck Club", Genre.FICTION,
                "Amy Tan", true);
        book5. addToLibrary();
        
        // this is part of an excercise 





        book1.readBook();

        book2.readBook();

        book3.readBook();

        book1. returnBookToShelf();







    }
}



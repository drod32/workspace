package com.library.client;

import com.library.Book;
import com.library.FullShelfException;
import com.library.Genre;
import com.library.OffShelfException;

//this validation test is designed to ensure
    // no more than 5 books can be added to the shelf
    // A book cannot be removed from the shelf if it is not on the shelf
    // a book cannot be returned to the shelf unless it is removed
public class BookValidationTest {

    public static void main(String[] args) throws OffShelfException, FullShelfException {


            Book book1 = new Book("Circe", Genre.FANTASY, "Madeline Miller", true);
            Book book2 = new Book("Circe", Genre.FANTASY, "Madeline Miller", true);
            Book book3 = new Book("Circe", Genre.FANTASY, "Madeline Miller", true);
            Book book4 = new Book("Circe", Genre.FANTASY, "Madeline Miller", true);
            Book book5 = new Book("Circe", Genre.FANTASY, "Madeline Miller", true);
            //System.out.println("Test: the shelf has reached maximum capacity, the next entry should result in an error.");
            //Book error = new Book("Circe", Genre.FANTASY, "Madeline Miller", true);

            book1.readBook();

            System.out.println("book 1 has been removed from the library, follow up attempts to .readbook should result in an error message.");
            book1.readBook();

            book1.returnBookToShelf();

            System.out.println("Book 1 has already been returned to shelf, attempts to return book 1 to the shelf should result in an error.");
            book1.returnBookToShelf();
        }
    }
}


    }


}

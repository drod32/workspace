package com.library;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Book {
    //Fields
    public static final int MAX_SHELF_SPACE = 5;
    private String bookName;
    private Genre genre = Genre.FICTION;
    private String author;
    private boolean haveIReadIt;
    private boolean onShelf;
    private String timeStamp;

    private static int instanceCount;





    // Constructor and Instance counter
    public Book() {
        instanceCount++;
    }
    public Book(String bookName, Genre genre, String author, boolean haveIReadIt) throws IllegalArgumentException{
        this();
        setBookName(bookName);
        this.genre = genre;
        this.author = author;
        this.haveIReadIt = haveIReadIt;
        addToLibrary();

    }






    // Business Methods


    //method to remove book from shelf and begin reading
    public void readBook() throws IllegalArgumentException{
        if (isOnShelf() == true) {
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formattedDate = DateTimeFormatter.ofPattern("HH:mm MM-dd-yyyy");
            timeStamp = now.format(formattedDate);
            System.out.println("You have chosen to read " + bookName + "\n" + timeStamp);
            setInstanceCount(instanceCount - 1);
            libraryCounter();
            setOnShelf(false);

        }
        else {
            throw  new IllegalArgumentException("Sorry, this book is not your on shelf");

        }
    }
    //method to return a book to the shelf after it has been added
    public void returnBookToShelf(){
        if (isOnShelf()== false & instanceCount <= MAX_SHELF_SPACE) {
            System.out.println("Thank you for returning " + bookName + ".");
            setOnShelf(true);
            setInstanceCount(instanceCount + 1);
            libraryCounter();
        }
        else {
            System.out.println(bookName +  " is already on the shelf.\n");
        }
    }

    // Method used to add a book to the library
    public void addToLibrary() throws IllegalArgumentException{
        if (instanceCount <= MAX_SHELF_SPACE){

            System.out.println("The " + genre + ", " + bookName +
                    ", by " + author + " has been added to your library.");

            if (haveIReadIt == false){
                System.out.println("You Have not read this book yet.");
            }
            else {
                System.out.println("You Have read this book before.");
            }
            setOnShelf(true);

            System.out.println("There are now " + instanceCount +
                    " books in your library\n");
        }
        else {
            throw  new IllegalArgumentException("Sorry, shelf is full");
        }
    }


    public void libraryCounter(){
        if (instanceCount <= MAX_SHELF_SPACE){
            System.out.println("There are now " + instanceCount +
                    " books in your library\n");
        }
        else {
            System.out.println("Sorry the Shelf is full.\n");
            ;
        }
    }


    // Getter And Setter Methods (Accessor Methods)
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }


    public boolean isOnShelf() {
        return onShelf;
    }
    public void setOnShelf(boolean onShelf) {
        this.onShelf = onShelf;
    }


    public String getTimeStamp() {return timeStamp;}
    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }




    // instance counter counts the number of books on the shelf
    public static int getInstanceCount() {
        return instanceCount;
    }
    public static void setInstanceCount(int instanceCount) {
        Book.instanceCount = instanceCount;
    }



    @Override
    public String toString() {
        return "com.library.Book{" +
                "bookName='" + bookName + '\'' +
                ", genre='" + genre + '\'' +
                ", author='" + author + '\'' +
                ", haveIReadIt=" + haveIReadIt +
                ", onShelf=" + onShelf +
                '}';
    }
}

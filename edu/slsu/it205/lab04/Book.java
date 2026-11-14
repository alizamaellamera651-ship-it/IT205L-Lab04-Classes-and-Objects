package edu.slsu.it205.lab04;

public class Book {

    // Fields (Attributes)
    String id;
    String title;
    String status;

    // Constructor
    public Book(String id, String title) {
        this.id = id;
        this.title = title;
        this.status = "AVAILABLE";
    }

    // Method to borrow a book
    public void borrowBook() {
        if (status.equals("AVAILABLE")) {
            status = "BORROWED";
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    // Method to return a book
    public void returnBook() {
        status = "AVAILABLE";
        System.out.println(title + " has been returned.");
    }

    // toString method
    @Override
    public String toString() {
        return "Book ID: " + id +
               "\nTitle: " + title +
               "\nStatus: " + status;
    }
}
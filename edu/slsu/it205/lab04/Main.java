package edu.slsu.it205.lab04;

public class Main {

    public static void main(String[] args) {

        // Create three Book objects
        Book book1 = new Book("B001", "Java Programming");
        Book book2 = new Book("B002", "Object-Oriented Programming");
        Book book3 = new Book("B003", "Introduction to Computing");

        // Display the original book information
        System.out.println("========== BOOK INFORMATION ==========");

        System.out.println(book1);
        System.out.println("----------------------------");

        System.out.println(book2);
        System.out.println("----------------------------");

        System.out.println(book3);

        // Demonstrate object behavior
        System.out.println("\n========== BORROW BOOK ==========");
        book1.borrowBook();

        System.out.println("\n========== UPDATED BOOK INFORMATION ==========");
        System.out.println(book1);

        // Demonstrate returning a book
        System.out.println("\n========== RETURN BOOK ==========");
        book1.returnBook();

        System.out.println("\n========== FINAL BOOK INFORMATION ==========");
        System.out.println(book1);

        // Demonstrate object references
System.out.println("\n========== OBJECT REFERENCE DEMONSTRATION ==========");

Book a = book2;
Book b = book2;

// Change the title using reference a
a.title = "Updated Java Programming";

// Display the object using reference b
System.out.println("Printing object b:");
System.out.println(b);
    }
}
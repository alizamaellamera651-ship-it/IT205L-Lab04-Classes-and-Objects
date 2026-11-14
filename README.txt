IT 205 / IT 205L - OBJECT-ORIENTED PROGRAMMING
LABORATORY ACTIVITY 04: CLASSES AND OBJECTS

Student Name: Aliza Mae Llamera
Section: BSIT - 2C

PROJECT TITLE:
Book Management - Classes and Objects

I. PROJECT DESCRIPTION

This project demonstrates the fundamental concepts of Java classes and objects using a Book domain. It creates multiple Book objects, initializes their fields through a constructor, and demonstrates object behavior through methods.

II. TECHNOLOGIES USED

- Java Development Kit (JDK 17)
- Visual Studio Code
- Git Bash
- Git and GitHub

III. PACKAGE AND FILES

Package: edu.slsu.it205.lab04

Files:
- Book.java - Defines the Book class, fields, constructor, borrowBook(), returnBook(), and toString().
- Main.java - Creates three Book objects and demonstrates their behavior and object references.

IV. PROGRAM FEATURES

1. Creates three Book objects with different IDs and titles.
2. Initializes each book with an AVAILABLE status.
3. Uses borrowBook() to change the status to BORROWED.
4. Uses returnBook() to change the status back to AVAILABLE.
5. Uses toString() to display book information.
6. Demonstrates that two reference variables can refer to the same object.

V. HOW TO COMPILE AND RUN

Compile:

javac -d . edu/slsu/it205/lab04/Book.java edu/slsu/it205/lab04/Main.java

Run:

java edu.slsu.it205.lab04.Main

VI. DISCUSSION

Objects combine related data and behavior in one class. In this project, the Book class stores the book ID, title, and status while also providing methods to borrow and return a book.

Compared with parallel arrays, using objects makes the program more organized because each book's information and related actions are grouped together. It is also easier to maintain and understand.

VII. POST-LAB QUESTIONS AND ANSWERS

1. What is the difference between a class and an object?

A class is a blueprint that defines the fields and methods of a particular type. An object is an actual instance created from that class using the new keyword.

2. Why do constructors exist if fields can be assigned later?

Constructors initialize an object's fields when it is created. They help ensure that an object starts with the required values and reduce the need for separate assignments.

3. What does it mean that object variables hold references?

It means that an object variable stores a reference to an object rather than the object itself. Multiple variables can refer to the same object, so changes made through one reference can be seen through another.

4. How did toString improve debugging in your demo?

The toString() method provides a readable representation of an object. It makes it easier to check the book ID, title, and status when displaying or debugging the program.

5. Which fields belong together in your chosen domain class and why?

The book ID, title, and status belong together because they describe one particular book. Keeping them in the Book class makes the program organized and allows each book to maintain its own information.

VIII. CONCLUSION

This activity helped demonstrate how classes and objects work in Java. It also provided experience with constructors, methods, object references, and the toString() method.
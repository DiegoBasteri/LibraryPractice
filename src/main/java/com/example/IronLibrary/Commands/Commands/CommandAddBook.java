package com.example.IronLibrary.Commands.Commands;

import com.example.IronLibrary.Models.Author;
import com.example.IronLibrary.Models.Book;
import com.example.IronLibrary.Repositories.AuthorRepository;
import com.example.IronLibrary.Repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Scanner;

public class CommandAddBook {
    @Autowired
    static
    BookRepository bookRepository;
     @Autowired
    AuthorRepository authorRepository;

    // method to add a book
    public static Book addBook(Scanner scanner) {
        String isbn = null;
        String title = null;
        String category = null;
        String authorName = null;
        String authorEmail = null;
        int numBooks = 0;

        try {
            System.out.print("Enter isbn: ");
            isbn = scanner.nextLine();
            System.out.print("Enter title: ");
            title = scanner.nextLine();
            System.out.print("Enter category: ");
            category = scanner.nextLine();
            System.out.print("Enter author name: ");
            authorName = scanner.nextLine();
            System.out.print("Enter author email: ");
            authorEmail = scanner.nextLine();
            System.out.print("Enter number of books: ");
            numBooks = scanner.nextInt();
            scanner.nextLine(); // consume the newline character
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }

        Author author = new Author(authorName, authorEmail);
        Book book = new Book(isbn, title, category, numBooks,author);
        return book;
    }

}

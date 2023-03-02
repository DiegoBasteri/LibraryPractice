package com.example.IronLibrary;

import com.example.IronLibrary.Commands.Commands.CommandAddBook;
import com.example.IronLibrary.Commands.Commands.CommandsMethods;
import com.example.IronLibrary.InitialMenu.Menu;
import com.example.IronLibrary.Models.Author;
import com.example.IronLibrary.Models.Book;
import com.example.IronLibrary.Repositories.AuthorRepository;
import com.example.IronLibrary.Repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Scanner;

@SpringBootApplication
public class IronLibraryApplication {
	@Autowired
	AuthorRepository authorRepository;
	@Autowired
	BookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(IronLibraryApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(AuthorRepository authorRepository, BookRepository bookRepository) {
		return args -> {

			//Just Initial authors and books for test
			Author author1 = new Author("Diego", "diego@mail.com");
			authorRepository.save(author1);
			Author author2 = new Author("Lucia", "lucia@mail.com");
			authorRepository.save(author2);

			Book book1 = new Book("978-3-16-148410", "libro1", "Terror", 9, author1);
			bookRepository.save(book1);


			Menu.initialMenu();

		};
	}
}


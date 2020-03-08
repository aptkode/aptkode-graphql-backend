package com.aptkode.aptkodegraphqlbackend;

import com.aptkode.aptkodegraphqlbackend.repository.AuthorRepository;
import com.aptkode.aptkodegraphqlbackend.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AptkodeGraphqlBackendApplication implements ApplicationRunner {

	@Autowired
	private BookRepository bookRepository;
	@Autowired
	private AuthorRepository authorRepository;

	public static void main(String[] args) {
		SpringApplication.run(AptkodeGraphqlBackendApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) {
//		Book book = new Book("Learning GraphQL: Declarative Data Fetching for Modern Web Apps", "978-1492030713");
//		Author eve = new Author("Eve Porcello");
//		Author alex = new Author("Alex Banks");
//		book.addAuthor(eve);
//		book.addAuthor(alex);
//
//		authorRepository.saveAll(Arrays.asList(eve, alex));
//		bookRepository.save(book);
//
//		Book book1 = new Book("The Road to GraphQL: Your journey to master pragmatic GraphQL in JavaScript with React.js and Node.js", "978-1730853937");
//		Author robin = new Author("Robin Wieruch");
//		book1.addAuthor(robin);
//
//		authorRepository.save(robin);
//		bookRepository.save(book1);
	}
}

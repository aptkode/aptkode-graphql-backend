package com.aptkode.aptkodegraphqlbackend.mutation;

import com.aptkode.aptkodegraphqlbackend.model.Author;
import com.aptkode.aptkodegraphqlbackend.model.Book;
import com.aptkode.aptkodegraphqlbackend.model.BookWrapper;
import com.aptkode.aptkodegraphqlbackend.repository.AuthorRepository;
import com.aptkode.aptkodegraphqlbackend.repository.BookRepository;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import graphql.GraphQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Optional;

@Component
public class BookMutationResolver implements GraphQLMutationResolver {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    @Autowired
    public BookMutationResolver(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    public Book createBook(BookWrapper bookWrapper) {
        return bookRepository.save(new Book(bookWrapper.getTitle(), bookWrapper.getIsbn()));
    }

    public Book addAuthor(String authorId, String isbn) {
        Optional<Author> author = authorRepository.findById(authorId);
        Optional<Book> book = bookRepository.findById(isbn);
        if (author.isPresent() && book.isPresent()) {
            book.get().setAuthors(Collections.singletonList(author.get()));
            bookRepository.save(book.get());
            return book.get();
        }
        throw new GraphQLException("couldn't add author");
    }

}

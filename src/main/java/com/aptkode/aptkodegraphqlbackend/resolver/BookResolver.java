package com.aptkode.aptkodegraphqlbackend.resolver;

import com.aptkode.aptkodegraphqlbackend.model.Book;
import com.aptkode.aptkodegraphqlbackend.repository.BookRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookResolver implements GraphQLQueryResolver {

    private final BookRepository bookRepository;

    @Autowired
    public BookResolver(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book getBook(String isbn) {
        return bookRepository.findById(isbn).get();
    }

}

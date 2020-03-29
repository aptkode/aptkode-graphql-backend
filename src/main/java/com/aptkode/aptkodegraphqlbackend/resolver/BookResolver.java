package com.aptkode.aptkodegraphqlbackend.resolver;

import com.aptkode.aptkodegraphqlbackend.model.Book;
import com.aptkode.aptkodegraphqlbackend.repository.BookRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import graphql.relay.Connection;
import graphql.relay.SimpleListConnection;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookResolver implements GraphQLQueryResolver {

    private final BookRepository bookRepository;

    @Autowired
    public BookResolver(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Connection<Book> books(int first, String after, DataFetchingEnvironment env) {
        List<Book> books = bookRepository.findAll();
        return new SimpleListConnection<>(books).get(env);
    }

    public Book getBook(String isbn) {
        return bookRepository.findById(isbn).get();
    }

}

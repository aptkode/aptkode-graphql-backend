package com.aptkode.aptkodegraphqlbackend.resolver;

import com.aptkode.aptkodegraphqlbackend.model.Book;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class BookResolver implements GraphQLQueryResolver {

    public Book getBook(String isbn) {
        return new Book("Learn GraphQL", "3094203482");
    }

}

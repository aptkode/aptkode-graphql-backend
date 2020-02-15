package com.aptkode.aptkodegraphqlbackend.mutation;

import com.aptkode.aptkodegraphqlbackend.model.Book;
import com.aptkode.aptkodegraphqlbackend.model.BookWrapper;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Component;

@Component
public class BookMutationResolver implements GraphQLMutationResolver {

    public Book createBook(BookWrapper bookWrapper) {
        return new Book(bookWrapper.getTitle(), bookWrapper.getIsbn());
    }

}

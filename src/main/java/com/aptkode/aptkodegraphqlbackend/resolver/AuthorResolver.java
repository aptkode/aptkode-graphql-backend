package com.aptkode.aptkodegraphqlbackend.resolver;

import com.aptkode.aptkodegraphqlbackend.model.Author;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class AuthorResolver implements GraphQLQueryResolver {
    public Author getAuthor() {
        return new Author();
    }
}

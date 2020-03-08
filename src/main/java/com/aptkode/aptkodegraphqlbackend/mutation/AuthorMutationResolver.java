package com.aptkode.aptkodegraphqlbackend.mutation;

import com.aptkode.aptkodegraphqlbackend.model.Author;
import com.aptkode.aptkodegraphqlbackend.model.AuthorWrapper;
import com.aptkode.aptkodegraphqlbackend.repository.AuthorRepository;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AuthorMutationResolver implements GraphQLMutationResolver {

    private final AuthorRepository repository;

    @Autowired
    public AuthorMutationResolver(AuthorRepository repository) {
        this.repository = repository;
    }

    public Author createAuthor(AuthorWrapper wrapper) {
        Author author = new Author(wrapper.getName());
        return repository.save(author);
    }
}

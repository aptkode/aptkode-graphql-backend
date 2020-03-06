package com.aptkode.aptkodegraphqlbackend.repository;

import com.aptkode.aptkodegraphqlbackend.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, String> {
}

package com.aptkode.aptkodegraphqlbackend.repository;

import com.aptkode.aptkodegraphqlbackend.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, String> {
}

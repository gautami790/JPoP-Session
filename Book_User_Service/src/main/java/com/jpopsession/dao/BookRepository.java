package com.jpopsession.dao;

import com.jpopsession.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book
        , Integer> {

}


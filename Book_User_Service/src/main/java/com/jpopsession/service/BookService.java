package com.jpopsession.service;

import com.jpopsession.dao.BookRepository;
import com.jpopsession.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    public Book getBookById(int id){
        return bookRepository.findById(id).orElse(null);
    }

    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    public Book updateBook(Book book){
        Book oldBook = bookRepository.findById(book.getId()).orElse(null);
        oldBook.setName(book.getName());
        oldBook.setAuthor(book.getAuthor());
        oldBook.setCatagory(book.getCatagory());
        oldBook.setDescription(book.getDescription());
        bookRepository.save(oldBook);
        return oldBook;
    }

    public String deleteBookById(int id){
        bookRepository.deleteById(id);
        return "Book got deleted";
    }

}

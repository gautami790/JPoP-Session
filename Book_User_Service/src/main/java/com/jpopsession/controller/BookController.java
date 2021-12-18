package com.jpopsession.controller;

import com.jpopsession.model.Book;
import com.jpopsession.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {


    @Autowired
    private BookService bookService;

    @PostMapping("/addBook")
    public Book addBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }

    @GetMapping("/book/{id}")
    public Book getBookById(@PathVariable int id){
        return bookService.getBookById(id);
    }

    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return bookService.getBooks();
    }

    @PutMapping("/updateBook")
    public Book updateBook(@RequestBody Book book){
        return bookService.updateBook(book);
    }

    @DeleteMapping("/book/{id}")
    public String deletBook(@PathVariable int id){
        return bookService.deleteBookById(id);
    }

}

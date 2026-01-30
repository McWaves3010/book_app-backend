package com.example.demo2.controllers;


import com.example.demo2.models.Book;
import com.example.demo2.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class BookController {


    private BookService bookService;

    public BookController(BookService bookService1){
        this.bookService = bookService1;
    }

    @GetMapping
    public Object hello(){
        return Map.of("message" , "Hello from ACC");
    }

    @PostMapping("/book")
    public Book save(@RequestBody Book book){
        System.out.println(book);
        return book;
    }
}

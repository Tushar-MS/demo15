package com.fifteen.demo15.controller;

import com.fifteen.demo15.dao.model.Book;
import com.fifteen.demo15.pool.MyAsyncService;
import com.fifteen.demo15.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;

@RestController
@RequestMapping("/api/store")
public class BookContoller {

    @Autowired
    private BookService bookService;

    @Autowired
    MyAsyncService myAsyncService;

    @PostMapping("/create")
    @CrossOrigin
    @ResponseStatus(HttpStatus.CREATED)
    private void createBook(@RequestBody Book book){
        bookService.createBook(book);
    }

    @GetMapping("/findAll")
    @CrossOrigin
    private List<Book> findAllBook(){
         List<Book> getList = bookService.findAllBooks();
        myAsyncService.process();
         return getList;
    }

    @DeleteMapping("/delete")
    @ResponseStatus(HttpStatus.OK)
    private void delete(){
        bookService.delete();
    }
}

package com.fifteen.demo15.service;

import com.fifteen.demo15.dao.model.Book;
import com.fifteen.demo15.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public void createBook(Book book){
        bookRepository.save(book);
    }

    public List<Book> findAllBooks() {
       return bookRepository.findAll();
    }

    public void delete() {

        bookRepository.deleteAll();
    }
}

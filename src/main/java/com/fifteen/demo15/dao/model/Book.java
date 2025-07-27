package com.fifteen.demo15.dao.model;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "books")
@Setter
@Getter
public class Book {

    @Id
    String id;
    String bookname;
    String bookAuther;

}

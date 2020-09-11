package com.microservice.book.model;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class Person {
    private int id;

    private String name;

    private String biography;

    private List<Book> books;

    private LocalDate birthDate;

}

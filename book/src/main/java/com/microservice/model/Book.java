package com.microservice.model;

import lombok.Data;

@Data
public class Book {
    private int id;

    private String name;

    private int year;

    private int pages;

    private double price;

    private Person author;
}

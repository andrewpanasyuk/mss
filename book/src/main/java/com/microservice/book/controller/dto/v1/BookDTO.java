package com.microservice.book.controller.dto.v1;

import lombok.Data;

@Data
public class BookDTO {
    private int id;

    private String name;

    private int year;

    private int pages;

    private double price;

    private int authorId;

    private String hitCount;
}

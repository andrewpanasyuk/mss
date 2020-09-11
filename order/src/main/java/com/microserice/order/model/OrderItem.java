package com.microserice.order.model;

import lombok.Data;

import java.awt.print.Book;

@Data
public class OrderItem {

    private final Book book;

    private final int number;
}

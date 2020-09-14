package com.microservice.order.model;

import lombok.Data;

@Data
public class OrderItem {

    private final int bookId;

    private final double price;

    private final int number;
}

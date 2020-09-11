package com.microserice.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("orders")
public class OrderController {

    @Autowired
    private OrderService orderService;
    
    public int createOrder(int bookId, int number, int customerId) {
        return orderService.createOrder(bookId, number, customerId).getId();
    }

    public void addBook(int orderId, int bookId, int number) {
        orderService.addBook(orderId, bookId, number);
    }

    public void completeOrder(int orderId) {
        orderService.complete(orderId);
    }

}

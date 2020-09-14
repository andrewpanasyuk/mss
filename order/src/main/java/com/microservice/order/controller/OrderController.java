package com.microservice.order.controller;

import com.microservice.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    public int createOrder(int bookId, int number, int customerId, double price) {
        return orderService.createOrder(bookId, number, customerId, price).getId();
    }

    public void addBook(int orderId, int bookId, int number, double price) {
        orderService.addBook(orderId, bookId, number, price);
    }

    public void completeOrder(int orderId) {
        orderService.complete(orderId);
    }

    public void cancel(int orderId) {
        orderService.cancel(orderId);
    }

}

package com.microservice.order.service;

import com.microservice.order.model.Order;
import com.microservice.order.model.OrderItem;
import com.microservice.order.repository.CustomerRepository;
import com.microservice.order.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CustomerRepository customerRepository;

    public void complete(int orderId) {
        Order order = orderRepository.findById(orderId);
        if (order != null) {
            order.setPayed(true);
            orderRepository.save(order);
        }
    }

    public void cancel(int orderId) {
        Order order = orderRepository.findById(orderId);
        if (order != null) {
            order.setCancelled(true);
            orderRepository.save(order);
        }
    }

    public Order createOrder(int bookId, int number, int customerId) {
        Order order = new Order();
//        order.addItem(new OrderItem(bookRepository.findBookById(bookId), number));
        order.setOrderDate(LocalDateTime.now());
        order.setCustomer(customerRepository.findById(customerId));

        return order;
    }

    public void addBook(int orderId, int bookId, int number) {
        Order order = orderRepository.findById(orderId);
        if (order != null) {
//            order.addItem(new OrderItem(bookRepository.findBookById(bookId), number));
            orderRepository.save(order);
        }
    }

}

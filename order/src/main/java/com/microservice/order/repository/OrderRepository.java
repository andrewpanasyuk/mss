package com.microservice.order.repository;

import com.microservice.order.model.Order;

public interface OrderRepository {

    void save(Order order);


    Order findById(int orderId);
}

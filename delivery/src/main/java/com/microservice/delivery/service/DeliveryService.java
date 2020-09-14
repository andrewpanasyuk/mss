package com.microservice.delivery.service;

import org.springframework.stereotype.Service;

@Service
public class DeliveryService {
    //    @Autowired
//    private OrderRepository orderRepository;
//
    public void deliver(int orderId) {
//        order.setDelivered(true);
//
//        orderRepository.save(order);
        System.out.println("Order delivered!");
    }
}

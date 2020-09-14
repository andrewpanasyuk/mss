package com.microservice.order.repository;

import com.microservice.order.model.Customer;

public interface CustomerRepository {

    Customer findById(int customerId);


}

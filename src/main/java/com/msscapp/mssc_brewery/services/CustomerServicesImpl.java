package com.msscapp.mssc_brewery.services;

import com.msscapp.mssc_brewery.web.model.Customer;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServicesImpl implements CustomerServices{

    @Override
    public Customer getCustomerById(UUID customerId) {
        return Customer.builder()
                .customerId(customerId)
                .customerName("Customer_" + UUID.randomUUID().toString().substring(0, 8))
                .build();
    }
}

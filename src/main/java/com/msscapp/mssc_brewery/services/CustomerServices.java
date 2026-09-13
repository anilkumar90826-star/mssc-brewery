package com.msscapp.mssc_brewery.services;

import com.msscapp.mssc_brewery.web.model.Customer;

import java.util.UUID;

public interface CustomerServices {

    Customer getCustomerById(UUID customerId);
}

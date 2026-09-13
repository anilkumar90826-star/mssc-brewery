package com.msscapp.mssc_brewery.web.controller;

import com.msscapp.mssc_brewery.services.CustomerServices;
import com.msscapp.mssc_brewery.web.model.Beer;
import com.msscapp.mssc_brewery.web.model.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    private final CustomerServices customerServices;

    public CustomerController(CustomerServices customerServices) {
        this.customerServices = customerServices;
    }


    @GetMapping({"/{customerId}"})
    public ResponseEntity<Customer> getCustomerById(@PathVariable("customerId") UUID customerId) {
        Customer customer = customerServices.getCustomerById(customerId);
        return ResponseEntity.ok(customer);
    }

}

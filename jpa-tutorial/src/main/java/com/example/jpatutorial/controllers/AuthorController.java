package com.example.jpatutorial.controllers;

import com.example.jpatutorial.models.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/customers")
public class AuthorController {

    private static final List<Customer> customers = List.of(
            new Customer(1L, "pesho", "doe", "doe@test.com"),
            new Customer(2L, "pesho123", "doeasd", "doeasd@test.com")

    );

    @GetMapping
    public List<Customer> findAllCustomers(){
        return customers;
    }

}

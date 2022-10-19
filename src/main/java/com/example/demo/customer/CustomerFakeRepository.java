package com.example.demo.customer;

import java.util.Arrays;
import java.util.List;

public class CustomerFakeRepository implements CustomerRepo{
    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1L, "James Bond", "password123", "email@gmail.com"),
                new Customer(2L, "Jamila Bond", "password123", "email@gmail.com"),
                new Customer(3L, "Ahmed Bond", "password123", "email@gmail.com")
        );
    }
}
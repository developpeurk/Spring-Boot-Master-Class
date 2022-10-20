package com.example.demo.customer;

import com.example.demo.exceptions.ApiRequestException;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "api/v2/customer")
@AllArgsConstructor
public class CustomerControllerV2 {

    private final CustomerService customerService;


    @GetMapping(path = "{customerId}")
    Customer getCustomer(@PathVariable("customerId") Long id) {
        return customerService.getCustomer(id);
    }

    @GetMapping(path = "{customerId}/exception")
    Customer getCustomerException(@PathVariable("customerId") Long id) {
        throw new ApiRequestException("ApiRequestException for customer " + id);
    }


    @GetMapping
    List<Customer> getCustomers() {
        return customerService.getCustomers();
    }


    @PostMapping
    void createNewCustomer(@Valid @RequestBody Customer customer){
        System.out.println("POST REQUEST ...");
        System.out.println(customer);
    }

    @PutMapping
    void updateCustomer(@Valid @RequestBody Customer customer){
        System.out.println("UPDATE REQUEST ...");
        System.out.println(customer);
    }

    @DeleteMapping(path = "{customerId}")
    void deleteCustomer(@PathVariable("customerId") Long id){
        System.out.println("DELETE REQUEST FOR CUSTOMER WITH ID " + id);
    }

}

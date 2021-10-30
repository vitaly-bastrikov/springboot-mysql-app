package com.example.springbootmysqlapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    CustomerRepository customerRepository;


    @PostMapping
    public String save(@RequestBody Customer customer){
        customerRepository.save(customer);
        return  "Success";
    }
    @GetMapping("/{id}")
    public Customer findById(@PathVariable int id){
        return customerRepository.findById(id).orElse(null);
    }

    @GetMapping
    public Iterable<Customer> findAll(){
        return customerRepository.findAll();
    }
}

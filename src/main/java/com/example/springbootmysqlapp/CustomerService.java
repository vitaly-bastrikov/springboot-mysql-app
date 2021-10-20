package com.example.springbootmysqlapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public void save(Customer customer){
        customerRepository.save(customer);
    }
    public Customer findById(int id){
        return customerRepository.findById(id).orElse(null);
    }
    public Iterable<Customer> findAll(){
        return customerRepository.findAll();
    }
}

package com.example.testspring1.service;

import com.example.testspring1.model.Customer;
import com.example.testspring1.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    public Customer getCustomer(Long id) {
        return customerRepository.findById(id).get();
    }

    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}

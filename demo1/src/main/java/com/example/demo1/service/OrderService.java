package com.example.demo1.service;

import com.example.demo1.dto.OrderRequest;
import com.example.demo1.entity.Customer;
import com.example.demo1.repository.CustomerRepository;
import com.example.demo1.repository.ProductRepository;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class OrderService {
    private CustomerRepository customerRepository;
    private ProductRepository productRepository;

    public OrderService(CustomerRepository customerRepository, ProductRepository productRepository) {
        this.customerRepository = customerRepository;
        this.productRepository = productRepository;
    }

    public Customer placeOrder(@RequestBody OrderRequest request){
        return customerRepository.save(request.getCustomer());
    }

    public List<Customer> findAllOrders(){
        return customerRepository.findAll();
    }


}

package com.example.demo1.controller;

import com.example.demo1.dto.OrderRequest;
import com.example.demo1.dto.OrderResponse;
import com.example.demo1.entity.Customer;
import com.example.demo1.repository.CustomerRepository;
import com.example.demo1.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class OrderController {
    private final OrderService orderService;
    private final CustomerRepository customerRepository;
    @Autowired
    public OrderController(OrderService orderService, CustomerRepository customerRepository) {
        super();
        this.orderService= orderService;
        this.customerRepository = customerRepository;
    }
    @PostMapping("/placeOrder")
    public ResponseEntity<Customer> placeOrder(@RequestBody OrderRequest request){
        return new ResponseEntity<Customer>(orderService.placeOrder(request), HttpStatus.CREATED);
    }
    @GetMapping("/findAllOrders")
    public List<Customer> findAllOrders(){
        return orderService.findAllOrders();
    }
    @GetMapping("/getInfo")
    public List<OrderResponse> getJoinInformation(){
        return customerRepository.getJoinInformation();
    }
}

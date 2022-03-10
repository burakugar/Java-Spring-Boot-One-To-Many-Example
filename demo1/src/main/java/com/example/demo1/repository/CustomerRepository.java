package com.example.demo1.repository;

import com.example.demo1.dto.OrderResponse;
import com.example.demo1.entity.Customer;
import com.example.demo1.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface CustomerRepository extends JpaRepository<Customer,Integer> {
        @Query("SELECT new com.example.demo1.dto.OrderResponse(c.name,c.email, p.productName,p.qty,p.price,p.pid) FROM Customer c JOIN c.products p")
        public List<OrderResponse> getJoinInformation();
}

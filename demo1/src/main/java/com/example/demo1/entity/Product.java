package com.example.demo1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data // Generates getters for all fields, a useful toString method, and hashCode and equals implementations that check all non-transient fields.
@AllArgsConstructor
@NoArgsConstructor
@Entity // annotation defines that a class can be mapped to a table. And that is it, it is just a marker, like for example Serializable interface.
@ToString

public class Product {
    @Id
    private int pid;
    private String productName;
    private int qty;
    private int price;
}

package com.example.demo.Repository.Entity;

import lombok.Generated;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table(name = "/products")
public class Phone {
    
    private int id;
    private String name;
    private String brand;
    private String category;
    private String price;
}

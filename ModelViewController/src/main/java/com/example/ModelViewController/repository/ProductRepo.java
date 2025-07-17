package com.example.ModelViewController.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ModelViewController.model.Product;

public interface ProductRepo extends JpaRepository<Product,Integer>{
    
    
}

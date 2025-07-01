package com.example.ModelViewController.service;

import com.example.ModelViewController.model.Product;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

    List<Product> products = Arrays.asList(new Product[] { new Product(102,"Samsung",50000),new Product(101,"IPhone",150000) });
    public List<Product> getProducts(){
       return products;
    }
}

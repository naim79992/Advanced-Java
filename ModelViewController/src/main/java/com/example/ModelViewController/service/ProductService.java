package com.example.ModelViewController.service;

import com.example.ModelViewController.model.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(new Product[] { new Product(102,"Samsung",80000),new Product(101,"IPhone",150000) }));
    public List<Product> getProducts(){
       return products;
    }
    public Product getProductById(int prodId){
        return products.stream()
               .filter(p->p.getProdId()==prodId)
               .findFirst().get();
               //.findFirst().orElse(new Product(100,"No Item",0));
    }
    //to add product
    public void addProduct(Product prod){
        products.add(prod);
    }
}

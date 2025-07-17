package com.example.ModelViewController.service;

import com.example.ModelViewController.model.Product;
import com.example.ModelViewController.repository.ProductRepo;

// import java.util.ArrayList;
// import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    ProductRepo repo;

    public List<Product> getProducts(){
      return repo.findAll();
    }
    public Product getProductById(int prodId){
        return repo.findById(prodId).orElse(new Product());
    }
    //to add product
    public void addProduct(Product prod){
        repo.save(prod);
    }
    public void updateProduct(Product prod) {
        repo.save(prod);
    }

    public void deleteProduct(int prodId){
        repo.deleteById(prodId);
    }
}

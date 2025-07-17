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

    // List<Product> products = new ArrayList<>(Arrays.asList(new Product[] { new Product(102,"Samsung",80000),new Product(101,"IPhone",150000) }));
    public List<Product> getProducts(){
      // return products;
      return repo.findAll();
    }
    public Product getProductById(int prodId){
        // return products.stream()
        //        .filter(p->p.getProdId()==prodId)
        //        .findFirst().get();
               //.findFirst().orElse(new Product(100,"No Item",0));
        return repo.findById(prodId).orElse(new Product());
    }
    //to add product
    public void addProduct(Product prod){
        //products.add(prod);
        repo.save(prod);
    }
    public void updateProduct(Product prod) {
        repo.save(prod);
    }

    public void deleteProduct(int prodId){
        repo.deleteById(prodId);
    }

}


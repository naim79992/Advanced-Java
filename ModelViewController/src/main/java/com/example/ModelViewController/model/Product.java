package com.example.ModelViewController.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data 
@AllArgsConstructor
@Component
public class Product {
     public Product() {
     }

     private int prodId;
     private String prodName;
     private int price;
     

     // public int getProdId() {
     //      return prodId;
     // }

     // public String getProdName() {
     //      return prodName;
     // }

     // public int getPrice() {
     //      return price;
     // }

     // public void setProdName(String prodName) {
     //      this.prodName = prodName;
     // }

     // public void setPrice(int price) {
     //      this.price = price;
     // }

     // public void setProdId(int prodId) {
     //      this.prodId = prodId;
     // }


}


package main.java.com.example.mvc1;
//model package(represents data)
public class Product {
    private int prodId,price;
    private String prodName;
    //i have to create dataset, construtors for these private var. I can simply use lombok library.
    //add lombok dependency(search mvndependency->lombok) in pom.xml
    
    //if controller wants the data, it 'll  not ask data from DB, it 'll ask from the Service Layer.
    //controller for accepting req, service layer for->business logic
    

}

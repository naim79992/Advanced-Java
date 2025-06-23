package com.example.AutowireExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//use 1 or 2 or 3
@Component
public class Dev {
    //way1 ----> field injection
     @Autowired
     private Computer laptop; //1. field injection
     //Laptop laptop=new Laptop();
     //private Computer comp;//spring 'll confused between Laptop & Desktop.u can use @primany to Laptop to solve it.
     //if don't want to use @primary the->
     //@Qualifier("laptop"); //syntext: @Qualifier(class_name_withCapitalLetter);
     
    //Way 2----> constructor injection
    //@Autowired
    //private Laptop laptop; 
    // public Dev(Laptop laptop){ //2. constructor injection
    //     this.laptop=laptop;
    // }

    //way 3--->  setter injection
     //private Laptop laptop; 
    // @Autowired
    // public void setLaptop(Laptop laptop){ //3. setter injection
    //     this.laptop=laptop;
    // }

    public void build(){
        laptop.compile();
        System.out.println("I am building a project.");
    }
}
// SpringApplication.run(...) →
// Spring container শুরু →
// Dev class খুঁজে পায় (because of @Component) →
// Dev এর object তৈরি করে →
// Dev class-এ @Autowired method খুঁজে পায় → 
// Method: setLaptop(Laptop laptop) →
// Laptop টাইপের bean container-এ খোঁজে →
// পায় → সেই Laptop object method-এ inject করে →
// setLaptop(Laptop) method call হয় →
// this.laptop ফিল্ড সেট হয় →
// build() call করলে laptop.compile() কাজ করে 

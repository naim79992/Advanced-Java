package com.example.AutowireExample;

import org.springframework.stereotype.Component;
//@primary
@Component
public class Laptop implements Computer {
    @Override
    public void compile(){
        System.out.println("404 error");
    }
}

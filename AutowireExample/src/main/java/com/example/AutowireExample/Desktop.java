package com.example.AutowireExample;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {
    @Override
    public void compile(){
        System.out.println("404 error-Desktop");
    }
}

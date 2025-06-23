package com.example.AutowireExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AutowireExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(AutowireExampleApplication.class, args);
	    Dev obj=context.getBean(Dev.class);
		obj.build();
	}

}

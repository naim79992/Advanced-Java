package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Dev dev1=new Dev();
        // dev1.build();
        //spring create the object
        //1. GET IoC container in JVM
        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml"); //go to mavan repo, copy spring dependency & update .xml
        // Dev obj=context.getBean(Dev.class);//spring creates the container but, it's closed now..need to config container using spring.xml config)
        // obj.build();
    }
}

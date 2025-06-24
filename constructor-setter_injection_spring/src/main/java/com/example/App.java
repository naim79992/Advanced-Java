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
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");                                                                                          // copy spring
        Dev obj=(Dev) context.getBean("dev");                                                                                         // dependency & update
        System.out.println("Age in Dev class "+obj.age); 
        obj.age=18;   
        System.out.println("Age override in this class "+obj.age); 
        
        obj.setNum(2);
        System.out.println(obj.getNum());

        Dev obj1=(Dev) context.getBean("dev1");
        System.out.println(obj1.getNum()); //setter injection(val of num given in .xml(property) that set using setAge method)

        //setter injection for ref var
        Dev obj2=(Dev) context.getBean("dev2");
        obj2.build();
        //constructor injection of ref var
     //   Dev obj3=(Dev) context.getBean("dev3");
        
    }
}

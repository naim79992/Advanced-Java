package com.example;

public class Dev {
    private int num, num1;
    int age=8; 
    private Laptop laptop; //it's reference var of Laptop class.(store in stack contain reference/address of obj that is in heap memory-null reference variable))
    public Dev(){
        System.out.println("Constructor of Dev");
    }
    public Dev(int num,int num1){ //parameterize constructor-constructor injection-(.xml constructor-arg) set val
       this.num=num;this.num1=num1;
        System.out.println("Constructor of Dev1(Constructor injection)- num" +num+" "+num1);
    }
    public Dev(Laptop laptop){
        this.laptop=laptop;
        System.out.println("Dev class- laptop parameter(constructor injection of ref var)");
    }
    
    
    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
    public Laptop getLaptop() {
        return laptop;
    }


    public void setNum(int num) {
        this.num = num;
    }
    public int getNum() {
        return num;
    }
    public void build(){
        System.out.println("I am building spring project.");
        laptop.compile(); 
    }
}


//1. create spring projject that dont have boot features: vs code- ctrl+shift+p->create java project
//->maven->mavan arctype quickstart->1.1->create.

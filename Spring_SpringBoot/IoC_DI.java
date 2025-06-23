package Spring_SpringBoot;

// Service class (Dependency)
class CoffeeMachine {
    public void brew() {
        System.out.println("Coffee is ready!");
    }
}

// Client class (Dependent)
class Employee {
    private CoffeeMachine coffeeMachine;

    // Constructor Injection (DI)
    public Employee(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    public void work() {
        coffeeMachine.brew();
        System.out.println("Employee working...");
    }
}

// Main Class - IoC container will create objects & inject dependencies
public class IoC_DI { //office
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();    // create container 
        Employee employee = new Employee(coffeeMachine);     // container inject 

        employee.work();
    }
}

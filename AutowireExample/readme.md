

# 🔌 Autowire with Spring Framework (Java)

This project demonstrates how to use `@Autowired` in Spring Framework to implement **Dependency Injection** (DI) using **Field Injection**, **Constructor Injection**, and **Setter Injection**. It also explains how Spring handles multiple implementations with `@Primary` and `@Qualifier`.

---

## 📘 What is `@Autowired`?

`@Autowired` is a Spring annotation used to **automatically inject dependent objects** (beans) into a class. Instead of manually creating objects using `new`, Spring handles the object creation and injection behind the scenes.

> 🧠 Think of it like this:
> *"You don’t create the object manually — you just ask Spring to give it to you!"*

---

## ⚙️ Technologies Used

* Java
* Spring Framework (Core)
* Spring Boot
* Maven

---

## 🧪 Injection Types Demonstrated

### 📍 1. Field Injection

```java
@Autowired
private Computer laptop;
```

### 📍 2. Constructor Injection (Recommended)

```java
private Computer laptop;

@Autowired
public Dev(Computer laptop) {
    this.laptop = laptop;
}
```

### 📍 3. Setter Injection

```java
private Computer laptop;

@Autowired
public void setLaptop(Computer laptop) {
    this.laptop = laptop;
}
```

---

## 💡 Real-Life Analogy

* **Dev** → Developer (main class)
* **Computer** → Interface (need)
* **Laptop / Desktop** → Implementations (available objects)
* **Spring Container** → Manager who arranges the right object automatically
* **@Autowired** → The request: “Give me what I need”

---

## 🧠 How Spring Handles Dependencies

1. `SpringApplication.run(...)` starts the Spring container.
2. It scans for classes annotated with `@Component`.
3. Finds `@Autowired` fields or methods.
4. Matches the correct bean based on type.
5. Injects the object.

---

## 🔁 Handling Multiple Implementations

If both `Laptop` and `Desktop` implement `Computer`, Spring won’t know which one to inject. Two solutions:

### ✅ Use `@Primary`

Mark one class as the default:

```java
@Component
@Primary
public class Laptop implements Computer {
    ...
}
```

### ✅ Use `@Qualifier`

Specify the exact bean name to inject:

```java
@Component("laptop")
public class Laptop implements Computer {
    ...
}

@Component("desktop")
public class Desktop implements Computer {
    ...
}

@Component
public class Dev {
    @Autowired
    @Qualifier("laptop")
    private Computer comp;
}
```

---

## 🎯 Interview-Focused Summary

* `@Autowired` helps implement **Dependency Injection** easily.
* It reduces coupling, improves testability, and simplifies maintenance.
* Use **constructor injection** for required dependencies (best practice).
* Handle multiple beans with `@Primary` or `@Qualifier`.

---

## 🚀 How to Run

1. Clone the repo

   ```bash
   git clone https://github.com/naim79992/Autowire.git
   cd Autowire
   ```

2. Open in any Java IDE (e.g., IntelliJ, Eclipse)

3. Run the application from the main class:

   ```java
   SpringApplication.run(App.class, args);
   ```

---

## 📄 License

This project is open-source and free to use.

---

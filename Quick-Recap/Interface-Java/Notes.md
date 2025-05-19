# Interface 

## Overview
An **interface** in Java is a reference type, similar to a class, that is used to achieve abstraction and multiple inheritance. Interfaces provide a way to define a contract that implementing classes must fulfill.

---

## Key Features

- An interface can contain:
  - Constants
  - Method signatures
  - Default methods
  - Static methods
  - Nested types

- **Interfaces cannot contain:**
  - Instance fields
  - Constructors

- **Interfaces cannot be instantiated directly.**

---

## Usage and Purpose

- **Abstraction**: Interfaces allow abstraction by hiding the implementation details.
- **Multiple Inheritance**: A class can implement multiple interfaces.
- **Contract Enforcement**: Ensures that implementing classes define all required methods.
- **Loose Coupling**: Classes can depend on interfaces instead of concrete implementations.
- **Polymorphism**: Enables a common API across different, unrelated classes.
- **Callbacks**: Useful for defining callback methods in event-driven programming.
- **API Standardization**: Allows different classes to follow the same method patterns.

---

## Inheritance in Interfaces

- A class implements an interface using the `implements` keyword.
- A class can implement multiple interfaces.
- An interface can **extend** one or more other interfaces.

```java
interface A {
    void show();
}

interface B extends A {
    void display();
}

class MyClass implements B {
    public void show() {
        System.out.println("Show method from A");
    }

    public void display() {
        System.out.println("Display method from B");
    }
}
```
## Inheritance 

- Inheritance is a fundamental concept in object-oriented programming (OOP) that allows a new class to inherit properties and behaviors (methods) from an existing class. This promotes code reusability and establishes a hierarchical relationship between classes.
- In Java, inheritance is implemented using the `extends` keyword. The class that is being inherited from is called the **superclass** (or parent class), and the class that inherits is called the **subclass** (or child class).


### Key Points:
- **Single Inheritance**: Java supports single inheritance, meaning a class can inherit from only one superclass. This avoids the complexity of multiple inheritance, which can lead to ambiguity (the "diamond problem").
- **Method Overriding**: A subclass can provide a specific implementation of a method that is already defined in its superclass. This is known as method overriding. The overridden method in the subclass must have the same name, return type, and parameters as the method in the superclass.
- **`super` Keyword**: The `super` keyword is used to refer to the superclass. It can be used to call the superclass's constructor, methods, or access its fields.
- **Constructor Inheritance**: Constructors are not inherited, but a subclass can call a superclass constructor using the `super()` keyword. This is often done to initialize inherited fields.
- **Access Modifiers**: The access level of the superclass members (fields and methods) determines their visibility in the subclass. Members declared as `private` are not accessible in the subclass, while `protected` and `public` members are accessible.
- **Abstract Classes and Interfaces**: Java supports abstract classes and interfaces, which can be used to achieve a form of multiple inheritance. An abstract class can have both abstract (without implementation) and concrete (with implementation) methods, while an interface can only have abstract methods (until Java 8, after which default methods were introduced).
- **Final Classes and Methods**: A class declared as `final` cannot be subclassed, and a method declared as `final` cannot be overridden. This is useful for preventing modification of certain classes or methods.
- **Polymorphism**: Inheritance allows for polymorphism, where a subclass can be treated as an instance of its superclass. This enables dynamic method dispatch, where the method that gets executed is determined at runtime based on the actual object type.


### **Example**: 


```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        myDog.sound(); // Output: Dog barks
        myCat.sound(); // Output: Cat meows
    }
}
```

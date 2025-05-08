### Static Modifier

The `static` keyword is one of Java’s most important concepts, especially for memory efficiency and class-level functionality.

Static methods and variables belong to the class rather than instances of the class, meaning they can be accessed without creating an object. This project helps clarify how static methods behave in different contexts, both within the same class and across multiple classes.

### 1. StaticMethodViaObject.java

- Demonstrates a static method defined outside the `main()` method in the same class.
- Shows three ways to call a static method:
  1. Directly (within the same class).
  2. Using the class name (recommended).
  3. Using an object (valid but not recommended).
  
- Helps understand that static methods do not require an object for access.

```java
public class StaticMethodViaObject {
    static void show() {
        System.out.println("Static method called.");
    }

    public static void main(String[] args) {
        // 1. Direct call
        show(); // Valid

        // 2. Using class name
        StaticMethodViaObject.show(); // Valid and preferred

        // 3. Using object reference
        StaticMethodViaObject obj = new StaticMethodViaObject();
        obj.show(); // Valid but not recommended
    }
}
```

### 2. InstanceCallsStatic.java

- Contains a non-static method `show()` which calls a static method `Disp()`.
- Demonstrates how an instance method can access static methods in three valid ways:
  1. Direct call (within the same class).
  2. Using the class name (clear and preferred).
  3. Using an object reference (unusual but allowed).

- Reinforces how static methods can be accessed from non-static contexts.

```java
public class InstanceCallsStatic {
    static void Disp() {
        System.out.println("Static method called.");
    }

    void show() {
        // 1. Direct call
        Disp(); // Valid

        // 2. Using class name
        InstanceCallsStatic.Disp(); // Valid and preferred

        // 3. Using object reference
        InstanceCallsStatic obj = new InstanceCallsStatic();
        obj.Disp(); // Valid but not recommended
    }

    public static void main(String[] args) {
        InstanceCallsStatic obj = new InstanceCallsStatic();
        obj.show();
    }
}
```

### 3. StaticMethodFromAnotherClass.java

- Involves two separate classes: `A` and `B`.
- Class `B` contains a static method `show()`, which is accessed from class `A`.
- Demonstrates:
  1. Calling a static method from another class using the class name (recommended).
  2. Calling the same method using an object (possible, but not advised).

- Highlights how static methods enable inter-class method sharing without object instantiation.

```java
public class StaticMethodFromAnotherClass {
    static void show() {
        System.out.println("Static method called from another class.");
    }
}

public class A {
    public static void main(String[] args) {
        // 1. Using class name
        StaticMethodFromAnotherClass.show(); // Valid and preferred

        // 2. Using object reference
        StaticMethodFromAnotherClass obj = new StaticMethodFromAnotherClass();
        obj.show(); // Valid but not recommended
    }
}
```



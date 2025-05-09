# Constructors 

## 1. Default Constructor
- A constructor with no parameters.
- Automatically provided by Java if no constructor is defined.
- Initializes object with default values (0, null, false, etc.).

```java
class Example {
    int x;
    String y;

    // Default constructor
    Example() {
        x = 0;
        y = "Default";
    }
}
```

## 2. Parameterized Constructor
- Constructor that takes arguments to initialize objects with specific values.
- Allows for more flexible object creation.

```java
class Example {
    int x;
    String y;

    // Parameterized constructor
    Example(int a, String b) {
        x = a;
        y = b;
    }

    // Default constructor
    Example() {
        x = 0;
        y = "Default";
    }
}

``` 

## 3. Constructor Overloading
- Multiple constructors in a class with different parameter lists.
- Allows for different ways to create objects of the same class.
- Can have different types and numbers of parameters.
- Helps create objects in various ways.

    
```java
    class Example {
        int x;
        String y;

        // Default constructor
        Example() {
            x = 0;
            y = "Default";
        }

        // Parameterized constructor
        Example(int a) {
            x = a;
            y = "Default";
        }

        // Parameterized constructor with two parameters
        Example(int a, String b) {
            x = a;
            y = b;
        }
    }
```

## 4. Constructor Chaining
- Using `this()` to call one constructor from another in the same class.
- Helps avoid code duplication.
    
```java
    class Example {
        int x;
        String y;

        // Default constructor
        Example() {
            this(0, "Default"); // Calls parameterized constructor
        }

        // Parameterized constructor
        Example(int a) {
            this(a, "Default"); // Calls another parameterized constructor
        }

        // Parameterized constructor with two parameters
        Example(int a, String b) {
            x = a;
            y = b;
        }
    }
    
```


## 5. Copy Constructor (Manual in Java)
- Java doesn’t provide a built-in copy constructor.
- You create one by passing an object of the same class and copying its fields manually.
    
```java
    class Example {
        int x;
        String y;

        // Copy constructor
        Example(Example obj) {
            this.x = obj.x;
            this.y = obj.y;
        }

        // Default constructor
        Example() {
            x = 0;
            y = "Default";
        }
    }

```

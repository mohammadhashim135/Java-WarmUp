## This Keyword (Java)

### Overview
- The `this` keyword in Java is a reference variable that refers to the current object. 
- It is used to differentiate between class attributes and parameters with the same name, and to invoke other constructors in the same class.
- It can also be used to pass the current object as a parameter to methods or constructors, and to return the current object from a method.


1. **Distinguishing Class Attributes from Parameters**: 
   When a method or constructor parameter has the same name as a class attribute, `this` is used to refer to the class attribute.

```java
public class Example 
{
       private int value;

       public Example(int value) 
       {
           this.value = value; // 'this.value' refers to the class attribute
       }
}
```

2. **Invoking Other Constructors**:

    You can use `this()` to call another constructor in the same class. This is known as constructor chaining.
    
```java
public class Example 
{
         private int value;
    
         public Example() 
         {
              this(10); // Calls the constructor with an int parameter
         }
    
         public Example(int value) 
         {
              this.value = value;
         }
}
```

3. **Passing Current Object**:

    You can pass the current object as a parameter to another method or constructor.
    
```java
public class Example 
{
    public void show(Example obj) 
    {
        System.out.println("Inside show method");
    }
    
    public void callShow() 
    {
        this.show(this); // Passing current object as parameter
    }
}

```

4. **Returning Current Object**:

    You can return the current object from a method using `this`.
    
```java
public class Example 
{
         public Example getInstance() 
         {
              return this; // Returns the current object
         }
}
```

### Important Notes
- `this` can only be used within instance methods, constructors, or instance initializers.
- It cannot be used in static methods or static contexts, as there is no instance of the class in those contexts.
- `this` can be used to call methods of the current object, access instance variables, and invoke constructors.
- It is a reference to the current object, and its value is determined at runtime.
- In inner classes, `this` refers to the instance of the inner class, not the outer class. To refer to the outer class, you can use `OuterClassName.this`.

### Example
```java
public class Example 
{
    private int value;

    public Example(int value) 
    {
        this.value = value; // 'this.value' refers to the class attribute
    }

    public void display() 
    {
        System.out.println("Value: " + this.value);
    }

    public static void main(String[] args) 
    {
        Example example = new Example(10);
        example.display(); // Output: Value: 10
    }
}
```

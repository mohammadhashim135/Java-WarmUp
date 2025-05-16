# Access Specifiers in Java

Java provides four access specifiers to control the visibility of classes, methods, and variables:

1. **public**  
   Members declared `public` are accessible from anywhere — within the same class, other classes in the same package, subclasses, and classes in different packages.
    This is the most permissive access level.
    
    ```java
    public class Example {
        public int publicVar;
        
        public void publicMethod() {
            // Method implementation
        }
    }
    ```

2. **protected**  
   Members declared `protected` are accessible within the same package and also accessible in subclasses (even if they are in different packages).
   This is less permissive than `public`, but more permissive than `private`.

    ```java
    public class Example {
        protected int protectedVar;
        
        protected void protectedMethod() {
            // Method implementation
        }
    }
    ```


3. **default (package-private)**  
   If no access modifier is specified, members have default (package-private) access. These members are accessible only within the same package and not from classes in other packages, even if they are subclasses.

    This is the most restrictive access level.
    
    ```java
    class Example {
          int defaultVar; // default access
          
          void defaultMethod() {
                // Method implementation
          }
     }
    ```    

4. **private**  
   Members declared `private` are accessible only within the class where they are defined. They are not accessible from subclasses or other classes, regardless of the package.

    This is the most restrictive access level.

    ```java
    public class Example {
        private int privateVar;
        
        private void privateMethod() {
            // Method implementation
        }
    }
    ``` 

### Summary

| Access Modifier | Same Class | Same Package | Subclass (same package) | Subclass (different package) | Other Packages |
|-----------------|------------|--------------|------------------------|------------------------------|----------------|
| public          | Yes        | Yes          | Yes                    | Yes                          | Yes            |
| protected       | Yes        | Yes          | Yes                    | Yes                          | No             |
| default         | Yes        | Yes          | Yes                    | No                           | No             |
| private         | Yes        | No           | No                     | No                           | No             |



Understanding these access levels helps in designing secure and well-encapsulated Java programs.

## Method Overriding + Method Dispatch

### Method Overriding
- Allows a subclass to provide a specific implementation of a method already defined in its superclass.
- The subclass method must have the same name, return type, and parameters as the superclass method.
- When a method is called on an object, the executed version depends on the actual object's type, not the reference type.
- This behavior is called dynamic method dispatch or late binding.
- Method overriding enables runtime polymorphism, allowing methods to behave differently based on the actual object.
- It supports flexible and reusable code by letting subclasses customize behavior while following the superclass interface.

### Method Dispatch
- Method dispatch is selecting which method to execute when a method is called on an object.
- It can be static (determined at compile time by reference type) or dynamic (determined at runtime by actual object type).
- Dynamic dispatch is a key feature of polymorphism and enables flexible, reusable code.
- In Java, method dispatch is primarily dynamic, meaning the method executed is decided at runtime based on the object's actual type.

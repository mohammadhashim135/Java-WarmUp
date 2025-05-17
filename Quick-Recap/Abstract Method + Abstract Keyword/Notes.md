## Abstract Method + Abstract Keyword in Java

### Abstract Keyword
- The `abstract` keyword is used in Java to declare **abstract classes** and **abstract methods**.
- An **abstract class** is a class that **cannot be instantiated directly**.
- Abstract classes are meant to be **inherited** by subclasses.
- An abstract class can contain:
  - Abstract methods (methods without a body)
  - Concrete methods (fully implemented)
  - Variables and constructors
- Abstract classes are used when you want to **define a common base** with some shared implementation and force subclasses to implement the rest.

### Abstract Method
- An **abstract method** is a method that is declared **without a body** using the `abstract` keyword.
- Abstract methods **must be overridden** in the first non-abstract subclass.
- Abstract methods **can only exist in abstract classes**.
- The syntax does **not include braces `{}` or any implementation** — it ends with a semicolon `;`.
- Abstract methods **cannot be static**, **final**, or **private**.
- They are used to define **common behavior** that must be implemented by all subclasses.
- Abstract methods support **runtime polymorphism** through method overriding.

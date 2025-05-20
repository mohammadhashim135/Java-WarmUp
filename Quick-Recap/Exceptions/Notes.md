# Exception Handling

Exception handling in Java is a mechanism to handle runtime errors and maintain the normal flow of the application.

---

## Definition

An **exception** is an event that disrupts the normal execution of a program. It is an object that represents an error or an unexpected behavior encountered during execution.

---

## Exception Handling Constructs

| Construct   | Description                                                       |
|-------------|-------------------------------------------------------------------|
| `try`       | Defines a block of code in which exceptions might occur.          |
| `catch`     | Defines a block of code to handle the exception.                  |
| `finally`   | Defines a block of code that will always execute (optional).      |
| `throw`     | Used to explicitly throw an exception.                            |
| `throws`    | Declares exceptions that a method may throw.                      |

---

## Types of Exceptions

### 1. Checked Exceptions
- Checked at compile-time.
- Must be handled using `try-catch` or declared using `throws`.

**Examples:**
- `IOException`
- `SQLException`
- `ClassNotFoundException`

### 2. Unchecked Exceptions
- Occur at runtime.
- Handling is optional.
- Subclasses of `RuntimeException`.

**Examples:**
- `ArithmeticException`
- `NullPointerException`
- `ArrayIndexOutOfBoundsException`

### 3. Errors
- Serious problems that applications usually should not try to handle.
- Subclasses of `Error`.

**Examples:**
- `StackOverflowError`
- `OutOfMemoryError`
- `AssertionError`

---

## Comparison Table

| Category            | Compile-Time Checked | Inherits From        | Mandatory Handling | Example Classes                       |
|---------------------|----------------------|-----------------------|--------------------|---------------------------------------|
| Checked Exception   | Yes                  | `Exception`           | Yes                | `IOException`, `SQLException`         |
| Unchecked Exception | No                   | `RuntimeException`    | No                 | `NullPointerException`, `ArithmeticException` |
| Error               | No                   | `Error`               | No                 | `StackOverflowError`, `OutOfMemoryError`     |

---

## Chained Exceptions

Java allows exceptions to be linked using the cause mechanism, enabling exception propagation with root cause preservation.

```java
Throwable cause = new ArithmeticException("Division by zero");
Exception e = new Exception("Secondary exception", cause);

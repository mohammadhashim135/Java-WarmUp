# Final Keyword in Java

The `final` keyword in Java is used to apply restrictions on variables, methods, and classes.

---

## Final Variable

- Cannot be reassigned after initialization.
- Must be assigned exactly once.
- Commonly used to define constants.
- Can also be applied to method parameters and local variables to prevent reassignment.

---

## Final Method

- Cannot be overridden in subclasses.
- Ensures the original implementation remains unchanged.

---

## Final Class

- Cannot be extended (i.e., no subclasses can inherit from it).
- Used to prevent inheritance and modification of class behavior.

---

## Use Cases

- Enforcing immutability.
- Declaring constants.
- Securing method implementations from modification.
- Restricting class extension to ensure reliable behavior.

---

## Best Practices

- Use `final` for variables that should not change after initialization.
- Use `final` for methods when overriding should be prohibited.
- Use `final` for classes that should not be subclassed.
- Apply `final` to parameters and local variables to signal they should remain unchanged.
- Avoid overuse to maintain flexibility in the codebase.
- Use `final` judiciously to balance immutability and flexibility.
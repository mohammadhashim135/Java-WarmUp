## Finalize Method (java)

The `finalize` method in Java is a method of the `Object` class that is called by the garbage collector when an object is about to be removed from memory. It is used to perform cleanup operations before the object is destroyed, such as releasing resources or closing connections.

### Syntax

```java
protected void finalize() throws Throwable {
    // cleanup code
}
```
### Key Points

- Called by the garbage collector before reclaiming the object’s memory.

- Declared as protected in the Object class and can be overridden.

- Can throw Throwable to handle cleanup exceptions.

- Execution is not guaranteed and may be skipped entirely (e.g., JVM crash or abrupt shutdown).

- Should not be used for critical cleanup as it may never run.

- Deprecated due to unpredictability, poor performance, and better alternatives.

- Use AutoCloseable and try-with-resources for resource management instead.
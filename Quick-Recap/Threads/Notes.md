# Thread and Multithreading in Java

---

## What is a Thread?

- A **thread** is the smallest unit of execution within a process.
- A **process** can have multiple threads that share resources such as memory but execute independently.
- Threads allow a program to perform multiple tasks concurrently, improving performance and responsiveness.

---

## What is Multithreading?

- **Multithreading** is the capability of a CPU or a single program to manage multiple threads of execution simultaneously.
- It enables concurrent execution of two or more parts of a program to maximize CPU usage.
- Useful in performing complex tasks, parallel processing, and handling multiple user requests in server applications.

---

## Benefits of Multithreading

- **Better CPU utilization**: Idle CPU cycles are reduced by running multiple threads.
- **Improved performance**: Tasks run in parallel, reducing overall execution time.
- **Responsive UI**: Long-running tasks run in the background without freezing the user interface.
- **Simpler program structure**: Complex operations can be divided into simpler threads.

---

## Ways to Create Threads in Java

| Method                   | Description                                                                                       |
|--------------------------|---------------------------------------------------------------------------------------------------|
| **Extending `Thread`**    | Create a new class by extending the `Thread` class and overriding the `run()` method.              |
| **Implementing `Runnable`** | Create a class that implements the `Runnable` interface and override `run()`. Pass an instance of this class to a `Thread` object.|

---

## Life Cycle of a Thread

| State           | Description                                            |
|-----------------|--------------------------------------------------------|
| **New**         | Thread object is created but not started yet.          |
| **Runnable**    | Thread is ready to run and waiting for CPU scheduling. |
| **Running**     | Thread is actively executing.                           |
| **Waiting/Blocked** | Thread is waiting for a resource or event.          |
| **Terminated**  | Thread has finished execution or stopped due to error. |

---

## Important Thread Methods

| Method                 | Description                                                        |
|------------------------|--------------------------------------------------------------------|
| `start()`              | Starts thread execution by invoking the `run()` method.           |
| `run()`                | Contains the code that defines the thread’s task.                  |
| `sleep(long millis)`   | Pauses thread execution for the specified milliseconds.           |
| `setName(String name)` | Assigns a name to the thread.                                      |
| `getName()`            | Returns the thread’s name.                                        |
| `setPriority(int prio)`| Sets thread priority (1 to 10).                                    |
| `getPriority()`        | Returns thread priority.                                           |
| `join()`               | Waits for the thread to complete before continuing execution.     |
| `interrupt()`          | Interrupts a sleeping or waiting thread.                          |

---

## Thread Priority Levels

| Priority Constant      | Value | Description                      |
|-----------------------|--------|---------------------------------|
| `MIN_PRIORITY`        | 1      | Lowest priority                  |
| `NORM_PRIORITY`       | 5      | Default (normal) priority        |
| `MAX_PRIORITY`        | 10     | Highest priority                 |

> Higher priority threads are generally executed before lower priority ones but exact scheduling depends on the JVM and OS.

---

## Example Overview

- **Class `A` extends `Thread`**: Prints even numbers.
- **Class `B` implements `Runnable`**: Prints odd numbers.
- Both threads use `sleep()` to pause execution.
- Thread names and priorities are set.
- `join()` method is used to wait for threads to finish.
  
---

## Multithreading Considerations

- **Synchronization**: When threads access shared resources, synchronization is required to avoid data inconsistency.
- **Deadlock**: A situation where two or more threads are waiting indefinitely for resources held by each other.
- **Race Conditions**: Occur when threads manipulate shared data concurrently leading to unpredictable results.
- Proper design and thread-safe code are necessary to avoid concurrency issues.

---

## Summary

- Multithreading enables concurrent execution of multiple threads within a program.
- Threads can be created by extending `Thread` or implementing `Runnable`.
- Thread lifecycle and priorities influence scheduling.
- Use `sleep()`, `join()`, and other thread methods to control execution.
- Always handle concurrency issues through synchronization and thread-safe programming.

---

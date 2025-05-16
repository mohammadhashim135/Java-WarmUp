## Static and Non-Static Blocks

### Static Block
- A static block is a block of code that is executed when the class is loaded into memory. 
- It is used to initialize static variables or perform any other static initialization tasks.
- A static block is executed only once when the class is loaded, regardless of how many instances of the class are created.
- It is defined using the `static` keyword followed by a block of code enclosed in curly braces `{}`.
- Static blocks are executed in the order they appear in the class.
- You can have multiple static blocks in a class, and they will be executed in the order they appear.
- Static blocks can access static variables and methods directly, but they cannot access instance variables or methods directly.
- Static blocks are typically used for one-time initialization tasks, such as loading configuration settings or initializing static resources.


### Non-Static Block
- A non-static block, also known as an instance initializer block, is a block of code that is executed when an instance of the class is created.
- It is used to initialize instance variables or perform any other instance initialization tasks.
- A non-static block is executed every time an instance of the class is created, before the constructor is called.
- It is defined `without` the `static` keyword, followed by a block of code enclosed in curly braces `{}`.
- Non-static blocks are executed in the order they appear in the class, after static blocks and before the constructor.
- Non-static blocks can access instance variables and methods, while static blocks cannot access instance variables or methods directly.
- Non-static blocks can be used to perform common initialization tasks for all instances of the class, while static blocks are used for class-level initialization.
# Concepts of Object Oriented Programming 

### Class
- Object Template
- Programmer defined data type (just like a String, or int)
    - Contains...
        -   attributes (member variables of other data types) 
        -   methods, and definitions.
        -   Constructors (used to initialize an object)
        -   Set default values
* Acts as a template for an object, which is an instance of a Class

### Methods
- Class Methods
    + Methods that are implemented inside of a class but do not require an instances of the class to call. 
    + Do **not** have access to the member variables of a class
    + **Can** utilize static variables in a class
    + `classname.classMethod(...)`
- Instance Methods
    - Called on an instance/an object of a class
    - `objectName.instanceMethod(...);`
- Different types of Parameter 
    -  In a method definition --> Formal Parameter
    -  In a method call --> Actual Parameter  

### Variable 
- A name for a location in memory storing a specific type of data 

### Dynamic typing vs. Static Typing 
- **Static** requires that the programmer specify the type of the object
    + Functions return specific type
    + all variables have a type 
        + `int b = 23;`
- **Dynamic** allows the programming to simply declare variabels and during runtime, the compiler determines the type 
    - Slower
    - Faster to write
    - Harder to read
    * Functions can return anything, rather than somethign specific 
        * `cat = 45;`

### Interface 
- Variables public, static, and final
- All methods are public
- Contract
- Declares methods and public variables without the implementation 
- Contain method signatures (similar to Prototypes in C)
- Methods must be implemented by a class that 'implements' the interface. 
- THe can be used to create multiple implementations of classes
    + All complete the same tasks, but do them in different ways. 
- An interface exists to show the properties an object must be able to complete. It gives methods that need to be implemented. 

### Abstract class 
- Allows private variables 
- An incomplete class
- Any sub class must implement all the methods or be declared abstract itself. 


### Declaring vs Defining a variable 
- **Declare** = something with this name and type exist. Not the information the variable stores
- **Define** = Assign data to a variable. 

### Static Variables and Functions. 
- Variable exists for all instances of a class.
- Can be accessed without an instance of a class.

### Final vs Const
- Variable who's value never changes.
- C/C++
    - Uses const to declare.
- Java
    - Uses final to declare.
    - Has const as a reserved keyword but not actually used.

### Public vs Private
- Public
    - Everyone has read and write access
    - Not good for member variables 
- Private
    - Only same file has access.
    - Best for member variables 

### Friend Functions
- Have access to the private variables of a class
- Static methods can access class variables
- [Friend Functions and Classes Example](http://www.cplusplus.com/doc/tutorial/inheritance/); 

### Friend Class
- Similar to friend functions
- You can access everything from the friend class, rather than just in one method. 


### Abstraction
- Hiding data.
- How an interface just shows the methods.
- Client has access to a class but knows only what the class does, not how it works.
- We don't know the components, we just know the parameters and results.


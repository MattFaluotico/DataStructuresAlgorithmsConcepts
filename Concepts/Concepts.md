# Concepts 

Some Object Oriented concepts 

Variables and Methods


### Declare vs define
- Declare = something with this name and type exist. Not the information the variable stores
- Define = Assign data to a variable. 

### Static
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
	- Everyone has access.
- Private
	- Only same file has access.

Object Oriented Programming Concepts
-

### Interface 
- Al variables are public, static, and final
- Declares methods and public variables without the implementation 
- Contain method signatures (similar to Prototypes in C)
- Methods must be implemented by a class that 'implements' the interface. 
- THe can be used to create multiple implementations of classes
    + All complete the same tasks, but do them in different ways. 
- An interface exists to show the properties an object must be able to complete. It gives methods that need to be implemented. 

### Class
- Object template
- Build the foundation of an object, the attributes of an object,  the things am object can do (methods). 
- Sets initial values
- Creates abstraction with method names and private variables
- We know what instances of the object represents, but we don't know how it is made up

### Methods
- Class Methods
    + Methods that are implemented inside of a class but do not require an instances of the class to call. T
    + Do **not** have access to the member variables of a class
    + **Can** utilize static variables in a class
    + `classname.classMethod(...)`
- Instance Methods
	- Called on an instance/an object of a class
	- `objectName.instanceMethod(...);`

### Friend Functions
- Have access to the private variables of a class
- Static methods can access class variables
- [Friend Functions and Classes Example](http://www.cplusplus.com/doc/tutorial/inheritance/); 

### Friend Class
- Similar to friend functions
- You can access everything from the friend class, rather than just in one method. 

### Abstract class 
- Allows private variables 
- An incomplete class
- Any sub class must implement all the methods or be declared abstract itself. 

### Abstraction
- Hiding data.
- How an interface just shows the methods.
- Client has access to a class but knows only what the class does, not how it works.
- We don't know the components, we just know the parameters and results.


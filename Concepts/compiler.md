# The Compiler and System

##Stack (static)

Normal Variables

## Heap (dynamic)

Malloc, Pointers, Structs

Should be freed

Objective C objects live on the heap

## Strong vs Weak Reference

A variable must be kept alive if it is needed by other variabels down the road

### Strong

Anything that points to a strong variable will not be destoryed as long as I still have the strong variable.

Since an object holds onto its attributes, the attributes are strong

The standard...
Creating a new object

object ---> Strong (attribute)

### Weak

If there is no strong reference to the object, it is removed off the heap

- Delegates
- Sub/ Child Views



## Compiling

* The compiler takes a program (source code/ text ) and turns it into an execuatable. Without it, a file is simply text.

### Process

1. The Preprocessor.
  - Replaces all definitions and includes (kind of like one big file )
2. Then a compiler makes an assemply file.
3. Assembler
  - Human --> Machine
4. Linker (libraries)

#### Lets start with a source file...

- The source file is run through a preprocessor, then a compiler.
- We edit the source file


1. Tokenizing
  - Groups everything together
  - Blocks, while loops, if statements, etc.
2. Parsing the tokens
  - Formats them in a tree
3. Optimize and Error
  - Makes sure the code is correct
  -
4. Translate to machine code / Object File

Object Code

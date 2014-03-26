# Data Structures

## Binary Search Tree
- Tree with a left child and a right child. The left child is always less than the right child. Can be equal to the root.
- The height of the tree is log<sub>2</sub>(n) where n is the number of elements

#### Average Running Times.
- Insert: O(lg(n))
- Remove: O(lg(n))
- Contains: O(log(n))

## Array
- In order list of elements
- Can be stored in different ways.
- Set size
- An ArrayList is not a normal array

#### Average Running Times.
- Insert: Usually O(c)
- Remove: Usually O(c)
- Contains: O(n)

## Linked List
- Object with a reference to the next object
- Can be doubly linked or single linked
- Dynamically sized
- Uses pointers

**Linked List vs Array**

- an Array has a set size, linked list changes dynamically
- Must all be the same data type, unless using an array object
- Even the array data type must double it's size and then copy the content -> slow
- Array has fast search, LinkedList has fast add
- Linked list is easier to insert at specific locations because we just move the pointer

#### Average Running Time
- Insert: O(c)
- Remove: O(c)
- find: O(n)

## Hash Table
- Elements stored in a hashtable. Fastest searching time, but not stored in any particular order
- Good for referencing elements. Used in Dictionaries and HashMaps

#### Average Running Times.
- Insert: O(c)
- Remove: O(c)
- Contains: O(c)

## Heap
- A tree where the root value is greater or equal to the two children. Similar to a BST only stored in an array. The size of the array is n, where n is the number of elements.
- Uses heapify and siftDown to maintain the heap.


#### Average Running Times.
- Build Heap: O(n)
- Heapify: O(lg(n))
- Sift Down: O(lg(n))
- Insert: O(lg(n))
- Remove: O(lg(n))
- Contains: O(log(n))
- peek: O(c)
    - returns the root of the tree, depending on it being a max-min or a min-max tree

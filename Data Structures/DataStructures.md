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

#### Average Running Times. 
- Insert: 
- Remove: 
- Contains: O(n) 

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


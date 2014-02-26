# Sorting

Sorting a data structure (usually as an array). Most sorts can be done in place. Doing it in place saves space. You need to balance the space used and the time it takes based on the conditions required. 

The current organization of the array effects the runtime of the sorting algorithm. Sorts like bubbled and selection are much faster if the array is almost sorted.

[Wikipedia list of sorting algorithms](http://en.wikipedia.org/wiki/Sorting_algorithm)

I.E. Adding one element to an sorted array should not use quicksort. 

## Quicksort
- In place sorting
- Moves everything less than the pivot to the left, greater than the pivot to the left
- **Best Runtime: O(n log (n))**
- **Average Runtime: O(n log (n))**
- called recursively 

#### Process 
- Picks an element, which we we call the pivot
- Iterates over the array, putting everything smaller than the pivot in front of the pivot and everything greater than the pivot behind it 
    + This is called a partition 
+ Using the pivot as a separator, recursivly call on the less-than portion and the greater-than portion

#### Code

    get pivot
        left and right until left > pivot and right < pivot
            swap left and right
        call with new range 



## Heapsort
- Destroys a copy heap in simple mode
- Can be written to ignore elements after the newly inserted one. 
    -  After swapping the last value with the root, shift over the max value. 
    -  This will organize the array into a sorted array.
- Turns a randomly sorted array into a heap. Sorts the heap.
    -  A heap is a binary tree where the parent is larger than the children.
- **Runtime: O(n log (n))**

#### Code

    Turn into Heap
        Remove root, replace it with the last value of the heap
            Sift it down 
            Call until this new heap is empty

## Mergesort

[Wikipedia referencee](http://en.wikipedia.org/wiki/Merge_sort)

- Simpler with new arrays
    - Can be written in place
- split in half, sort each half, called recursively so the halves are smalls
- **Runtime: O(n log (n))**
- recursive call

#### Process
- Splits an array in half (at a midpoint) 
- Recursively calls mergesort on each half
- Iterating over each half, merges the smaller values into an array
    + The first time it should be comparing two values
- Then do the same for the larger half
    -   Recursively merge 

#### Code

    Split in center
        recursive call to split
        Merge the two arrays in order
            iterate over and insert the smallest first

## Bubble sort
- In place sorting
- compare each consecutive element to force the largest to the end
- recursive with a smaller size
- **Best Runtime: O(n)**
- **Average Runtime: O(n<sup>2</sup>)**

#### Code

    Start at front
        compare fist two and swap
            move to next and compare...
        call with new range

## Insersion
- In place sorting
- swap element with one prior until you reach the end or a smaller one

#### Code

    ...

## Selection Sort
- waste of time

#### Code

    ...


## Counting Sort

[Example in Objective C for counting words](https://github.com/MattFaluotico/wordsByOccurrence)

- Sorting in O(n) time
- Not in place sorting, uses at least 2n
- Needs to somehow use integers and the largest value must be known
- Uses an array, the size of the max value in the initial array, and frequency of each number in the array index of said number
- Increments the value at the index to the sum of counts before it. (A[i] = A[i-1] + A[i])
- Iterates over the initial Array and places the element at the index of the count stored in the index of the element and then decrements it. 
    -  SortedIndex = CountedArray.ValueAtInitial( Array[i]) 

- **Running Time : O(n)**

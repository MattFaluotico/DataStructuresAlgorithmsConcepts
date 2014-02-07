# Sorting. 
Sorting algorithms and their run time. alog with some best use examples. A rough summary of the implementation is provided. Working implementations of each are expected in the future. 

[Wikipedia list of sorting algorithms](http://en.wikipedia.org/wiki/Sorting_algorithm)

## Quicksort

- Picks an element, which we we call the pivot
- Iterates over the array, putting everything smaller than the pivot in front of the pivot and everything greater than the pivot behind it 
    + This is called a partition 
+ Using the pivot as a separator, recursivly call on the less-than portion and the greater-than portion

#### Running Times 

----

## Merge Sort
[Wikipedia referencee](http://en.wikipedia.org/wiki/Merge_sort)

- Splits an array in half (at a midpoint) 
- Recursively calls mergesort on each half
- Iterating over each half, merges the smaller values into an array
    + The first time it should be comparing two values
- Then do the same for the larger half
    -   Recursively merge 

#### Running Time 

Expected: O(*n* log (*n*))

---

## Heapsort

Usually faster than quicksort, but has a worst case runtime of O(*n*<sup>2</sup>), thus not always being the best sorting option. Builds a heap from the bottom up. 

- Heapify an array
- 

## Counting Sort

Sorting in O(n) time. This needs to be done using integers. Can be done for objects that contain an integer ID. Any value that can be presented as an integer. This uses multiple arrays to store the count of the occurrences in the array index. 

[Example in Objective C for counting words](https://github.com/MattFaluotico/wordsByOccurrence)

#### Running Time 

Expected: O(*n*)

Worst Case: O (*n*)

... All are )(*n*)

----





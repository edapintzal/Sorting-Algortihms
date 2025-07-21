## Sorting Algorithms Comparison: Insertion Sort, Merge Sort, Heap Sort, and Quick Sort
This assignment involves implementing and comparing the performance of four sorting algorithms:
- **Insertion Sort**
- **Merge Sort**
- **Heap Sort**
- **Quick Sort**

1. Algorithms
1.1. Insertion Sort
Insertion sort is a sorting algorithm that places an unsorted element at its suitable place in each
iteration. Insertion sort works similarly as we sort cards in our hand in a card game. We assume
that the first card is already sorted then, we select an unsorted card. If the unsorted card is greater
than the card in hand, it is placed on the right otherwise, to the left. In the same way, other unsorted
cards are taken and put in their right place.

1.2. Merge Sort
Merge sort sorts a list by dividing it into smaller sublists, sorting those sublists, and then merging
them back together. It works by recursively splitting the list into halves until each sublist has only
one element, which is inherently sorted. Then, it merges the sorted sublists back together to
produce the final sorted list.

1.3. Heap Sort
Heap sort uses a binary heap data structure. The binary heap is a complete binary tree that satisfies
the heap property: in a max heap, each parent node is greater than or equal to its children.
Heap sort divides the input into a sorted and an unsorted region and iteratively shrinks the unsorted
region by extracting the largest element and moving it to the sorted region.

1.4. Quick Sort
Quick sort is a highly efficient divide-and-conquer sorting algorithm. It works by selecting a 'pivot'
element from the list and partitioning the other elements into two sub-arrays: those less than the
pivot and those greater than the pivot. The pivot element is then in its final sorted position. The
algorithm then recursively sorts the sub-arrays.

The algorithms will be tested on datasets of varying sizes (1K, 10K, and 100K) and types (random, increasing-order, and decreasing-order integers). The goal is to analyze their efficiency under different conditions.

Hardware Specifications Affecting Sorting Performance:
* CPU: Intel Core i7-12700H, 14 cores (6P + 8E), 20 threads
* GPU: NVIDIA GeForce RTX 3050
* RAM: 16 GB total, 4.74 GB available
* Virtual Memory: 21.1 GB total, 8.26 GB available
* Disk Page File: 5.50 GB (C:\pagefile.sys)
* System Type: 64-bit OS, x64-based processor
* Boot Mode: UEFI
* Likely Storage Type: SSD (TF Gaming series)

Comparison Table of Algorithms:

<img width="967" height="371" alt="resim" src="https://github.com/user-attachments/assets/f0d5e217-98fc-4462-b548-68820ae65d5c" />

Conclusion:

*For insertion sort it works best when the input size is at least and increased ordered. And it works
worst when the input size is the biggest and inputs are decreased ordered.

*For merge sort best is when the input size is at least and decreased ordered. Worst one is when input
size is the biggest and inputs are random ordered.

*For heap sort best is when the input size is at least and inputs are decreasing ordered. Worst one is
when input size is the biggest and inputs are random ordered.

*For quick sort best is when the input size is at least and inputs are random ordered. Worst one is when
input size is the biggest and the inputs are increasing ordered.

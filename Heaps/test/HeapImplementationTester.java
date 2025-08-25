package Heaps.test;

import Heaps.service.HeapImplementation;

/*
 * ---------------Heaps-----------------
 * Heap is a special tree-based data structure that satisfies the heap property.
 * In a min-heap, for any given node, the value of the node is less than or equal to the values of its children.
 * In a max-heap, for any given node, the value of the node is greater than or equal to the values of its children.
 * Heaps are commonly used to implement priority queues, where the highest (or lowest) priority element is always at the root of the heap.
 * Characteristics of Heaps:
 * 1. Binary Tree: Heaps are typically implemented as binary trees, where each node has at most two children.
 * 2. Complete Binary Tree: A heap is a complete binary tree, meaning all levels are fully filled except possibly for the last level, which is filled from left to right.   
 * 3. Heap Order Property: 
            *  - Min-Heap: The value of each node is less than or equal to the values of its children. OR (Children >= Parent)
            *  - Max-Heap: The value of each node is greater than or equal to the values of its children. OR (Children <= Parent)
 * 
 */

/*
 * Tester class to test the heap implementation.
 */

public class HeapImplementationTester {
    public static void main(String[] args) {
        HeapImplementation heap = new HeapImplementation();

        heap.add(5);
        heap.add(2);
        heap.add(14);
        heap.add(13);
        heap.add(4);
        heap.add(1);

        while(!heap.isEmpty())
        {
            System.out.println(heap.peek());

            heap.remove();
        }
    }
}

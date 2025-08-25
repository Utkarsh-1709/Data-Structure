package Heaps.test;

import java.util.PriorityQueue;

/*
 * Priority Queue Implementation using Java's PriorityQueue class
 * This is a simple test class to demonstrate the usage of PriorityQueue.
 * It adds several integers to the priority queue and then removes and prints them in order of priority (smallest to largest).
 * The PriorityQueue class in Java implements a min-heap by default.
 * 
 */

public class PriorityQueueJCF {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(10); // O(log n)
        pq.add(14);
        pq.add(9);
        pq.add(8);
        pq.add(13);
        pq.add(4);

        while (!pq.isEmpty()) {
            System.out.println(pq.peek());  // O(1)
            pq.remove(); // O(log n)
        }

    }
    
}

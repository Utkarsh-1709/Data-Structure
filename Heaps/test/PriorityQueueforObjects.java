package Heaps.test;

// import java.util.Comparator;
import java.util.PriorityQueue;

import Heaps.service.Student;

/* 
 * This class demonstrates the use of PriorityQueue with custom objects (Student).
 * The Student class implements Comparable interface to define the natural ordering based on rank.
 * The PriorityQueue will order Student objects in ascending order of their rank.
 * If you want to order them in descending order, you can use Comparator.reverseOrder() when creating the PriorityQueue.
*/

public class PriorityQueueforObjects {
    public static void main(String[] args) {
        // PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("A", 2));
        pq.add(new Student("B", 1));
        pq.add(new Student("C", 6));
        pq.add(new Student("D", 4));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().getName()+"->"+pq.peek().getRank());
            pq.remove();
        }
    }
}

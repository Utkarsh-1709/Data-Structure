package Heaps.service;

/* 
 * Student class implements Comparable interface to compare Student objects based on their rank.
 * This allows the PriorityQueue to order Student objects by their rank.
 * CompareTo method is overridden to define the natural ordering of Student objects.
 * If the rank of the current object is less than the rank of the object being compared to, it returns a negative value.
 * If the rank of the current object is greater, it returns a positive value.
 * If both ranks are equal, it returns zero.
 * This ensures that the PriorityQueue will order Student objects in ascending order of their rank.
 * If you want to order them in descending order, you can simply reverse the subtraction in the compareTo method.
 * For example, return s2.rank - this.rank;
*/

public class Student implements Comparable<Student>{
    String name;
    int rank;

    public Student(String name, int rank)
    {
        this.name = name;
        this.rank = rank;
    }

    @Override
    public int compareTo(Student s2)
    {
        return this.rank - s2.rank;
    }

    public String getName()
    {
        return this.name;
    }

    public int getRank()
    {
        return this.rank;
    }
}

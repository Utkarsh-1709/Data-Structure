package Heaps.service;

import java.util.ArrayList;

/*
 * Min Heap Implementation
 * Time Complexity: O(log n)
 * Space Complexity: O(n)
 * Approach: Using ArrayList to store the elements of the heap and maintaining the heap property by swapping elements 
 * while adding and removing elements.
 */

public class HeapImplementation {
    ArrayList<Integer> list = new ArrayList<>();

    public void add(int data)
    {
        list.add(data);

        int childIdx = list.size()-1;
        int parentIdx = (childIdx-1)/2;

        while(list.get(childIdx)<list.get(parentIdx))
        {
            int temp = list.get(childIdx);
            list.set(childIdx, list.get(parentIdx));
            list.set(parentIdx, temp);

            childIdx = parentIdx;
            parentIdx = (childIdx-1)/2;
        }
    }

    public int peek()
    {
        return list.get(0);
    }

    public int remove(){
        int data = list.get(0);

        //Step 1:- Swap first and last
        int temp = list.get(0);
        list.set(0, list.get(list.size()-1));
        list.set(list.size()-1,temp);

        //Step2:- remove last
        list.remove(list.size()-1);

        //Step3:- Heapify
        heapify(0);
        return data;
    }

    private void heapify(int i)
    {
        int left = 2*i+1;
        int right = 2*i+2;
        int minIdx = i;

        if(left<list.size()-1 && list.get(minIdx)>list.get(left))
        {
            minIdx = left;
        }

        if(right<list.size()-1 && list.get(minIdx)>list.get(right))
        {
            minIdx = right;
        }

        if(minIdx!=i)
        {
            int temp = list.get(i);
            list.set(i, list.get(minIdx));
            list.set(minIdx, temp);

            heapify(minIdx);
        }
    }

    public boolean isEmpty()
    {
        return list.size()==0;
    }
}

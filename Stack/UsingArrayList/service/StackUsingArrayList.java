package Stack.UsingArrayList.service;

import java.util.ArrayList;

/**
 * StackUsingArrayList class implements a Stack using an ArrayList.
 * It provides methods to check if the stack is empty, push an element onto the stack,
 * pop an element from the stack, and peek at the top element of the stack.
 */

public class StackUsingArrayList {
    
    private ArrayList<Integer> list = new ArrayList<>();

    public boolean isEmpty()
    {
        return list.size()==0;
    }

    public void push(int a)
    {
        list.add(a);
    }

    public int pop()
    {
        if(isEmpty())
        {
            return -1;
        }
        int top = list.get(list.size()-1);
        
        list.remove(list.size()-1);

        return top;
    }

    public int peek()
    {
        if(isEmpty())
        {
            return -1;
        }

        return list.get(list.size()-1);
    }

}

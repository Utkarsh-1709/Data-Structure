package Stack.UsingArrayList.test;

import Stack.UsingArrayList.service.StackUsingArrayList;

/*
 * StackUsingArrayListTester class tests the functionality of the StackUsingArrayList class.
 * It pushes several integers onto the stack and then pops them off, printing each one.
 */

public class StackUsingArrayListTester {
    
    public static void main(String[] args) {
        StackUsingArrayList stack = new StackUsingArrayList();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }

    }

}

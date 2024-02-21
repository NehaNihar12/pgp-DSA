package org.example.stackAndQueue;
import java.util.*;

import java.util.Stack;

public class SortStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        sort(stack);
    }

    // Method to sort the elements of the stack in ascending order
    static void sort(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();

        while (!stack.isEmpty()) {
            // Pop the top element from the original stack
            int temp = stack.pop();

            // Move elements from the temporary stack to the original stack until the correct position is found
            while (!tempStack.isEmpty() && tempStack.peek() > temp) {
                stack.push(tempStack.pop());
            }

            // Push the current element to the temporary stack
            tempStack.push(temp);
        }

        // Print the sorted stack
        System.out.println("Sorted Stack: " + tempStack);
    }
}

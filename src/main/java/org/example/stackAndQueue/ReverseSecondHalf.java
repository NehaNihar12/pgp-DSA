package org.example.stackAndQueue;
import java.util.Stack;
import java.util.*;

public class ReverseSecondHalf {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        reverseSecondHalf(stack);
        System.out.println(stack);
    }

    // Method to reverse the last half of the elements from the bottom of the stack
    static void reverseSecondHalf(Stack<Integer> stack) {
        int n = stack.size();
        reverse(stack, n / 2);
    }

    // Recursive method to reverse the last half of the elements from the bottom of the stack
    static void reverse(Stack<Integer> stack, int n) {
        if (n > 0) {
            int temp = stack.pop();
            reverse(stack, n - 1);
            //Insert all the integers held in function call stack one by one from the bottom to top
            insertAtBottom(stack, temp, n - 1);
        }
    }

    // Recursive method to insert the element temp at (ceil(n/2)+1)th position
    static void insertAtBottom(Stack<Integer> stack, int temp, int n) {
        if (n == 0)
            stack.push(temp);
        else {
            int temp2 = stack.pop();
            // Remove all the elements except the first ceil(n/2) elements of the original stack
            insertAtBottom(stack, temp, n - 1);
            // Push all the integers held in function call stack once the integer is inserted at the (ceil(n/2)+1)th position
            stack.push(temp2);
        }
    }
}

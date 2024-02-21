package org.example.stackAndQueue;

import java.util.List;
import java.util.LinkedList;
import java.util.EmptyStackException;

public class Stack<T> {

    public static void main(String[] arg) {
        Stack<String> stack = new Stack<String>();
        
        stack.push("OOP");
        stack.push("Algorithms");
        stack.push("Data Structures");

        try {
            while (true) {
                System.out.println("Popped " + stack.pop());
            }
        } catch (EmptyStackException e) {
            System.out.println("Done!");
        }
    }

    private final LinkedList<T> list = new LinkedList<T>();

    public void push(T e) {
        this.list.add(e);
    }

    public T pop() {
        if (!this.list.isEmpty()) {
            T e = list.getLast();
            list.removeLast();
            return e;
        }
        throw new EmptyStackException();
    }

    public Boolean isEmpty() {
        return this.list.isEmpty();
    }
}
package com.bladyzamosc.stacksandqueues;

import java.util.Stack;

/**
 * User: Z6EKI
 * Date: 04.12.2022
 */
public class QueueBy2Stacks
{
    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> s2 = new Stack<>();

    public void enqueue(int value) {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        s1.push(value);
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    public int dequeue() {
        if (s1.isEmpty()) {
            throw new NullPointerException("No elements in the tree");
        }
        return s1.pop();
    }

}

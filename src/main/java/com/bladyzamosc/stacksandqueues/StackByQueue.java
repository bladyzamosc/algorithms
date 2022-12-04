package com.bladyzamosc.stacksandqueues;

import java.util.LinkedList;
import java.util.Queue;

/**
 * User: Z6EKI
 * Date: 04.12.2022
 */
public class StackByQueue
{
    private Queue<Integer> queue = new LinkedList();

    public int pop()
    {
        return queue.poll();
    }

    public void push(Integer value)
    {
        Queue<Integer> helper = new LinkedList();
        helper.offer(value);
        while (!queue.isEmpty())
        {
            helper.offer(queue.poll());
        }
        queue = helper;
    }

}

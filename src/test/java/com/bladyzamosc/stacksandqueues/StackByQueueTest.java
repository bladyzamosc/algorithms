package com.bladyzamosc.stacksandqueues;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

/**
 * User: Z6EKI
 * Date: 04.12.2022
 */
public class StackByQueueTest
{
    @Test
    public void test() {
        StackByQueue stackByQueue = new StackByQueue();
        stackByQueue.push(1);
        stackByQueue.push(2);
        stackByQueue.push(3);

        Assertions.assertEquals(3, stackByQueue.pop());
        stackByQueue.push(4);
        Assertions.assertEquals(4, stackByQueue.pop());
        Assertions.assertEquals(2, stackByQueue.pop());
        Assertions.assertEquals(1, stackByQueue.pop());

    }
}

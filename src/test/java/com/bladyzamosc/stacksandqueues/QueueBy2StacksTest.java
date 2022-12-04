package com.bladyzamosc.stacksandqueues;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * User: Z6EKI
 * Date: 04.12.2022
 */
public class QueueBy2StacksTest
{
    @Test
    public void testQueueBy2StacksTest() {
        QueueBy2Stacks queueBy2Stacks = new QueueBy2Stacks();
        queueBy2Stacks.enqueue(1);
        queueBy2Stacks.enqueue(2);
        queueBy2Stacks.enqueue(3);

        Assertions.assertEquals(1, queueBy2Stacks.dequeue());
        Assertions.assertEquals(2, queueBy2Stacks.dequeue());
        Assertions.assertEquals(3, queueBy2Stacks.dequeue());
    }
}

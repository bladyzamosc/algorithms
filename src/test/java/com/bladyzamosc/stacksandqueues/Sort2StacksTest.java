package com.bladyzamosc.stacksandqueues;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Stack;

/**
 * User: Bladyzamosc
 * Date: 04.09.2022
 */
public class Sort2StacksTest
{
  @Test
  public void testSort2Stacks()
  {
    Stack<Integer> unsortedStack = new Stack<>();
    unsortedStack.push(10);
    unsortedStack.push(1);
    unsortedStack.push(5);
    unsortedStack.push(6);
    unsortedStack.push(2);
    unsortedStack.push(5);
    unsortedStack.push(7);

    Sort2Stack sort2Stack = new Sort2Stack();
    Stack<Integer> sortedStack = sort2Stack.sort(unsortedStack);
    Assertions.assertEquals(1, sortedStack.peek());
    Assertions.assertEquals(1, sortedStack.pop());
    Assertions.assertEquals(2, sortedStack.pop());
    Assertions.assertEquals(5, sortedStack.pop());
    Assertions.assertEquals(5, sortedStack.pop());
    Assertions.assertEquals(6, sortedStack.pop());
    Assertions.assertEquals(7, sortedStack.pop());
    Assertions.assertEquals(10, sortedStack.pop());
  }
}

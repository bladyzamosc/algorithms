package com.bladyzamosc.stacksandqueues;

import java.util.Stack;

/**
 * User: Bladyzamosc
 * Date: 04.09.2022
 */
public class Sort2Stack
{
  public Stack<Integer> sort(Stack<Integer> stack) {
    Stack<Integer> helper = new Stack<>();

    while (!stack.empty()) {
      Integer temp = stack.pop();
      while (!helper.isEmpty() && helper.peek() > temp) {
        stack.push(helper.pop());
      }
      helper.push(temp);
    }

    while (!helper.isEmpty()) {
      stack.push(helper.pop());
    }

    return stack;
  }
}

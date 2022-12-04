package com.bladyzamosc.graphs;

import java.util.Stack;

/**
 * User: Z6EKI
 * Date: 04.12.2022
 */
public class PostOrderUsingStacks
{

    public void printPostOrder(TreeNode node)
    {
        if (node == null)
        {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(node);

        Stack<TreeNode> stackHelper = new Stack<>();

        while (!stack.isEmpty())
        {
            TreeNode current = stack.pop();
            stackHelper.push(current);
            if (current.getLeft() != null)
            {
                stack.push(current.getLeft());
            }
            if (current.getRight() != null)
            {
                stack.push(current.getRight());
            }
        }

        while (!stackHelper.isEmpty())
        {
            System.out.println("Node " + stackHelper.pop().data);
        }

    }
}

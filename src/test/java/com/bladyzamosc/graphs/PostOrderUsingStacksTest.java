package com.bladyzamosc.graphs;


import org.junit.jupiter.api.Test;

/**
 * User: Z6EKI
 * Date: 04.12.2022
 */
public class PostOrderUsingStacksTest
{

    private static TreeNode getNode() {
        TreeNode node = new TreeNode(20);
        node.setRight(new TreeNode(25));
        node.setLeft(new TreeNode(9));
        node.getLeft().setLeft(new TreeNode(5));
        node.getLeft().setRight(new TreeNode(12));
        node.getLeft().getRight().setLeft(new TreeNode(11));
        node.getLeft().getRight().setRight(new TreeNode(14));
        return node;
    }

    @Test
    public void test() {
        PostOrderUsingStacks postOrderUsingStacks = new PostOrderUsingStacks();
        postOrderUsingStacks.printPostOrder(getNode());
    }
}

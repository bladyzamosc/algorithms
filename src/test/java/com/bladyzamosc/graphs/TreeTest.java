package com.bladyzamosc.graphs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * User: Bladyzamosc
 * Date: 05.09.2022
 */
public class TreeTest
{
  @Test
  public void testMinimalDBS()
  {
    Integer[] array = new Integer[]{1, 3, 4, 5, 6, 7, 8, 9, 10, 22, 11};
    TreeMix treeMix = new TreeMix();
    TreeNode treeNode = treeMix.minimalBST(array, 0, array.length - 1);
    System.out.println(treeNode);
  }

  @Test
  void testBalanced()
  {
    Integer[] array = new Integer[]{1, 3, 4, 5, 6, 7, 8, 9, 10, 22, 11};
    TreeMix treeMix = new TreeMix();
    TreeNode treeNode = treeMix.minimalBST(array, 0, array.length - 1);
    Assertions.assertTrue(treeMix.isBalanced(treeNode));
  }

  @Test
  void testNOTBalanced()
  {
    Integer[] array = new Integer[]{1, 3, 4, 5, 6, 7, 8, 9, 10, 22, 11};
    TreeMix treeMix = new TreeMix();
    TreeNode treeNode = treeMix.minimalBST(array, 0, array.length - 1);
    TreeNode node = new TreeNode(77);
    node.left = new TreeNode(88);
    node.left.left = new TreeNode(99);
    node.left.left.right = new TreeNode(100);
    node.left.left.right.right = new TreeNode(101);
    node.left.left.right.right.left = new TreeNode(102);
    node.left.left.right.right.left.left = new TreeNode(102);
    treeNode.left = node;
    Assertions.assertFalse(treeMix.isBalanced(treeNode));
  }
}

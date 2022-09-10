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
    node.setLeft(new TreeNode(88));
    node.getLeft().setLeft(new TreeNode(99));
    node.getLeft().getLeft().setRight(new TreeNode(100));
    node.getLeft().getLeft().getRight().setRight(new TreeNode(101));
    node.getLeft().getLeft().getRight().getRight().setLeft(new TreeNode(102));
    node.getLeft().getLeft().getRight().getRight().getLeft().setLeft(new TreeNode(102));
    treeNode.setLeft(node);
    Assertions.assertFalse(treeMix.isBalanced(treeNode));
  }
}

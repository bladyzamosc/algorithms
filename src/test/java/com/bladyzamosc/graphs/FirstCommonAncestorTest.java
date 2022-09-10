package com.bladyzamosc.graphs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * User: Bladyzamosc
 * Date: 10.09.2022
 */
public class FirstCommonAncestorTest
{

  @Test
  public void testAncestor()
  {
    TreeNode parent = new TreeNode(0);
    parent.setLeft(new TreeNode(1));
    parent.setRight(new TreeNode(2));
    parent.getLeft().setLeft(new TreeNode(11));
    parent.getLeft().setRight(new TreeNode(12));
    parent.getRight().setLeft(new TreeNode(21));
    parent.getRight().getLeft().setLeft(new TreeNode(211));
    parent.getRight().setRight(new TreeNode(22));
    parent.getRight().getRight().setLeft(new TreeNode(221));
    parent.getRight().getRight().setRight(new TreeNode(222));
    FirstCommonAncestor firstCommonAncestor = new FirstCommonAncestor();
    TreeNode result = firstCommonAncestor.firstCommonAncestor(parent.getRight().getLeft().getLeft(), parent.getRight().getRight().getLeft());
    Assertions.assertEquals(parent.getRight(), result);
  }
}

package com.bladyzamosc.graphs;

/**
 * User: Bladyzamosc
 * Date: 19.09.2022
 */
public class InorderSuccessor
{
  public int findInorderSuccessor(TreeNode root, int value)
  {
    TreeNode node = findNode(root, value);
    TreeNode inOrderNode = findInorderSuccessorFromNode(node, node.data);
    return inOrderNode.data;
  }

  private TreeNode findInorderSuccessorFromNode(TreeNode node, Integer data)
  {
    if (node.getRight() != null && node.getRight().data > data)
    {
      TreeNode result = node.getRight();
      while (result.getLeft() != null && result.getLeft().data > data)
      {
        result = result.getLeft();
      }
      return result;
    }

    if (node.getParent() != null && node.getParent().data > data)
    {
      return node.getParent();
    }

    return findInorderSuccessorFromNode(node.getParent(), data);
  }

  private TreeNode findNode(TreeNode node, int value)
  {
    if (node.data < value)
    {
      return findNode(node.getRight(), value);
    }
    else if (node.data > value)
    {
      return findNode(node.getLeft(), value);
    }
    return node;
  }

  private void verify(TreeNode right, TreeNode candidate, int value)
  {

  }
}

package com.bladyzamosc.graphs;

/**
 * User: Bladyzamosc
 * Date: 05.09.2022
 */
public class TreeNode
{
  Integer data;
  private TreeNode left;
  private TreeNode right;
  private TreeNode parent;

  public TreeNode(Integer data)
  {
    this.data = data;
  }

  public void setRight(TreeNode right)
  {
    this.right = right;
    if (right != null)
    {
      right.parent = this;
    }
  }

  public void setLeft(TreeNode left)
  {
    this.left = left;
    if (left != null)
    {
      left.parent = this;
    }
  }

  public TreeNode getLeft()
  {
    return left;
  }

  public TreeNode getRight()
  {
    return right;
  }

  public TreeNode getParent()
  {
    return parent;
  }
}

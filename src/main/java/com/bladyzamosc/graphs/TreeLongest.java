package com.bladyzamosc.graphs;

/**
 * User: Bladyzamosc
 * Date: 17.09.2022
 */
public class TreeLongest
{


  public int longest(TreeNode root)
  {
    int path = longest(root, 0);
    return path;
  }

  private int longest(TreeNode root, int i)
  {
    if (root == null)
    {
      return i;
    }
    int left = longest(root.getLeft(), i + 1);
    int right = longest(root.getRight(), i + 1);
    return Math.max(left, right);
  }

}

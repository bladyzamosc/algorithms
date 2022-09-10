package com.bladyzamosc.graphs;

/**
 * User: Bladyzamosc
 * Date: 10.09.2022
 */
public class FirstCommonAncestor
{
  public TreeNode firstCommonAncestor(TreeNode first, TreeNode second)
  {

    if (first == second)
    {
      return first;
    }
    int depthFirst = depth(first);
    int depthSecond = depth(second);

    int abs = Math.abs(depthFirst - depthSecond);
    if (depthFirst < depthSecond)
    {
      TreeNode temp = first;
      first = second;
      second = temp;
      first = goUp(abs, first);
    }
    while (first != second)
    {
      first = first.getParent();
      second = second.getParent();
    }
    return first;
  }

  private TreeNode goUp(int abs, TreeNode first)
  {
    for (int i = 0; i <= abs; i++)
    {
      first = first.getParent();
    }
    return first;
  }

  private int depth(TreeNode first)
  {
    int counter = 0;
    while (first != null)
    {
      counter++;
      first = first.getParent();
    }
    return counter;
  }
}

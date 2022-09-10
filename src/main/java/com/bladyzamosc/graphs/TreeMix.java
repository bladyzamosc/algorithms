package com.bladyzamosc.graphs;

import java.util.*;

/**
 * User: Bladyzamosc
 * Date: 05.09.2022
 */
public class TreeMix
{
  public TreeNode minimalBST(Integer[] array, int s, int e)
  {
    if (e < s)
      return null;
    int mid = (s + e) / 2;
    TreeNode treeNode = new TreeNode(array[mid]);
    treeNode.setLeft(minimalBST(array, s, mid - 1));
    treeNode.setRight(minimalBST(array, mid + 1, e));
    return treeNode;
  }

  public boolean isBalanced(TreeNode root)
  {
    List<Integer> heights = new ArrayList<>();
    checkHeightsOdLeafs(root, heights, 1);
    Optional<Integer> min = heights.stream().min(Comparator.naturalOrder());
    Optional<Integer> max = heights.stream().max(Comparator.naturalOrder());
    return max.get() - min.get() < 2;
  }

  private void checkHeightsOdLeafs(TreeNode node, List<Integer> heights, int level)
  {
    if (node.getLeft() == null && node.getRight() == null)
    {
      heights.add(level);
    }
    else
    {
      if (node.getLeft() != null)
      {
        checkHeightsOdLeafs(node.getLeft(), heights, level + 1);
      }
      if (node.getRight() != null)
      {
        checkHeightsOdLeafs(node.getRight(), heights, level + 1);
      }
    }
  }
}

package com.bladyzamosc.linkedlists;

import org.jetbrains.annotations.Nullable;

/**
 * User: Z6EKI
 * Date: 04.09.2022
 */
public class SumList
{

  public Node sumReverse(Node one, Node two)
  {
    int sumInt = getSumOfNode(one);
    sumInt += getSumOfNode(two);
    Node sum = gteSumNode(sumInt);
    return sum.reverse(sum);
  }

  private int getSumOfNode(Node one)
  {
    int sumInt = 0;
    while (one != null)
    {
      if (one != null)
      {
        sumInt = sumInt * 10 + one.data;
        one = one.next;
      }
    }
    return sumInt;
  }


  public Node sum(Node one, Node two)
  {
    int sumInt = 0;
    int exp = 1;
    while (one != null || two != null)
    {
      if (one != null)
      {
        sumInt += one.data * exp;
        one = one.next;
      }
      if (two != null)
      {
        sumInt += two.data * exp;
        two = two.next;
      }
      exp *= 10;
    }
    Node sum = gteSumNode(sumInt);
    return sum;
  }

  @Nullable
  private Node gteSumNode(int sumInt)
  {
    Node sum = null;
    while (sumInt != 0)
    {
      int value = sumInt % 10;
      sumInt = sumInt / 10;
      if (sum == null)
      {
        sum = new Node(value);
      }
      else
      {
        sum.appendTail(value);
      }
    }
    return sum;
  }
}

package com.bladyzamosc.linkedlists;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
 * User: Z6EKI
 * Date: 04.09.2022
 */
public class SumListTest
{
  @Test
  public void testSum()
  {
    Node one = new Node(8);
    one.appendTail(5);
    one.appendTail(3);

    Node two = new Node(3);
    two.appendTail(2);
    two.appendTail(1);

    // 358 + 123 = 481

    SumList sumList = new SumList();
    Node sum = sumList.sum(one, two);

    int result = 0;
    int exp = 1;
    while (sum != null)
    {
      result += sum.data * exp;
      sum = sum.next;
      exp *= 10;
    }
    Assert.assertEquals(481, result);
  }

  @Test
  public void testSumRev()
  {
    Node one = new Node(8);
    one.appendTail(5);
    one.appendTail(3);

    Node two = new Node(3);
    two.appendTail(2);
    two.appendTail(1);

    // 853 + 321 = 1174
    SumList sumList = new SumList();
    Node sum = sumList.sumReverse(one, two);

    int result = 0;
    while (sum != null)
    {
      result = result * 10 + sum.data;
      sum = sum.next;
    }
    Assert.assertEquals(1174, result);
  }
}

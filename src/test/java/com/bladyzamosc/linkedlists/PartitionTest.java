package com.bladyzamosc.linkedlists;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
 * User: Bladyzamosc
 * Date: 04.09.2022
 */
public class PartitionTest
{
  @Test
  public void testPartitionOvercomplicated()
  {
    int x = 8;
    Node head = new Node(3);
    head.appendTail(5);
    head.appendTail(8);
    head.appendTail(5);
    head.appendTail(10);
    head.appendTail(2);
    head.appendTail(1);

    Partition partition = new Partition();
    Node result = partition.partitionOvercomplicated(head, x);

    int index = getIndexOfNumber(x, result);

    int i = 0;
    while (result != null)
    {
      if (i < index)
      {
        Assert.assertTrue(x > result.data);
      }
      else
      {
        Assert.assertFalse(x > result.data);
      }
      i++;
      result = result.next;
    }
  }

  @Test
  public void testPartition()
  {
    int x = 8;
    Node head = new Node(3);
    head.appendTail(5);
    head.appendTail(8);
    head.appendTail(5);
    head.appendTail(10);
    head.appendTail(2);
    head.appendTail(1);

    Partition partition = new Partition();

    Node result = partition.partition(head, x);

    int index = getIndexOfNumber(x, result);

    int i = 0;
    while (result != null)
    {
      if (i < index)
      {
        Assert.assertTrue(x > result.data);
      }
      else
      {
        Assert.assertFalse(x > result.data);
      }
      i++;
      result = result.next;
    }

  }

  private int getIndexOfNumber(int x, Node result)
  {
    int index = 0;
    Node help = result;
    while (help != null)
    {
      if (help.data >= x)
      {
        break;
      }
      index++;
      help = help.next;
    }
    return index;
  }
}

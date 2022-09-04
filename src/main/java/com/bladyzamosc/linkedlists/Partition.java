package com.bladyzamosc.linkedlists;

/**
 * User: Z6EKI
 * Date: 04.09.2022
 */
public class Partition
{
  public Node partitionOvercomplicated(Node node, Integer x)
  {
    Node current = node;
    Node prev = null;

    while (current != null)
    {
      if (current.data >= x && current.next != null)
      {
        Node prevRunner = current;
        Node runner = current.next;
        while (runner != null)
        {
          if (runner.data < x)
          {
            // swap
            prev.next = runner;
            prevRunner.next = current;
            Node tempRunnerNext = runner.next;
            runner.next = current.next;
            current.next = tempRunnerNext;

            prev = runner;
            current = runner.next;
            break;
          }
          else
          {
            prevRunner = runner;
            runner = runner.next;
            if (runner == null)
            {
              prev = current;
              current = current.next;
            }
          }
        }
      }
      else
      {
        prev = current;
        current = current.next;
      }
    }
    return node;
  }

  public Node partition(Node node, int x)
  {
    Node tail = node;
    Node head = node;

    while (node != null)
    {
      Node next = node.next;
      if (node.data < x)
      {
        node.next = head;
        head = node;
      }
      else
      {
        tail.next = node;
        tail = node;
      }
      node = next;
    }
    tail.next = null;
    return head;
  }
}

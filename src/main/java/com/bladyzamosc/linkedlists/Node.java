package com.bladyzamosc.linkedlists;

/**
 * User: Bladyzamosc
 * Date: 04.09.2022
 */
public class Node
{
  Node next;
  Integer data;

  public Node(Integer data)
  {
    this.data = data;
  }

  public void appendTail(int value)
  {
    Node current = this;
    while (current.next != null)
    {
      current = current.next;
    }
    current.next = new Node(value);
  }

  public Node reverse(Node node)
  {
    Node prev = null;
    Node current = node;
    Node next;

    while (current != null)
    {
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }
    node = prev;
    return node;
  }
}

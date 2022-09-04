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
}

package com.bladyzamosc.graphs;

import java.util.LinkedList;

/**
 * User: Bladyzamosc
 * Date: 04.09.2022
 */
public class RouteBetweenNodes
{
  public boolean route(Graph g, Node s, Node e)
  {
    if (s == e) return true;

    LinkedList<Node> queue = new LinkedList<>();
    queue.add(s);

    while (!queue.isEmpty()) {
      Node current = queue.removeLast();
      if (current != null) {
        for (Node child : current.getNodes()) {
          if (child.state.equals(Node.State.NOT_VISITED)) {
            if (child == e) {
              return true;
            }
            child.setState(Node.State.VISITING);
            queue.add(child);
          }
        }
        current.setState(Node.State.VISITED);
      }
    }
    return false;
  }
}

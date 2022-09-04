package com.bladyzamosc.graphs;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Bladyzamosc
 * Date: 04.09.2022
 */
public class Node
{
  enum State
  {VISITED, VISITING, NOT_VISITED}

  String name;
  State state;
  List<Node> nodes = new ArrayList<>();

  public Node(String name, Graph g)
  {
    this.name = name;
    this.state = State.NOT_VISITED;
    g.getNodes().add(this);
  }

  public void setState(State state)
  {
    this.state = state;
  }

  public List<Node> getNodes()
  {
    return nodes;
  }
}

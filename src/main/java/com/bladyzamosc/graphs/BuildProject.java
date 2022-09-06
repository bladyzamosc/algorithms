package com.bladyzamosc.graphs;

import java.util.LinkedList;
import java.util.List;

/**
 * User: Z6EKI
 * Date: 06.09.2022
 */
public class BuildProject
{
  public List<Node> computeOrder(Graph graph)
  {
    List<Node> result = new LinkedList<>();
    while (!graph.getNodes().isEmpty())
    {
      result.addAll(deductGraph(graph));
    }
    return result;
  }

  private List<Node> deductGraph(Graph graph)
  {
    List<Node> toRemove = new LinkedList<>();
    for (Node node : graph.getNodes())
    {
      List<Node> dependants = node.getNodes();
      if (!isJoint(dependants, graph.getNodes()))
      {
        toRemove.add(node);
      }
    }
    graph.getNodes().removeAll(toRemove);
    return toRemove;
  }

  private boolean isJoint(List<Node> list1, List<Node> list2)
  {
    return list1.stream().anyMatch(element -> list2.contains(element));
  }
}

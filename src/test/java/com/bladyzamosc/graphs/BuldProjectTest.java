package com.bladyzamosc.graphs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * User: Z6EKI
 * Date: 06.09.2022
 */
public class BuldProjectTest
{

  @Test
  public void testOrder()
  {
    Graph graph = new Graph();

    Node a = new Node("A", graph);
    Node b = new Node("B", graph);
    Node c = new Node("C", graph);
    Node d = new Node("D", graph);
    Node e = new Node("E", graph);
    Node f = new Node("F", graph);

    d.getNodes().add(a);
    b.getNodes().add(f);
    d.getNodes().add(b);
    a.getNodes().add(f);
    c.getNodes().add(d);

    BuildProject buildProject = new BuildProject();
    List<Node> result = buildProject.computeOrder(graph);
    Assertions.assertTrue(result.get(0) == e || result.get(0) == f);
    Assertions.assertTrue(result.get(1) == e || result.get(1) == f);
    Assertions.assertTrue(result.get(2) == a);
    Assertions.assertTrue(result.get(3) == b);
    Assertions.assertTrue(result.get(4) == d);
    Assertions.assertTrue(result.get(5) == c);
  }
}

package com.bladyzamosc.graphs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * User: Bladyzamosc
 * Date: 04.09.2022
 */
public class RouteBetweenNodesTest
{

  @Test
  public void testRoute()
  {
    RouteBetweenNodes route = new RouteBetweenNodes();

    Graph g = new Graph();
    Node s = new Node("start", g);
    Node e = new Node("end", g);

    Node m1 = new Node("m1", g);
    Node m2 = new Node("m2", g);
    Node m3 = new Node("m3", g);
    s.getNodes().add(m1);
    s.getNodes().add(m2);
    s.getNodes().add(m3);
    Node m33 = new Node("m33", g);
    m3.getNodes().add(m33);
    m3.getNodes().add(m1);

    m33.getNodes().add(e);

    boolean isRoute = route.route(g, s, e);
    Assertions.assertTrue(isRoute);
  }

  @Test
  public void testRouteFail()
  {
    RouteBetweenNodes route = new RouteBetweenNodes();

    Graph g = new Graph();
    Node s = new Node("start", g);
    Node e = new Node("end", g);

    Node m1 = new Node("m1", g);
    Node m2 = new Node("m2", g);
    Node m3 = new Node("m3", g);
    s.getNodes().add(m1);
    s.getNodes().add(m2);
    s.getNodes().add(m3);
    Node m33 = new Node("m33", g);

    m3.getNodes().add(m1);
    m33.getNodes().add(e);

    boolean isRoute = route.route(g, s, e);
    Assertions.assertFalse(isRoute);
  }
}

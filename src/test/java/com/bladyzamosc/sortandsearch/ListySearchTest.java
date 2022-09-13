package com.bladyzamosc.sortandsearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * User: Bladyzamosc
 * Date: 13.09.2022
 */
public class ListySearchTest
{
  @Test
  public void testIndex0()
  {
    Listy listy = new Listy(List.of(1, 2, 3));
    ListySearch listySearch = new ListySearch();
    Integer index = listySearch.findIndex(listy, 1);
    Assertions.assertEquals(0, index);
  }

  @Test
  public void testIndex3()
  {
    Listy listy = new Listy(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 20, 505));
    ListySearch listySearch = new ListySearch();
    Integer index = listySearch.findIndex(listy, 4);
    Assertions.assertEquals(3, index);
  }
}

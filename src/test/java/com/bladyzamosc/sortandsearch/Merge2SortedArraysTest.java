package com.bladyzamosc.sortandsearch;

import org.junit.jupiter.api.Test;

/**
 * User: Bladyzamosc
 * Date: 13.09.2022
 */
public class Merge2SortedArraysTest
{
  @Test
  public void testSort()
  {
    int[] a = new int[]{1, 2, 4, 5, 6, 8};
    int[] b = new int[]{2, 7, 8, 9, 10, 11, 12, 0, 0, 0, 0, 0, 0};

    Merge2SortedArrays merge2SortedArrays = new Merge2SortedArrays();
    int[] result = merge2SortedArrays.merge(a, b);

  }
}

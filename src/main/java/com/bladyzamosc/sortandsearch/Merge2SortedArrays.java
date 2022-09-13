package com.bladyzamosc.sortandsearch;

/**
 * User: Bladyzamosc
 * Date: 13.09.2022
 */
public class Merge2SortedArrays
{
  public int[] merge(int[] a, int[] b)
  {
    int lastA = a.length - 1;
    int lastB = b.length - a.length - 1;
    int lastIndex = b.length - 1;

    while (lastIndex >= 0)
    {
      if (lastB < 0 || a[lastA] > b[lastB])
      {
        b[lastIndex] = a[lastA];
        lastA--;
      }
      else
      {
        b[lastIndex] = b[lastB];
        lastB--;
      }
      lastIndex--;
    }

    return b;
  }
}

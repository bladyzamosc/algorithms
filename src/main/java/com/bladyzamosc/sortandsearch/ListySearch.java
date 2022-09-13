package com.bladyzamosc.sortandsearch;

/**
 * User: Bladyzamosc
 * Date: 13.09.2022
 */
public class ListySearch
{
  public Integer findIndex(Listy listy, Integer x)
  {
    int exp = 1;
    while (listy.elementAt(exp) != -1 && listy.elementAt(exp) < x)
    {
      exp *= 2;
    }

    return binarySearch(listy, x, exp / 2, exp);
  }

  private int binarySearch(Listy listy, Integer x, int from, int to)
  {
    int mid;
    while (from < to)
    {
      mid = (from + to) / 2;
      Integer middle = listy.elementAt(mid);
      if (middle > x || middle == -1)
      {
        to = mid - 1;
      }
      else if (middle < x)
      {
        from = mid + 1;
      }
      else
      {
        return mid;
      }
    }
    return -1;
  }


}

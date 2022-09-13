package com.bladyzamosc.sortandsearch;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Bladyzamosc
 * Date: 13.09.2022
 */
public class Listy
{
  List<Integer> list;

  public Listy(List<Integer> list)
  {
    this.list = new ArrayList<>(list);
  }

  public Integer elementAt(Integer index)
  {
    try
    {
      return list.get(index);
    }
    catch (Throwable t)
    {
      return -1;
    }

  }


}

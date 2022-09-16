package com.bladyzamosc.various;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Bladyzamosc
 * Date: 16.09.2022
 */
public class KNode
{
  private final int row;
  private final int col;
  Integer data;
  List<KNode> children;

  public KNode(Integer data, int row, int col)
  {
    this.data = data;
    this.children = new ArrayList<>();
    this.row = row;
    this.col = col;
  }

  public void addChild(KNode node)
  {
    this.children.add(node);
  }

  public List<KNode> getChildren()
  {
    return children;
  }

  public int getCol()
  {
    return col;
  }

  public int getRow()
  {
    return row;
  }

  public Integer getData()
  {
    return data;
  }
}

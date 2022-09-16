package com.bladyzamosc.various;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Z6EKI
 * Date: 16.09.2022
 */
public class Knight
{
  private static final int[][] phonePad = new int[][]{
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
  };

  private static final int[] movesRow = new int[]{2, 2, -2, -2, 1, 1, -1, 1};
  private static final int[] movesCol = new int[]{1, -1, 1, -1, 2, -2, 2, -2};

  public List<String> allPossibleNumbers(int i)
  {
    List<String> result = new ArrayList<>();
    for (int row = 0; row < phonePad.length; row++)
    {
      for (int col = 0; col < phonePad[0].length; col++)
      {
        startingFromPoint(row, col, result, i);
      }
    }
    return result;
  }

  private void startingFromPoint(int row, int col, List<String> result, int numberOfMoves)
  {
    KNode root = new KNode(phonePad[row][col], row, col);
    childrenForNode(root, numberOfMoves);
    printNumbers("", root, result, numberOfMoves);
  }

  private void printNumbers(String s, KNode root, List<String> result, int numberOfMoves)
  {
    String number = s + root.getData();
    if (root.getChildren().isEmpty() && number.length() == (numberOfMoves + 1))
    {
      result.add(number);
    }
    else
    {
      for (KNode child : root.getChildren())
      {
        printNumbers(number, child, result, numberOfMoves);
      }
    }
  }

  private void childrenForNode(KNode root, int numberOfMoves)
  {
    if (numberOfMoves == 0)
    {
      return;
    }
    for (int i = 0; i < movesRow.length; i++)
    {
      int[] next = checkMovePossible(root.getRow(), root.getCol(), movesRow[i], movesCol[i]);
      if (next != null)
      {
        root.addChild(new KNode(phonePad[next[0]][next[1]], next[0], next[1]));
      }
    }
    final int number = numberOfMoves - 1;

    root.getChildren().forEach(a -> childrenForNode(a, number));
  }

  private int[] checkMovePossible(int row, int col, int r, int c)
  {
    int nextRow = row + r;
    int nextCol = col + c;

    if (nextRow >= 0 && nextRow < phonePad.length && nextCol >= 0 && nextCol < phonePad[0].length)
    {
      return new int[]{nextRow, nextCol};
    }
    return null;
  }


}

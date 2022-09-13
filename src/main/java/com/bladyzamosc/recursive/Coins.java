package com.bladyzamosc.recursive;

/**
 * User: Bladyzamosc
 * Date: 11.09.2022
 */
public class Coins
{
  public int ways(int amount, int[] denoms)
  {
    return ways(amount, denoms, 0);
  }

  private int ways(int amount, int[] denoms, int index)
  {
    if (index > denoms.length - 1) return 1;
    int denomAmount = denoms[index];
    int ways = 0;
    for (int i = 0; i * denomAmount <= amount; i++)
    {
      int amountRemaining = amount - 1 * denomAmount;
      ways += ways(amountRemaining, denoms, index + 1);
    }
    return ways;
  }
}

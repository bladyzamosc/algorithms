package com.bladyzamosc.recursive;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * User: Bladyzamosc
 * Date: 11.09.2022
 */
public class CoinsTest
{
  @Test
  public void testContTest() {
    int[] denoms  = new int[] {1,2,5,10,25};
    int amount = 100;
    Coins coins = new Coins();
    Assertions.assertEquals(4040000, coins.ways(amount, denoms));
  }
}

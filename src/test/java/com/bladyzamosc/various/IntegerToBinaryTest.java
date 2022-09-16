package com.bladyzamosc.various;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * User: Bladyzamosc
 * Date: 16.09.2022
 */
public class IntegerToBinaryTest
{

  @Test
  public void numberOf1Bits()
  {
    IntegerToBinary integerToBinary = new IntegerToBinary();
    Assertions.assertEquals(0, integerToBinary.numberOfBits1(0));
    Assertions.assertEquals(1, integerToBinary.numberOfBits1(1));
    Assertions.assertEquals(1, integerToBinary.numberOfBits1(4));
    Assertions.assertEquals(1, integerToBinary.numberOfBits1(2));
    Assertions.assertEquals(2, integerToBinary.numberOfBits1(3));
    Assertions.assertEquals(3, integerToBinary.numberOfBits1(11));
  }
}

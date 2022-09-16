package com.bladyzamosc.various;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * User: Z6EKI
 * Date: 16.09.2022
 */
public class KnightTest
{

  @Test
  public void possibleNumbers() {
    Knight knight = new Knight();
    List<String> numbers = knight.allPossibleNumbers(6);
    Assertions.assertEquals(484,numbers.size());
  }

}

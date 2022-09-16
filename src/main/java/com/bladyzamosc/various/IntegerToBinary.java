package com.bladyzamosc.various;

/**
 * User: Bladyzamosc
 * Date: 16.09.2022
 */
public class IntegerToBinary
{

  public int numberOfBits1(Integer number)
  {
    int result = 0;
    while (number > 0)
    {
      if (number % 2 != 0)
      {
        result++;
      }
      number = number / 2;
    }
    return result;
  }


}

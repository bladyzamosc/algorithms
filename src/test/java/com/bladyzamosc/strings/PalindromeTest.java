package com.bladyzamosc.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * User: Bladyzamosc
 * Date: 17.09.2022
 */
public class PalindromeTest
{
  @Test
  public void testPalindrome()
  {
    Palindrome palindrome = new Palindrome();
    String result = palindrome.findPalindrome("jdfh", "fds");
    Assertions.assertEquals(result, "dfhfd");
  }
}

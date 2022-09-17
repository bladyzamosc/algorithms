package com.bladyzamosc.strings;


/**
 * User: Bladyzamsc
 * Date: 17.09.2022
 */
public class Palindrome
{
  public String findPalindrome(String a, String b)
  {
    b = reverse(b);
    String result = null;

    for (int i = 0; i < a.length(); i++)
    {
      int bj = b.indexOf(a.charAt(i));
      if (bj >= 0)
      {
        StringBuilder palindrom = new StringBuilder();
        palindrom.append(a.charAt(i));
        int ai = i + 1;
        bj = bj + 1;
        while (ai < a.length() &&
          bj < b.length() &&
          b.charAt(bj) == a.charAt(ai))
        {
          palindrom.append(a.charAt(ai));
          ai++;
          bj++;
        }

        String rev = reverse(palindrom.toString());
        if (ai < a.length())
        {
          palindrom.append(a.charAt(ai));
        }
        palindrom.append(rev);
        if (result == null || result.length() < palindrom.length())
        {
          result = palindrom.toString();
        }
      }
    }
    return result;
  }

  private String reverse(String b)
  {
    StringBuilder sb = new StringBuilder(b);
    b = sb.reverse().toString();
    return b;
  }
}

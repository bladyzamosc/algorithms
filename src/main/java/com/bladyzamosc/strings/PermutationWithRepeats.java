package com.bladyzamosc.strings;

import java.util.*;

/**
 * User: Bladyzamosc
 * Date: 10.09.2022
 */
public class PermutationWithRepeats
{
  public Set<String> permutations(String string, String prefix)
  {
    Map<String, String> memo = new HashMap<>();
    permutationsWithMemo(string, prefix, memo);
    return memo.keySet();
  }

  private void permutationsWithMemo(String string, String prefix, Map<String, String> memo)
  {
    if (string.length() == 0) {
      memo.put(prefix, prefix);
    } else {
      for (int i = 0; i < string.length(); i++) {
        String second = string.substring(0,i) + string.substring(i+1);
        permutationsWithMemo(second, prefix + string.charAt(i), memo);
      }
    }
  }
}

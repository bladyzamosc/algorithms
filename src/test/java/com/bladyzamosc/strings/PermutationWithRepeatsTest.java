package com.bladyzamosc.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

/**
 * User: Bladyzamosc
 * Date: 10.09.2022
 */
public class PermutationWithRepeatsTest
{

  @Test
  public void testWitPermutations_aab() {
    String aab = "aab";
    PermutationWithRepeats permutationWithRepeats = new PermutationWithRepeats();
    Set<String> result = permutationWithRepeats.permutations(aab, "");
    Assertions.assertEquals(3,result.size());
  }


  @Test
  public void testWitPermutations_abc() {
    String aab = "abc";
    PermutationWithRepeats permutationWithRepeats = new PermutationWithRepeats();
    Set<String> result = permutationWithRepeats.permutations(aab, "");
    Assertions.assertEquals(6,result.size());
  }
}

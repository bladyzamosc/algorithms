package com.bladyzamosc.strings

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

/**
 * User: Bladyzamosc
 * Date: 02.09.2022
 */
class PermutationTest {

    @Test
    fun testPermutationOneResult(){
        val permutation = Permutation();
        val permutations = permutation.permutation("a", "")
        Assertions.assertEquals(1, permutations.size)
    }

    @Test
    fun testPermutationVerifyNumbers(){
        val permutation = Permutation();
        val permutations = permutation.permutation("abc", "");
        Assertions.assertEquals(6, permutations.size);
    }

    @Test
    fun testPermutationCheckContent(){
        val permutation = Permutation();
        val permutations = permutation.permutation("ab", "")
        Assertions.assertTrue(permutations.contains("ab"))
        Assertions.assertTrue(permutations.contains("ba"))
    }
}
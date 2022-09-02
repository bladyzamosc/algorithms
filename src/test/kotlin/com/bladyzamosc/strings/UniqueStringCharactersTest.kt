package com.bladyzamosc.strings

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

/**
 * User: Bladyzamosc
 * Date: 02.09.2022
 */
class UniqueStringCharactersTest {

    @Test
    fun nonUnique() {
        val unique = UniqueStringCharacters();
        Assertions.assertFalse(unique.unique("abcda"))
    }

    @Test
    fun unique() {
        val unique = UniqueStringCharacters();
        Assertions.assertFalse(unique.unique("abcde"))
    }
}
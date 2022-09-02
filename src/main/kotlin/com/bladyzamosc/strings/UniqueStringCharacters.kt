package com.bladyzamosc.strings

private const val MAX_SIZE = 128

/**
 * User: Bladyzamosc
 * Date: 02.09.2022
 */
class UniqueStringCharacters {
    fun unique(string: String): Boolean {
        if (string.length > MAX_SIZE) return false
        val boolArray = BooleanArray(MAX_SIZE)
        for (i in string.indices) {
            val char = string[i].code
            if (boolArray[char]) {
                return false
            }
            boolArray[char] = true
        }
        return false;
    }
}
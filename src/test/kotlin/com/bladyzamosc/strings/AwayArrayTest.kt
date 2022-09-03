package com.bladyzamosc.strings

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

/**
 * User: Z6EKI
 * Date: 03.09.2022
 */
class AwayArrayTest {

    @Test
    fun testIsAway() {
        val away = AwayArray();
        val isAway = away.isAway("abcdef", "abc")
        Assertions.assertTrue(isAway)
    }

    @Test
    fun testIsAwaySimple() {
        val away = AwayArray();
        val isAway = away.isAway("abcdef", "bacdef")
        Assertions.assertTrue(isAway)
    }

    @Test
    fun testIsAwaySimple2() {
        val away = AwayArray();
        val isAway = away.isAway("abcef", "abcfe")
        Assertions.assertTrue(isAway)
    }

    @Test
    fun testIsAwayNeg1() {
        val away = AwayArray();
        val isAway = away.isAway("abcef", "abcf")
        Assertions.assertFalse(isAway)
    }

    @Test
    fun testIsAwayNeg2() {
        val away = AwayArray();
        val isAway = away.isAway("abcef", "abcdf")
        Assertions.assertFalse(isAway)
    }
}
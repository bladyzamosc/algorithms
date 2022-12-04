package com.bladyzamosc.bit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * User: Z6EKI
 * Date: 04.12.2022
 */
public class BitUtilTest
{
    @Test
    public void testPower2() {
        Assertions.assertTrue(BitUtil.isPowerOfTwo(16));
        Assertions.assertFalse(BitUtil.isPowerOfTwo(6));
    }

    @Test
    public void testEvenOrOdd() {
        Assertions.assertTrue(BitUtil.isEven(16));
        Assertions.assertFalse(BitUtil.isEven(5));
    }

    @Test
    public void testSubtract() {
        Assertions.assertEquals("10000",BitUtil.subtractBinaryStrings("110101", "100101"));
    }

    @Test
    public void testNoBitsSet() {
        Assertions.assertEquals(2,BitUtil.noBitset("001001"));
        Assertions.assertEquals(0,BitUtil.noBitset("00000"));
        Assertions.assertEquals(5,BitUtil.noBitset("11111"));
        Assertions.assertEquals(3,BitUtil.noBitset("10101"));
    }
}

package com.bladyzamosc.bit;

/**
 * User: Z6EKI
 * Date: 04.12.2022
 */
public class BitUtil
{
    public static boolean isPowerOfTwo(int value) {
        return (value & -value) == value;
    }

    public static boolean isEven(int value)
    {
        return (value & 1) == 0;
    }

    public static String subtractBinaryStrings(String a, String b)
    {
        return Integer.toBinaryString(Integer.parseInt(a, 2) - Integer.parseInt(b, 2));
    }

    public static int noBitset(String s)
    {

        Integer value = Integer.parseInt(s,2);
        System.out.println("---------------" + s + "   " + value);
        int count = 0;

        while (value != 0) {
            System.out.println(value);
            value &= (value -1);
            count++;
        }
        return count;
    }
}

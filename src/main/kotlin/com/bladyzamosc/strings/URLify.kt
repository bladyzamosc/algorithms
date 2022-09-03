package com.bladyzamosc.strings

private const val replacement = "%20"

/**
 * User: Z6EKI
 * Date: 03.09.2022
 */
class URLify {
    fun ulrify(string: String, len: Int): String {
        var result = arrayOfNulls<String>(len)
        var maxIndex = len - 1;
        for (i in 0..maxIndex) {
            if (string[i] == ' ')
                result[i] = replacement else
                result[i] = string[i].toString()
        }
        return result.joinToString(separator = "");
    }
}
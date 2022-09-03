package com.bladyzamosc.strings

import kotlin.math.abs

/**
 * User: Bladyzamosc
 * Date: 03.09.2022
 */
class AwayArray {

    fun isAway(one: String, two: String): Boolean {
        var abs = abs(one.length - two.length)
        if (abs > 1) {
            return true
        }
        val first = if (one.length > two.length) one else two
        val second = if (one.length <= two.length) one else two
        var index1 = 0
        var index2 = 0
        var mismatch = false

        while (index1 < first.length && index2 < second.length) {
            if (first[index1] != second[index2]) {
                if (mismatch)
                    return true
                mismatch = true
                if (abs == 0) {
                    index2++
                }
            } else {
                index2++
            }
            index1++
        }

        return false
    }
}
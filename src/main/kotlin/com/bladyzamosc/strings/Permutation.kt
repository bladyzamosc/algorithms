package com.bladyzamosc.strings

/**
 * User: Bladyzamosc
 * Date: 01.09.2022
 */
class Permutation {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val permutation = Permutation()
            println(permutation.permutation("abcd", ""))
        }
    }

    fun permutation(string: String, prefix: String): ArrayList<String> {
        val result = ArrayList<String>()
        if (string.isEmpty()) {
            result.add(prefix)
        } else {
            for (i in string.indices) {
                val rem = string.substring(0, i) + string.substring(i + 1)
                result.addAll(this.permutation(rem, prefix + string[i].toString()))
            }
        }
        return result
    }
}
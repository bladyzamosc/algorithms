package com.bladyzamosc.strings

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

/**
 * User: Z6EKI
 * Date: 03.09.2022
 */
class URLifyTest {

    @Test
    fun testURLify(){
        val urLify = URLify();
        val abc = "abc"
        Assertions.assertEquals(abc, urLify.ulrify(abc, abc.length ));
        val aspacebc = "a bc"
        Assertions.assertEquals("a%20bc", urLify.ulrify(aspacebc, aspacebc.length));
    }
}
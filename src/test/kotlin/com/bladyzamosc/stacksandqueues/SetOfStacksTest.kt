package com.bladyzamosc.stacksandqueues

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


/**
 * User: Bladyzamosc
 * Date: 04.09.2022
 */
class SetOfStacksTest {

    @Test
    fun test2Stacks() {
        val capacity = 5
        val max = 8
        val setOfStack = SetOfStacks(capacity);

        for (i in 1..max) {
            setOfStack.push(i)
        }

        Assertions.assertEquals(max, setOfStack.peek())
        Assertions.assertEquals(2, setOfStack.noSubStacks())
        Assertions.assertEquals(8, setOfStack.size())
        Assertions.assertEquals(max, setOfStack.pop())
        Assertions.assertEquals(7, setOfStack.size())
    }

}
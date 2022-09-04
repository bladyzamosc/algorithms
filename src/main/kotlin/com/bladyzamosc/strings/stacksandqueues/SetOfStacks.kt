package com.bladyzamosc.strings.stacksandqueues

import java.util.*

/**
 * User: Bladyzamosc
 * Date: 04.09.2022
 */
class SetOfStacks(private var capacity: Int) {

    private var stacks: MutableSet<Stack<Int>> = mutableSetOf()

    fun push(i: Int) {
        if (stacks.isEmpty()) {
            stacks.add(Stack())
        }
        val overflow = stacks.last().size == capacity
        if (overflow) {
            stacks.add(Stack())
        }
        stacks.last().push(i)
    }

    fun peek(): Int {
        return stacks.last().peek()
    }

    fun noSubStacks(): Int {
        return stacks.size
    }

    fun size(): Int {
        return stacks.sumOf { a -> a.size }
    }

    fun pop(): Int {
        val result = stacks.last().pop()
        if (stacks.last().size == 0) {
            stacks.remove(stacks.last())
        }
        return result
    }
}
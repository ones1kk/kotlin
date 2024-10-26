package org.sample.day04

data class Money(
    val amount: Long
) {

    operator fun plus(another: Money): Money {
        return Money(amount + another.amount)
    }
}
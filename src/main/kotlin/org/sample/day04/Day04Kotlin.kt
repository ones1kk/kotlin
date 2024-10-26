package org.sample.day04

import org.sample.day04.Day04Java.JavaMoney

fun main() {
    val money1 = JavaMoney(2_000)
    val money2 = JavaMoney(1_000)
    val money3 = money2

    // 객체를 비교할 때 비교 연산자 사용 가능
    // 자동으로 compareTo 를 호출함
    if (money1 > money2) {
        println("money1이 Money2보다 금액이 큽니다")
    }

    println(money1 == money2)
    println(money1 === money2)
    println(money2 == money3)
    println(money2 === money3)

    if (fun1() || fun2()) {
        println("본문")
    }

    if (fun2() && fun1()) {
        println("본문")
    }

    val money4 = Money(1_000)
    val money5 = Money(2_000)

    println(money4 + money5)


}

fun fun1(): Boolean {
    println("fun1")
    return true
}

fun fun2(): Boolean {
    println("fun2")
    return false
}
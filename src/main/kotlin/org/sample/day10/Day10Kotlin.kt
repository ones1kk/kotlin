package org.sample.day10

fun main() {
    Derived(100)

    // 상속하는 클래스에서 프로퍼티를 상속하기 위해선 open 키워드가 필요하다.
    // 기본적으로 final 키워드가 붙어 있음
}

open class Base(
    open val number: Int = 100
) {

    init {
        println("base")
        println(number)
    }
}

class Derived(
    override val number: Int
) : Base(number) {

    init {
        println("derived")
    }
}
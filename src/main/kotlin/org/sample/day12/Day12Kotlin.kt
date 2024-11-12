package org.sample.day12


fun main() {

    println(Singleton.a)
    Singleton.a++
    println(Singleton.a)

    // 익명 클래스
    moveSomething(object : Moveable {
        override fun move() {
            println("move")
        }

        override fun fly() {
            println("fly")
        }
    })

}


class Person(
    var name: String,
    var age: Int,
) {

    companion object Factory : Log {

        private const val MIN_AGE = 1 // const: 진짜 상수에 할당함 -> compile 시점에 값이 할당됨

        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)

        }

        override fun log() {
            println("log")
        }

    }

}

interface Log {

    fun log()

}

object Singleton {
    var a: Int = 0
}

private fun moveSomething(moveable: Moveable) {
    moveable.move()
    moveable.fly()
}
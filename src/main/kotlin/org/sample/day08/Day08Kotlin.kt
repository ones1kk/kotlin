package org.sample.day08

fun main() {

    // default parameter
    repeat("Hello World")

    // named argument
    // java method 는 불가능
    repeat("Hello World", useNewLine = false)
    printNameAndGender(name = "Hello", gender = "world")

    // 가변인자
    printAll("A", "B", "C")
    // spread operator
    printAll(*arrayOf("A", "B", "C"))
}

fun max(a: Int, b: Int) = if (a > b) a else b

fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for (i in 0 until num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

fun printNameAndGender(name: String, gender: String) {
    println(name)
    println(gender)
}

fun printAll(vararg strings: String?) {
    for (string in strings) {
        println(string)
    }
}
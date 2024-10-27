package org.sample.day07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun main() {

    // 1.try catch finally

    // 2. Checked Exception & Unchecked Exception
    // Kotlin 에서는 Checked 와 Unchecked Exception 을 구분하지 않는다.
    readFile()

    // 3. try-with-resources 가 사라지고 내장 함수를 사용함
    readFileV2("")

    /**
     * try-catch-finally: 문법적으로 완전 동일하지만 Expression 으로 처리 가능
     * Kotlin 에서는 모든 예외가 Unchecked Exception 이다.
     * Kotlin 에서는 try-with-resources 구문이 없다. 대신 언어적 특징을 활용해 close 를 호출해준다
     */
}

private fun parseIntOrThrow(input: String): Int {
    try {
        return input.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException()
    }
}

private fun parseIntOrThrowV2(input: String): Int? {
    return try {
        input.toInt()
    } catch (e: java.lang.NumberFormatException) {
        null
    }
}

fun readFile() {
    val currentFile = File(".")
    val file = File(currentFile.absolutePath + "/a.txt")
    val reader = BufferedReader(FileReader(file))
    println(reader.readLine())
    reader.close()
}

fun readFileV2(path: String?) {
    BufferedReader(FileReader(path)).use { reader ->
        println(reader.readLine())
    }
}


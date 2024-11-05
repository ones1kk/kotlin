package org.sample.day11

import java.io.File

fun main() {
    val car = Car("London", "Germany", 11)

    println(car.name)
    println(car.price)
    
}

fun isDirectoryPath(path: String): Boolean {
    return path.endsWith(File.separator)
}
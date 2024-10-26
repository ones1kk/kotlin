package org.sample.day05

fun validateScoreIsNotNegative(score: Int) {
    if (score < 0) {
        throw IllegalArgumentException("The $score  should be a positive number");
    }
}

fun validateScoreIsNotNegativeNew(score: Int) {
    if (score !in 0..100) {
        throw IllegalArgumentException("The $score should be in range of 0 to 100");
    }
}

fun getPassOrFail(score: Int): String {
    // expression
    // 하나의 값으로 도출되는 문장
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}

fun getGrade(score: Int): String {
    return if (score >= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else {
        "C"
    }
}

fun getGradeWithSwitch(score: Int): String {
    return when (score / 10) {
        9 -> "A"
        8 -> "B"
        else -> "D"
    }
}

fun getGradeWithSwitchNew(score: Int): String {
    return when (score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        else -> "D"
    }
}

fun startWithA(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A");
        else ->
            false
    }
}

fun judgeNumber(number: Int) {
    when (number) {
        1, 0, -1 -> println("judgeNumber")
        else -> println("nope")
    }
}

fun judgeNumber2(number: Int) {
    when {
        number == 0 -> println("0")
        number % 2 == 0 -> println("짝수")
        else -> println("홀수")
    }
}



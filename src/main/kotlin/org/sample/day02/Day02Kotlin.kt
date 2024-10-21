package org.sample.day02

import org.sample.day01.Person

fun main() {

    // Safe Call: null 이 아니면 실행, null 이면 실행하지 않는다
    val str1: String? = null;
    // str1.length  // 불가능
    str1?.length;  // 가능
    println(str1?.length);

    val str2: String? = "ABC";
    str2?.length ?: 0;
    println(str2?.length ?: 0);

    println(startsWithA7("ABC"));

    val kotlin = Language("KOTLIN");
    // startsWithA(kotlin.name); // @Nullable 에 의해 컴파일 에러 발생
     startsWithA(kotlin.name); // @NotNul 에 의해 정상 실행 가능

    // 플랫폼 타입 -> @Nullable, @NotNul 와 같은 어노테이션 없는 자바 코드 타입
    // 코틀린 null 관련 정보를 알 수 없기 때문에 runtime 시 NPE 발생 가

}

fun startsWithA(str: String): Boolean {
    return str.startsWith("A");
}

fun startsWithA1(str: String?): Boolean {
    if (str == null) {
        throw IllegalArgumentException();
    }
    return str.startsWith("A");
}

fun startsWithA2(str: String?): Boolean? {
    if (str == null) {
        return null;
    }
    return str.startsWith("A");
}

fun startsWithA3(str: String?): Boolean {
    if (str == null) {
        return false;
    }
    return str.startsWith("A");
}

fun startsWithA4(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException();
}

fun startsWithA5(str: String?): Boolean? {
    return str?.startsWith("A");
}

fun startsWithA6(str: String?): Boolean {
    return str?.startsWith("A") ?: false;
}

/**
 * null 아님 단언
 * 하지만 null 이 들어오면 NPE 발생하기 때문에 사용하는데 유의해야함
 */
fun startsWithA7(str: String?): Boolean {
    return str!!.startsWith("A");
}
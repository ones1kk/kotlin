package org.sample.day01

fun main() {
    // 컴파일러가 타입 자동 추론
    var number1 = 10L; // 가변변수(variable)
    val number2 = 10L; // 불변변수(val)

    // 타입 지정
    var number3: Long = 10L;
    val number4: Long = 10L;

    var number5: Long;
    // println(number5) --> compile error

    val number6: Long;
    // println(number6) --> compile error
    number6 = 10L; // 초기화되지 않은 변수에 한해서 최초 한 번은 값 할당 가능

    /**
     * 코틀린 공식 문서
     *
     * some types can have a special internal representation
     * - for example, numbers, characters and booleans - can be represented as primitive values at runtime
     * - but to the user they look lie ordinary class
     *
     * -> 소스 코드 상에서는 전부 reference type 으로 표현되지만
     * 컴파일러가 내부적으로 연산이 필요한 경우에는 primitive type 치환하여 계산함.
     *
     * 즉 프로그래머가 boxing / unboxing 을 고려하지 않아도 됨
     */

    // nullable
    var number7 = 1_000L;
    // number7 = null; 컴파일 에러 -> 모든 변수에는 null을 할당할 수 없음

    var number8: Long? = 1_000L;
    number8 = null;

    // 객체 인스턴스화
    var person = Person("KOTLIN");

}
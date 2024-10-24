package org.sample.day03

fun main() {
    // Java 에서는 암시적으로 형변환이 발생하지만
    // Kotlin 에서는 명시적으로 형변환이 일어난다.
    val number1 = 3;
    val number2: Long = number1.toLong();

    val number3: Int? = 3;
    // val number4: Long = number3.toLong(); //  컴파일 에러
    val number4: Long? = number3?.toLong();
    val number5: Long = number3?.toLong() ?: 0L;

    printAgeIfPersonAdvanced(null);
    printAgeIfPersonAdvanced(Person("Kotlin", 2));

    /**
     * Any
     * Java 의 Object 역할(모든 객체의 최상위 타입)
     * 모든 primitive type 의 최상위 타입
     * Any 자체로는 nul 포함 불가능 -> Any? 로 표현
     * Any 에 equals, hashCode, toString 존재
     */

    /**
     * Unit
     * Java 의 void 와 동일한 역할
     * void 와 다르게 그 자체로 타입 인자로 사용 가능
     * 함수형 프로그래밍 -> 단 하나의 인스턴스만 갖는 타입을 의미
     * 즉, 실제 존재하는 타입이라는 것을 의미
     */

    /**
     * Nothing
     * 함수가 정상적으로 끝나지 않았다는 사실을 표현하는 역할
     * 무조건 예외를 반환하는 함수 / 무한 루프 함수 등0
     */

    /************************************************************************************************/

    val kotlin = Person("Kotlin", 3);
    println("이름: ${kotlin.name}, 나이: ${kotlin.age}");

    val trimIndent = """
        ABC
        ${kotlin.name}
        EFG
    """.trimIndent();

    val str = "ABC";
    println(str[0]);
    println(str[2]);
}

fun printAgeIfPerson(obj: Any) {
    if (obj is Person) {
//    if (obj !is Person) { // is 의 부정형
        val person = obj as Person;
        // val person = obj // 스마트 캐스트 as 생략 가능
        println(person.age)
    }
}

fun printAgeIfPersonAdvanced(obj: Any?) {
    val person = obj as? Person;
    println(person?.age);
}
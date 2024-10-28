package org.sample.day09

fun main() {
    val person = KotlinPerson("kotlin", 100)
    println(person.name)
    person.age = 20

    println(person.age)

    // 자바 객체도 접근가능
    val javaPerson = JavaPerson("java", 100)
    println(javaPerson.name)
    javaPerson.age = 20

    println(javaPerson.age)

    // 코틀린에서는 부생성자보다 default 생성자를 권장
    // Converting 과 같은 경우 부생성자를 사용할 수 있지만 그보다는 정적 팩토리 메소드를 추천
}

class KotlinPerson(
    name: String,
    var age: Int
) {

    var name = name
        set(value) {
            field = value.uppercase()
        }

    // backing field: 무한루프를 방지하기 위해 자기 자신을 가리키는 예약어
//    val name = name
//        get() = field.uppercase()

    fun getUppercaseName(): String {
        return this.name.uppercase();
    }

    val uppercaseName: String
        get() = this.name.uppercase();

    // 부생성자
    // secondary constructor
    constructor(name: String) : this(name, 1) {
        println("첫번째 부생성자")
    }

    constructor() : this("kotlin") {
        println("두번째 부생성자")
    }

    init {
        if (age <= 0) {
            throw IllegalArgumentException("Age must be greater than 0")
        }
        println("초기화 블록")
    }

    fun isAdult(): Boolean {
        return this.age >= 20
    }

    // 위 isAdult 함수대신 프로퍼티로도 만들 수 있다.
    // custom getter
    val isAdult: Boolean
        get() = this.age >= 20

    // -> 객체의 속성이라면 custom getter 그렇지 않다면 함수
}
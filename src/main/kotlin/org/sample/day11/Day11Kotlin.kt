package org.sample.day11


class Cat private constructor()

class Car(
    internal val name: String, // internal 같은 모듈에서만 볼 수 있음
    private val owner: String,
    _price: Int,
) {
    var price = _price
        private set


}
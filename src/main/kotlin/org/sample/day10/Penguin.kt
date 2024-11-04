package org.sample.day10

class Penguin(
    species: String

) : Animal(species, 2), Flyable, Swimable {

    private val wingCount: Int = 2;

    override fun move() {
        println("penguin")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act() {
        super<Flyable>.act()
        super<Swimable>.act()
    }

    override val swimAbility: Int
        get() = 3

}
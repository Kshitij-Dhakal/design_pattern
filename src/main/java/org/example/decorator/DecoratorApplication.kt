package org.example.decorator

fun main() {
    val beverage: Beverage = Milk(Espresso())
    println(beverage.description)
    println(beverage.cost)
}

package org.example.factory.factorymethod

import java.util.*

abstract class Pizza(private val type: String) {
    private fun type() = type.lowercase(Locale.getDefault())

    fun prepare() {
        println("Preparing ${type()} pizza")
    }

    fun bake() {
        println("Baking ${type()} pizza")
    }

    fun cut() {
        println("Cutting ${type()} pizza")
    }

    fun box() {
        println("Boxing ${type()} pizza")
    }
}

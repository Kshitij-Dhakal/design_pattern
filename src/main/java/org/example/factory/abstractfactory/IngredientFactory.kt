package org.example.factory.abstractfactory

interface IngredientFactory {
    fun createDough(): Dough
    fun createSauce(): Sauce
    fun createCheese(): Cheese
    fun createVeggies(): List<Veggies>
    fun createPepperoni(): Pepperoni
    fun createClam(): Clam
}

class Dough()
class Sauce()
class Cheese()
class Veggies()
class Pepperoni()
class Clam()

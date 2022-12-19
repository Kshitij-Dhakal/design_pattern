package org.example.factory.factorymethod

abstract class PizzaStore {
    fun orderPizza(type: String) {
        val pizza = createPizza(type)
        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()
    }

    abstract fun createPizza(type: String): Pizza
}

fun main() {
    val pizzaStore = NYPizzaStore()
    pizzaStore.orderPizza("Cheese")
    pizzaStore.orderPizza("Clam")
}

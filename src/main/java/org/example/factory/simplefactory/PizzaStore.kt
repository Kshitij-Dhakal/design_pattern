package org.example.factory.simplefactory

class PizzaStore(private val factory: SimplePizzaFactory) {
    fun orderPizza(type: String) {
        val pizza = factory.createPizza(type)
        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()
    }
}

fun main() {
    val pizzaStore = PizzaStore(SimplePizzaFactory())
    pizzaStore.orderPizza("Cheese")
    pizzaStore.orderPizza("Clam")
}

package org.example.factory.simplefactory

import java.util.*

class SimplePizzaFactory {
    fun createPizza(type: String): Pizza {
        return if (type.lowercase(Locale.getDefault()) == "cheese") {
            CheesePizza()
        } else if (type.lowercase(Locale.getDefault()) == "clam") {
            ClamPizza()
        } else if (type.lowercase(Locale.getDefault()) == "pepperoni") {
            PepperoniPizza()
        } else if (type.lowercase(Locale.getDefault()) == "veggie") {
            VeggiePizza()
        } else {
            throw RuntimeException("Invalid pizza type")
        }
    }
}

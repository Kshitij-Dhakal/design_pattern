package org.example.factory.factorymethod

import java.util.*

class NYPizzaStore : PizzaStore() {
    override fun createPizza(type: String): Pizza {
        if (type.lowercase(Locale.getDefault()) == "cheese") {
            return NYCheesePizza()
        }
        if (type.lowercase(Locale.getDefault()) == "clam") {
            return NYClamPizza()
        }
        if (type.lowercase(Locale.getDefault()) == "pepperoni") {
            return NYPepperoniPizza()
        }
        if (type.lowercase(Locale.getDefault()) == "veggie") {
            return NYVeggiePizza()
        }
        throw RuntimeException("Invalid pizza type")
    }
}

class NYCheesePizza : Pizza("New York Cheese") {
}

class NYClamPizza : Pizza("New York Clam") {
}

class NYPepperoniPizza : Pizza("New York Pepperoni") {
}

class NYVeggiePizza : Pizza("New York Veggie") {
}

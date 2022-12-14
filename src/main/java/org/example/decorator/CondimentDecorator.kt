package org.example.decorator

abstract class CondimentDecorator protected constructor(
    private val beverage: Beverage,
    description: String,
    cost: Double
) : Beverage(description, cost) {
    override val description: String
        get() = beverage.description + ", " + super.description
    override val cost: Double
        get() = beverage.cost + super.cost
}

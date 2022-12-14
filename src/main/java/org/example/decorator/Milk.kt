package org.example.decorator

class Milk(beverage: Beverage) : CondimentDecorator(beverage, "Milk", 0.20)

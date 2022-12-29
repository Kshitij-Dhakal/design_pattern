package org.example.strategy

fun main() {
    val duck = MallardDuck()
    duck.performQuack()
    duck.performFly()

    val modelDuck= ModelDuck()
    modelDuck.performFly()
    modelDuck.flyBehavior = FlyRocketPowered()
    modelDuck.performFly()
}

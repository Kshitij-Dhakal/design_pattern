package org.example.strategy

abstract class Duck {
    lateinit var flyBehavior: FlyBehavior
    lateinit var quackBehavior: QuackBehavior

    abstract fun display()

    fun performQuack() {
        quackBehavior.quack()
    }

    fun performFly() {
        flyBehavior.fly()
    }

    fun performSwim() {
        println("All ducks swim. Even decoys")
    }
}

class MallardDuck() : Duck() {
    init {
        this.quackBehavior = Quack()
        this.flyBehavior = FlyWithWings()
    }

    override fun display() {
        println("I'm mallard duck")
    }
}

class ModelDuck() : Duck() {
    init {
        this.quackBehavior = Quack()
        this.flyBehavior = FlyNoWay()
    }

    override fun display() {
        println("I'm model duck")
    }
}

package org.example.strategy

interface QuackBehavior {
    fun quack()
}

class Quack : QuackBehavior {
    override fun quack() {
        println("Quack")
    }
}

class MuteQuack : QuackBehavior {
    override fun quack() {
        println("<< Silence >>")
    }
}

class Squeak : QuackBehavior {
    override fun quack() {
        println("Squeak")
    }
}

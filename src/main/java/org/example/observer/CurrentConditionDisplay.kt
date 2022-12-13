package org.example.observer

class CurrentConditionDisplay(private val weatherData: WeatherData) : Observer, DisplayElement {
    init {
        weatherData.registerObserver(this)
    }

    override fun update() {
        display()
    }

    override fun display() {
        println("Current Condition : $weatherData")
    }
}

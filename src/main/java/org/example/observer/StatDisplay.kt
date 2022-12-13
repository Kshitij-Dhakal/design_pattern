package org.example.observer

class StatDisplay(private val weatherData: WeatherData) : Observer, DisplayElement {
    init {
        weatherData.registerObserver(this)
    }

    override fun update() {
        display()
    }

    override fun display() {
        println("Stat : $weatherData")
    }
}

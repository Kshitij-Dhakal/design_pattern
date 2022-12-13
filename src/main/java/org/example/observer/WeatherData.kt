package org.example.observer

class WeatherData : Subject {
    private val observers: MutableList<Observer> = ArrayList()
    private var temperature = 0
    private var humidity = 0
    private var pressure = 0

    override fun registerObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyObservers() {
        for (observer in observers) {
            observer.update()
        }
    }

    fun updateData(temperature: Int, humidity: Int, pressure: Int) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        notifyObservers()
    }

    override fun toString(): String {
        return "WeatherData(temperature=$temperature, humidity=$humidity, pressure=$pressure)"
    }
}

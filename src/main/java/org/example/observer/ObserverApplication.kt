package org.example.observer

fun main() {
    var subject = WeatherData()
    CurrentConditionDisplay(subject)
    StatDisplay(subject)

    println("Updating weather data...")
    subject.updateData(5, 5, 5)

    println("Updating weather data...")
    subject.updateData(6, 6, 6)
}

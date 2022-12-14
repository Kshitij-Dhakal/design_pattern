package org.example.observer

import java.util.concurrent.Flow
import java.util.concurrent.Flow.Subscriber

class StatDisplay : Subscriber<WeatherData>, DisplayElement {
    private var subscription: Flow.Subscription? = null
    private lateinit var weatherData: WeatherData

    override fun display() {
        println("Stat : $weatherData")
    }

    override fun onSubscribe(subscription: Flow.Subscription?) {
        this.subscription = subscription
        subscription?.request(1)
    }

    override fun onError(throwable: Throwable?) {
        //do nothing
    }

    override fun onComplete() {
        //do nothing
    }

    override fun onNext(item: WeatherData?) {
        this.weatherData = item!!
        subscription?.request(1)
        display()
    }
}

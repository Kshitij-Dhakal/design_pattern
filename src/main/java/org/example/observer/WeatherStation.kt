package org.example.observer

import java.util.concurrent.Executor
import java.util.concurrent.Executors

fun main() {
    run { executor ->
        val publisher = WeatherDataPublisher(executor, 5)

        publisher.subscribe(StatDisplay())
        publisher.submit(WeatherData(5f, 5f, 5f))

        publisher.subscribe(CurrentConditionDisplay())
        publisher.submit(WeatherData(6F, 6F, 6F))
    }
}

private fun run(runner: (Executor) -> Unit) {
    val executor = Executors.newSingleThreadExecutor()
    runner(executor)
    executor.shutdown()
}

package org.example.observer

import java.util.concurrent.Executor
import java.util.concurrent.SubmissionPublisher

class WeatherDataPublisher(executor: Executor, maxBufferCapacity: Int) :
    SubmissionPublisher<WeatherData>(executor, maxBufferCapacity)

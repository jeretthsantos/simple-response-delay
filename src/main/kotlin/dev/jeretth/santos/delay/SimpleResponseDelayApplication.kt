package dev.jeretth.santos.delay

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SimpleResponseDelayApplication

fun main(args: Array<String>) {
	runApplication<SimpleResponseDelayApplication>(*args)
}

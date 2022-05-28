package dev.jeretth.santos.delay.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

interface DelayController {

    fun delay(millis: Long)

}

@RestController
internal class DefaultDelayController : DelayController {

    @GetMapping("/delay")
    override fun delay(@RequestParam millis: Long) = Thread.sleep(millis)

}
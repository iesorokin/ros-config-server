package com.anti.mrg.rosconfigserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RosConfigServerApplication

fun main(args: Array<String>) {
    runApplication<RosConfigServerApplication>(*args)
}

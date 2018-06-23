package kr.replay.demoInit

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoInitApplication

fun main(args: Array<String>) {
    runApplication<DemoInitApplication>(*args)
}

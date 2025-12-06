package at.tieber.werwolf_web

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WerwolfWebApplication

fun main(args: Array<String>) {
	runApplication<WerwolfWebApplication>(*args)
}

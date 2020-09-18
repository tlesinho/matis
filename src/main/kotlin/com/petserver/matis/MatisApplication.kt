package com.petserver.matis

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MatisApplication

fun main(args: Array<String>) {
	runApplication<MatisApplication>(*args)
}

package com.example.Facture

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FactureApplication

fun main(args: Array<String>) {
	runApplication<FactureApplication>(*args)
}

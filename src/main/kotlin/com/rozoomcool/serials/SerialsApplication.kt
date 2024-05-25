package com.rozoomcool.serials

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories
import org.springframework.web.reactive.config.EnableWebFlux

@EnableWebFlux
@SpringBootApplication
@EnableR2dbcRepositories
class SerialsApplication

fun main(args: Array<String>) {
	runApplication<SerialsApplication>(*args)
}

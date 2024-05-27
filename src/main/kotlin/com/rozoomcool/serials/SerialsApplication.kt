package com.rozoomcool.serials

//import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories
import com.mongodb.reactivestreams.client.MongoClient
import com.mongodb.reactivestreams.client.MongoClients
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories
import org.springframework.web.reactive.config.EnableWebFlux


@EnableWebFlux
@SpringBootApplication
@EnableReactiveMongoRepositories
//@EnableR2dbcRepositories
class SerialsApplication

fun main(args: Array<String>) {
	runApplication<SerialsApplication>(*args)
}

@Bean
fun mongoClient(): MongoClient {
	return MongoClients.create()
}

private fun getDatabaseName(): String {
	return "serialdb"
}

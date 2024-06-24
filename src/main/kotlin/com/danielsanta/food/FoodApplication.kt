package com.danielsanta.food

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories

@EnableMongoRepositories
@SpringBootApplication
class FoodApplication

fun main(args: Array<String>) {
    runApplication<FoodApplication>(*args)
}

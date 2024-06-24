package com.danielsanta.food.model.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.math.BigDecimal

enum class FoodType {
    HEALTHY, TASTY, CHEAP, EXPENSIVE
}

@Document(collection = "foods")
data class FoodEntity(
    @Id
    val id: String,
    val name: String,
    val price: BigDecimal,
    val type: FoodType
)

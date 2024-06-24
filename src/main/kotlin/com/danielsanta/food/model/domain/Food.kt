package com.danielsanta.food.model.domain

import com.danielsanta.food.model.entity.FoodType
import java.math.BigDecimal

data class Food(
    val id: String,
    val name: String,
    val price: BigDecimal,
    val type: FoodType
)
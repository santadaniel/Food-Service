package com.danielsanta.food.model.response

import com.danielsanta.food.model.entity.FoodType
import java.math.BigDecimal

data class FoodResponse(
    val name: String,
    val price: BigDecimal,
    val type: FoodType
)
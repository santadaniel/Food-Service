package com.danielsanta.food.model.mapper

import com.danielsanta.food.model.domain.Food
import com.danielsanta.food.model.entity.FoodEntity
import com.danielsanta.food.model.response.FoodResponse

object FoodMapper {
    fun FoodEntity.toDomain() = Food(id, name, price, type)
    fun Food.toResponse() = FoodResponse(name, price, type)
}
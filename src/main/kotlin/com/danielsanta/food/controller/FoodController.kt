package com.danielsanta.food.controller

import com.danielsanta.food.model.mapper.FoodMapper.toResponse
import com.danielsanta.food.model.response.FoodResponse
import com.danielsanta.food.service.FoodService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class FoodController(private val foodService: FoodService) {
    @GetMapping("/foods")
    fun getFoods(): List<FoodResponse> {
        return foodService.getFoods().map { it.toResponse() }
    }
}

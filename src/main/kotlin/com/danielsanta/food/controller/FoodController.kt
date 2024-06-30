package com.danielsanta.food.controller

import com.danielsanta.food.model.mapper.FoodMapper.toResponse
import com.danielsanta.food.service.FoodService
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@CrossOrigin(origins = arrayOf("http://localhost:3000"))
class FoodController(private val foodService: FoodService) {
    @GetMapping("/foods")
    fun getFoods() = foodService.getFoods().map { it.toResponse() }
}

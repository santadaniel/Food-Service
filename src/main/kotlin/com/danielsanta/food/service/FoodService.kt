package com.danielsanta.food.service

import com.danielsanta.food.model.domain.Food
import com.danielsanta.food.model.mapper.FoodMapper.toDomain
import com.danielsanta.food.repository.FoodRepository
import org.springframework.stereotype.Service

@Service
class FoodService(private val foodRepository: FoodRepository) {
    fun getFoods(): List<Food> {
        return foodRepository.findAll().map { it.toDomain() }
    }
}
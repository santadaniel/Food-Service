package com.danielsanta.food.repository

import com.danielsanta.food.model.entity.FoodEntity
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface FoodRepository : MongoRepository<FoodEntity, String>

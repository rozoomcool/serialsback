package com.rozoomcool.serials.repository

import com.rozoomcool.serials.entity.Serial
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface SerialRepository : ReactiveCrudRepository<Serial, String> {
}
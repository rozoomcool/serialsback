package com.rozoomcool.serials.repository

import com.rozoomcool.serials.entity.Serial
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface SerialRepository : ReactiveMongoRepository<Serial, String> {
}
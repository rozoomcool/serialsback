package com.rozoomcool.serials.repository

import com.rozoomcool.serials.entity.Season
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface SeasonRepository : ReactiveMongoRepository<Season, String> {
}
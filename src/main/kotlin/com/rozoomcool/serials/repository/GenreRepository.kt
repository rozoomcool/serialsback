package com.rozoomcool.serials.repository

import com.rozoomcool.serials.entity.Genre
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface GenreRepository : ReactiveMongoRepository<Genre, String> {
}
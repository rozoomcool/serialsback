package com.rozoomcool.serials.repository

import com.rozoomcool.serials.entity.Tag
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface TagRepository : ReactiveMongoRepository<Tag, String> {
}
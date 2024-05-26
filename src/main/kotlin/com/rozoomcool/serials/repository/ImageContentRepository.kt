package com.rozoomcool.serials.repository

import com.rozoomcool.serials.entity.ImageContent
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ImageContentRepository : ReactiveMongoRepository<ImageContent, String> {
}
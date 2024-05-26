package com.rozoomcool.serials.repository

import com.rozoomcool.serials.entity.VideoContent
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface VideoContentRepository : ReactiveMongoRepository<VideoContent, String> {
}
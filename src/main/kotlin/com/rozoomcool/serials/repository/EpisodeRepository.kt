package com.rozoomcool.serials.repository

import com.rozoomcool.serials.entity.Episode
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface EpisodeRepository : ReactiveMongoRepository<Episode, String> {
}
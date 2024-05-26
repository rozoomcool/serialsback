package com.rozoomcool.serials.repository

import com.rozoomcool.serials.entity.Tag
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Mono

@Repository
interface TagRepository : ReactiveMongoRepository<Tag, String> {
    fun existsByName(name: String): Mono<Boolean>
    fun findByName(name: String): Mono<Tag>
}
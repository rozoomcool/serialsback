package com.rozoomcool.serials.repository

import com.rozoomcool.serials.entity.Tag
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Mono

@Repository
interface TagRepository : CrudRepository<Tag, String> {
    fun existsByName(name: String): Boolean
    fun findByName(name: String): Tag?
}
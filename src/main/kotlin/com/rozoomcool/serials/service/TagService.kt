package com.rozoomcool.serials.service

import com.rozoomcool.serials.entity.Tag
import com.rozoomcool.serials.repository.TagRepository
import kotlinx.coroutines.reactive.awaitFirst
import kotlinx.coroutines.reactive.awaitSingle
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class TagService(
    private val tagRepository: TagRepository
) {
    private val logger: Logger = LoggerFactory.getLogger(this::class.java)

    fun findOrSaveIfNotExists(tag: Tag): Tag {
        return tagRepository.findByName(tag.name) ?: tagRepository.save(tag)
    }
}
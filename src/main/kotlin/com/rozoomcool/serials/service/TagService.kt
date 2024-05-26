package com.rozoomcool.serials.service

import com.rozoomcool.serials.entity.Tag
import com.rozoomcool.serials.repository.TagRepository
import kotlinx.coroutines.reactive.awaitFirst
import kotlinx.coroutines.reactive.awaitSingle
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class TagService(
    private val tagRepository: TagRepository
) {

    private val logger: Logger = LoggerFactory.getLogger(this::class.java)

    suspend fun saveIfNotExists(tags: Collection<Tag>): Collection<Tag> {
//        return tags.map { tag ->
//            logger.info(":::::::::::")
//            if (tagRepository.existsByName(tag.name).awaitFirst()) {
//                tagRepository.findByName(tag.name).awaitFirst()
//            } else {
//                tagRepository.save(tag).awaitFirst()
//            }
//        }
        return tagRepository.saveAll(tags).collectList().awaitSingle()
    }
}
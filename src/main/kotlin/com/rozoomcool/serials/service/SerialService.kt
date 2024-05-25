package com.rozoomcool.serials.service

import com.rozoomcool.serials.dto.SerialRequest
import com.rozoomcool.serials.entity.Serial
import com.rozoomcool.serials.repository.GenreRepository
import com.rozoomcool.serials.repository.SerialRepository
import com.rozoomcool.serials.repository.TagRepository
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class SerialService(
    private val serialRepository: SerialRepository,
    private val tagRepository: TagRepository,
    private val genreRepository: GenreRepository,
) {

    private val logger: Logger = LoggerFactory.getLogger(this::class.java)

    fun getById(id: Long): Mono<Serial> = serialRepository.findById(id)
    fun getAllSerials(): Flux<Serial> = serialRepository.findAll()

    fun addSerial(serial: Serial): Mono<Serial> {
        return genreRepository.save(serial.genre!!)
            .flatMap { savedGenre ->
                serial.genre = savedGenre
                tagRepository.saveAll(serial.tags)
                    .collectList()
                    .flatMap { savedTags ->
                        serial.tags.clear()
                        serial.tags.addAll(savedTags)
                        serialRepository.save(serial)
                    }
            }
    }

    fun updateSerial(serial: Serial): Mono<Serial> = serialRepository.save(serial)
    fun deleteSerial(serial: Serial) = serialRepository.delete(serial)
}
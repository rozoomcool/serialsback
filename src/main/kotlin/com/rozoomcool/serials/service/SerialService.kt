package com.rozoomcool.serials.service

import com.rozoomcool.serials.dto.SerialRequest
import com.rozoomcool.serials.entity.Serial
import com.rozoomcool.serials.repository.GenreRepository
import com.rozoomcool.serials.repository.SerialRepository
import com.rozoomcool.serials.repository.TagRepository
import kotlinx.coroutines.reactive.awaitFirst
import kotlinx.coroutines.reactive.awaitFirstOrDefault
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class SerialService(
    private val serialRepository: SerialRepository,
    private val tagRepository: TagRepository,
    private val genreRepository: GenreRepository,
) {
    fun getById(id: String): Mono<Serial> = serialRepository.findById(id)
    fun getAllSerials(): Flux<Serial> = serialRepository.findAll()

    suspend fun addSerial(serialRequest: Serial): Mono<Serial> {
        val serial = Serial(
            name = serialRequest.name,
            description = serialRequest.description
        )

        if (serialRequest.genre != null) serial.genre = genreRepository.save(serialRequest.genre!!).awaitFirst()
        serial.tags = tagRepository.saveAll(serialRequest.tags).collectList().awaitFirst()
        serial.author = serialRequest.author

        return serialRepository.save(serial)
    }

    fun updateSerial(serial: Serial): Mono<Serial> = serialRepository.save(serial)
    fun deleteSerial(serial: Serial) = serialRepository.delete(serial)
}
package com.rozoomcool.serials.service

import com.rozoomcool.serials.dto.SerialRequest
import com.rozoomcool.serials.entity.Serial
import com.rozoomcool.serials.repository.GenreRepository
import com.rozoomcool.serials.repository.SerialRepository
import com.rozoomcool.serials.repository.TagRepository
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
    fun addSerial(serialRequest: SerialRequest): Mono<Serial> {
        val serial = Serial(
            name = serialRequest.name,
            description = serialRequest.desc
        )

        return genreRepository.save(serialRequest.genre)
            .flatMap { savedGenre ->
                serial.genre = savedGenre
                tagRepository.saveAll(serialRequest.tags)
                    .collectList()
            }
            .flatMap { savedTags ->
                serial.tags.addAll(savedTags)
                serialRepository.save(serial)
            }
    }

    fun updateSerial(serial: Serial): Mono<Serial> = serialRepository.insert(serial)
    fun deleteSerial(serial: Serial) = serialRepository.delete(serial)
}
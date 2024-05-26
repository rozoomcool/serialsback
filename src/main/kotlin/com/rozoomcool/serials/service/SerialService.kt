package com.rozoomcool.serials.service

import com.rozoomcool.serials.entity.Serial
import com.rozoomcool.serials.entity.Tag
import com.rozoomcool.serials.repository.*
import kotlinx.coroutines.reactive.awaitFirst
import kotlinx.coroutines.reactive.awaitSingle
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.lang.reflect.TypeVariable

@Service
class SerialService(
    private val serialRepository: SerialRepository,
    private val tagService: TagService,
    private val genreRepository: GenreRepository,
    private val seasonRepository: SeasonRepository,
    private val episode: EpisodeRepository,
) {
    fun getById(id: String): Mono<Serial> = serialRepository.findById(id)
    fun getAllSerials(): Flux<Serial> = serialRepository.findAll()

    suspend fun addSerial(serial: Serial): Mono<Serial> {
        serial.genre = genreRepository.save(serial.genre).awaitFirst()
        serial.tags = tagService.saveIfNotExists(serial.tags).toMutableSet()
        serial.seasons = seasonRepository.saveAll(serial.seasons).collectList().awaitFirst().toMutableSet()
        return serialRepository.save(serial)
    }

    fun updateSerial(serial: Serial): Mono<Serial> = serialRepository.save(serial)
    fun deleteSerial(serial: Serial) = serialRepository.delete(serial)
}
package com.rozoomcool.serials.service

import com.rozoomcool.serials.entity.Genre
import com.rozoomcool.serials.repository.GenreRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class GenreService(
    private val genreRepository: GenreRepository
) {
    fun findAll(): Flux<Genre> = genreRepository.findAll()
    fun findById(id: String): Mono<Genre> = genreRepository.findById(id)
    fun save(genre: Genre): Mono<Genre> = genreRepository.save(genre)
}
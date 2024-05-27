package com.rozoomcool.serials.service

import com.rozoomcool.serials.entity.Genre
import com.rozoomcool.serials.repository.GenreRepository
import org.springframework.stereotype.Service

@Service
class GenreService(
    private val genreRepository: GenreRepository
) {
    fun findAll(): Iterable<Genre> = genreRepository.findAll()
    fun findById(id: String): Genre = genreRepository.findById(id).orElseThrow()
    fun save(genre: Genre): Genre = genreRepository.save(genre)

    fun findOrSaveIfNotExists(genre: Genre): Genre {
        return genreRepository.findByName(genre.name) ?: genreRepository.save(genre)
    }
}
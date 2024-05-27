package com.rozoomcool.serials.controller

import com.rozoomcool.serials.entity.Genre
import com.rozoomcool.serials.service.GenreService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux

@RestController
@RequestMapping("/genre")
class GenreController(
    private val genreService: GenreService
) {
    @GetMapping
    fun getAll(): Iterable<Genre> = genreService.findAll()

    @GetMapping("/{id}")
    fun getById(@PathVariable id: String) = genreService.findById(id)
}
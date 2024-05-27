package com.rozoomcool.serials.repository

import com.rozoomcool.serials.entity.Genre
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface GenreRepository : CrudRepository<Genre, String> {
    fun existsByName(name: String): Boolean
    fun findByName(name: String): Genre?
}
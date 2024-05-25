package com.rozoomcool.serials.repository

import com.rozoomcool.serials.entity.Genre
import org.springframework.data.r2dbc.repository.R2dbcRepository
import org.springframework.stereotype.Repository

@Repository
interface GenreRepository : R2dbcRepository<Genre, Long> {
}
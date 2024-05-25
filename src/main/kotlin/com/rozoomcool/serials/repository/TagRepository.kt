package com.rozoomcool.serials.repository

import com.rozoomcool.serials.entity.Tag
import org.springframework.data.r2dbc.repository.R2dbcRepository
import org.springframework.stereotype.Repository

@Repository
interface TagRepository : R2dbcRepository<Tag, Long> {
}
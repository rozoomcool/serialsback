package com.rozoomcool.serials.repository

import com.rozoomcool.serials.entity.Serial
import org.springframework.data.r2dbc.repository.R2dbcRepository
import org.springframework.stereotype.Repository

@Repository
interface SerialRepository : R2dbcRepository<Serial, Long> {
}
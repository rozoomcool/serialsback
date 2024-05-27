package com.rozoomcool.serials.repository

import com.rozoomcool.serials.entity.Serial
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface SerialRepository : CrudRepository<Serial, String> {
    fun existsByName(name: String): Boolean
}
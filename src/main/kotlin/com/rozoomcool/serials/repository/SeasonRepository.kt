package com.rozoomcool.serials.repository

import com.rozoomcool.serials.entity.Season
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface SeasonRepository : CrudRepository<Season, String> {
}
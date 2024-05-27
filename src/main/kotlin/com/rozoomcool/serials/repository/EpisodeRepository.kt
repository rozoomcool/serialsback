package com.rozoomcool.serials.repository

import com.rozoomcool.serials.entity.Episode
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface EpisodeRepository : CrudRepository<Episode, String> {
}
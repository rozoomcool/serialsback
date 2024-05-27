package com.rozoomcool.serials.repository

import com.rozoomcool.serials.entity.VideoContent
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface VideoContentRepository : CrudRepository<VideoContent, String> {
}
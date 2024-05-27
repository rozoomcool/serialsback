package com.rozoomcool.serials.repository

import com.rozoomcool.serials.entity.ImageContent
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ImageContentRepository : CrudRepository<ImageContent, String> {
}
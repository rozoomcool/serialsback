package com.rozoomcool.serials.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "videos")
data class VideoContent(
    @Id var id: String? = null,
    var contentType: String,
    var name: String
)
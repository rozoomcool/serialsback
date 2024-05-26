package com.rozoomcool.serials.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.index.Indexed
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "images")
data class ImageContent (
    @Id var id: String? = null,
    var contentType: String,
    var name: String
)
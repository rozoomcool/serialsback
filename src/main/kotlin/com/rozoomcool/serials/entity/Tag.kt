package com.rozoomcool.serials.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.index.Indexed
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "tags")
data class Tag(
    @Id
    var id: String? = null,
    @Indexed(unique = true)
    var name: String
)
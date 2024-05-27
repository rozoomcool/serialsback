package com.rozoomcool.serials.entity

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.index.Indexed
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "genres")
data class Genre(
    @Id
    var id: String? = null,
    @Indexed(unique = true)
    var name: String? = null
)
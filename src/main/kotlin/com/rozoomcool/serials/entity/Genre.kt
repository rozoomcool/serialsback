package com.rozoomcool.serials.entity

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "genres")
class Genre(
    @Id
    var id: String? = null,
    var name: String
)
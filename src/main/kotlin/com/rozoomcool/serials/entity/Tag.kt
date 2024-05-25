package com.rozoomcool.serials.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "tags")
class Tag(
    @Id
    var id: String? = null,
    var name: String
)
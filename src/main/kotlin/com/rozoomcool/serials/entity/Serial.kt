package com.rozoomcool.serials.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "serial")
class Serial (
    @Id
    var id: String? = null,
    var name: String? = null,
    var description: String? = null,
    var author: String? = null,
    var genre: Genre? = null,
    var tags: MutableList<Tag> = mutableListOf(),
)
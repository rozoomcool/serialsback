package com.rozoomcool.serials.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.DocumentReference

@Document(collection = "serials")
class Serial (
    @Id
    var id: String? = null,
    var name: String? = null,
    var description: String? = null,
    var author: String? = null,
    @DocumentReference
    var genre: Genre? = null,
    @DocumentReference
    var tags: MutableList<Tag> = mutableListOf(),
)
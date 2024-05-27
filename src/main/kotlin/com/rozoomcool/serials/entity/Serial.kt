package com.rozoomcool.serials.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.index.Indexed
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.DocumentReference

@Document(collection = "serials")
data class Serial (
    @Id
    var id: String? = null,
    @Indexed(unique = true)
    var name: String,
    var description: String,
    var author: String,
    var year: Int,
    @DocumentReference
    var genre: Genre? = null,
    var serialType: SerialType,
    @DocumentReference
    var seasons: MutableSet<Season> = mutableSetOf(),
    @DocumentReference
    var images: MutableSet<ImageContent> = mutableSetOf(),
    @DocumentReference
    var tags: MutableSet<Tag> = mutableSetOf(),
)
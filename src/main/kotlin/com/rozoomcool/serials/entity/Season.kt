package com.rozoomcool.serials.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.DocumentReference

@Document(collection = "seasons")
data class Season (
    @Id
    var id: String? = null,
    var number: Int,
    var title: String,
    var description: String,
    @DocumentReference
    var episodes: MutableSet<Episode> = mutableSetOf(),
    @DocumentReference
    var images: MutableSet<ImageContent> = mutableSetOf(),
)
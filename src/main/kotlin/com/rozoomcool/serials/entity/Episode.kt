package com.rozoomcool.serials.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.DocumentReference

@Document(collection = "episodes")
data class Episode(
    @Id var id: String? = null,
    var title: String,
    var description: String,
    @DocumentReference
    var videoContent: VideoContent
)
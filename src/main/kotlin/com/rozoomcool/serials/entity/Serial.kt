package com.rozoomcool.serials.entity

import org.springframework.data.annotation.Id

class Serial (
    @Id
    var id: Long? = null,
    var name: String? = null,
    var description: String? = null,
    var author: String? = null,
    var genre: Genre? = null,
    var tags: MutableList<Tag> = mutableListOf(),
)
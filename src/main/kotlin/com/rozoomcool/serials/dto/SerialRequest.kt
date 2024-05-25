package com.rozoomcool.serials.dto

import com.rozoomcool.serials.entity.Genre
import com.rozoomcool.serials.entity.Tag

data class SerialRequest(
    val name: String,
    val desc: String,
    val genre: Genre,
    val tags: List<Tag>
)
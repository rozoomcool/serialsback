package com.rozoomcool.serials.entity

import org.springframework.data.annotation.Id

class Tag(
    @Id
    var id: Long? = null,
    var name: String
)
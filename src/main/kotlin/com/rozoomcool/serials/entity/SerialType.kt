package com.rozoomcool.serials.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document


enum class SerialType{
    SERIAL, ANIME, ANIMATED
}
package com.rozoomcool.serials.entity

import jakarta.persistence.*

@Entity
data class Genre(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: String? = null,
    @Column(unique = true, nullable = false)
    var name: String
)
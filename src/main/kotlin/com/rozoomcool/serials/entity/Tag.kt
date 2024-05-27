package com.rozoomcool.serials.entity

import jakarta.persistence.*

@Entity
@Table(name = "tags")
data class Tag(
    @Id
    var id: String? = null,
    @Column(unique = true, nullable = false)
    var name: String
)
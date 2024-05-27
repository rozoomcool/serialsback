package com.rozoomcool.serials.entity

import jakarta.persistence.*

@Entity
@Table(name = "tags")
data class Tag(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    @Column(unique = true, nullable = false)
    var name: String
)
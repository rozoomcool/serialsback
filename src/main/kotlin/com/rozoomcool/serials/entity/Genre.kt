package com.rozoomcool.serials.entity

import jakarta.persistence.*

@Entity
class Genre (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    @Column(unique = true, nullable = false)
    var name: String
)
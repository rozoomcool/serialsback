package com.rozoomcool.serials.entity

import jakarta.persistence.*


@Entity
@Table(name = "images")
data class ImageContent (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: String? = null,
    var contentType: String,
    @Column(unique = true, nullable = false)
    var name: String
)
package com.rozoomcool.serials.entity

import jakarta.persistence.*

@Entity
@Table(name = "videos")
data class VideoContent(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    var contentType: String,
    @Column(unique = true, nullable = false)
    var name: String
)
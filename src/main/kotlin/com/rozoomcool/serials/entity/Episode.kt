package com.rozoomcool.serials.entity

import jakarta.persistence.*

@Entity
@Table(name = "episodes")
data class Episode(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long? = null,
    var title: String,
    var description: String,
    @OneToOne(cascade = [(CascadeType.ALL)])
    var videoContent: VideoContent
)
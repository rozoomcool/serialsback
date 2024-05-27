package com.rozoomcool.serials.entity

import jakarta.persistence.*

@Entity
@Table(name = "episodes")
data class Episode(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: String? = null,
    var title: String,
    var description: String,
    @OneToOne(cascade = [(CascadeType.ALL)], fetch = FetchType.LAZY)
    var videoContent: VideoContent
)
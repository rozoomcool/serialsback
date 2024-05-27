package com.rozoomcool.serials.entity

import jakarta.persistence.*

@Entity
@Table(name = "seasons")
data class Season (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: String? = null,
    var number: Int,
    var description: String,
    @OneToMany(cascade = [(CascadeType.ALL)])
    var episodes: MutableSet<Episode> = mutableSetOf(),
    @OneToMany(cascade = [(CascadeType.ALL)])
    var images: MutableSet<ImageContent> = mutableSetOf(),
)
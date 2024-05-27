package com.rozoomcool.serials.entity

import jakarta.persistence.*

@Entity
@Table(name = "serial")
data class Serial (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: String? = null,
    @Column(unique = true, nullable = false)
    var name: String,
    var description: String,
    var author: String,
    var year: Int,
    @ManyToOne(fetch = FetchType.LAZY)
    var genre: Genre,
    var serialType: SerialType,
    @OneToMany(fetch = FetchType.LAZY)
    var seasons: MutableSet<Season> = mutableSetOf(),
    @OneToMany(fetch = FetchType.LAZY)
    var images: MutableSet<ImageContent> = mutableSetOf(),
    @OneToMany(fetch = FetchType.LAZY)
    var tags: MutableSet<Tag> = mutableSetOf(),
) {
}
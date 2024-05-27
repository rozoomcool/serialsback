package com.rozoomcool.serials.entity

import jakarta.persistence.*

@Entity
@Table(name = "serial")
data class Serial (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    @Column(unique = true, nullable = false)
    var name: String,
    var description: String,
    var author: String,
    var year: Int,
    @ManyToOne
    var genre: Genre,
    @Enumerated(EnumType.STRING)
    var serialType: SerialType,
    @OneToMany
    var seasons: MutableSet<Season> = mutableSetOf(),
    @OneToMany
    var images: MutableSet<ImageContent> = mutableSetOf(),
    @ManyToMany
    var tags: MutableSet<Tag> = mutableSetOf(),
) {
}
package com.rozoomcool.serials.entity

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.MappedCollection
import org.springframework.data.relational.core.mapping.Table

@Table("serials")
data class Serial(
    @Id val id: Long?,
    val name: String?,
    val description: String?,
    @MappedCollection(idColumn = "serial_id") val tags: MutableList<Tag> = mutableListOf(),
)
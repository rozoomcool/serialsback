package com.rozoomcool.serials.config

import jakarta.annotation.PostConstruct
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Configuration
import org.springframework.data.r2dbc.core.R2dbcEntityTemplate


//@Configuration
//class DatabaseConfig(
//    private val r2dbcEntityTemplate: R2dbcEntityTemplate
//) {
//    @PostConstruct
//    fun createTables() {
//        r2dbcEntityTemplate.databaseClient.sql("""
//            CREATE TABLE IF NOT EXISTS serial (
//                id SERIAL PRIMARY KEY,
//                name VARCHAR(255) NOT NULL,
//                description TEXT,
//                author VARCHAR(255),
//                tags VARCHAR(255)
//            )
//        """.trimIndent())
//            .then()
//            .subscribe()
//    }
//}
package com.rozoomcool.serials.service

import com.rozoomcool.serials.entity.Serial
import com.rozoomcool.serials.exception.SerialAlreadyExistsException
import com.rozoomcool.serials.repository.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.springframework.stereotype.Service

@Service
class SerialService(
    private val serialRepository: SerialRepository,
    private val genreService: GenreService,
    private val tagService: TagService
) {
    fun getById(id: String): Serial = serialRepository.findById(id).orElseThrow()
    fun getAllSerials(): Iterable<Serial> = serialRepository.findAll()

    fun addSerial(serial: Serial): Serial {
        if (serialRepository.existsByName(serial.name)) throw SerialAlreadyExistsException()
        serial.genre = genreService.findOrSaveIfNotExists(serial.genre)
        serial.tags = serial.tags.map { tagService.findOrSaveIfNotExists(it) }.toMutableSet()
        return serialRepository.save(serial)
    }

    fun updateSerial(serial: Serial): Serial = serialRepository.save(serial)
    fun deleteSerial(serial: Serial) = serialRepository.delete(serial)
}
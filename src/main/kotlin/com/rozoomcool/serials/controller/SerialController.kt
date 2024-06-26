package com.rozoomcool.serials.controller

import com.rozoomcool.serials.dto.SerialRequest
import com.rozoomcool.serials.entity.Serial
import com.rozoomcool.serials.exception.SerialAlreadyExistsException
import com.rozoomcool.serials.service.SerialService
import kotlinx.coroutines.reactive.awaitSingle
import kotlinx.coroutines.reactor.awaitSingle
import org.reactivestreams.Publisher
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.core.io.Resource
import org.springframework.core.io.ResourceLoader
import org.springframework.http.HttpStatus
import org.springframework.http.HttpStatusCode
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.util.MimeType
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.time.Duration

@RestController
@RequestMapping("/serial")
class SerialController(
    private val serialService: SerialService,
    private val resourceLoader: ResourceLoader
) {
    private val logger: Logger = LoggerFactory.getLogger(this::class.java)

    @GetMapping
    suspend fun getAllSerials(): Iterable<Serial> = serialService.getAllSerials()

    @PostMapping
    fun addSerials(@RequestBody serial: Serial): ResponseEntity<Any?> {
        logger.info("PROCESS POST /serial")
        return try {
            ResponseEntity.ok(serialService.addSerial(serial))
        } catch (e: SerialAlreadyExistsException) {
            ResponseEntity(e.message, HttpStatus.CONFLICT)
        }
//        catch (e: Exception) {
//            ResponseEntity("Bad request", HttpStatus.BAD_REQUEST)
//        }
    }

    @GetMapping("/{id}")
    suspend fun getSerial(@PathVariable("id") serialId: String): Serial {
        return serialService.getById(id = serialId)
    }

//
//    @GetMapping("/aa")
//    suspend fun some(): Mono<ResponseEntity<Resource>> = Mono.just(
//        ResponseEntity.status(HttpStatus.OK)
//            .contentType(MediaType.asMediaType(MimeType.valueOf("VIDEO/MP4")))
//            .body(
//                resourceLoader.getResource("classpath:media/videoplayback.mp4")
//            )
//    )
//
//    @GetMapping("/bb")
//    fun somee(): ResponseEntity<Resource> =
//        ResponseEntity.status(HttpStatus.OK)
//            .contentType(MediaType.asMediaType(MimeType.valueOf("VIDEO/MP4")))
//            .body(
//                resourceLoader.getResource("classpath:media/videoplayback.mp4")
//            )

}
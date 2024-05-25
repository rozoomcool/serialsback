package com.rozoomcool.serials.controller

import com.rozoomcool.serials.dto.SerialRequest
import com.rozoomcool.serials.entity.Serial
import com.rozoomcool.serials.service.SerialService
import org.reactivestreams.Publisher
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

    @GetMapping
    fun getAllSerials(): Flux<Serial> = serialService.getAllSerials()

    @PostMapping
    fun addSerials(@RequestBody serial: SerialRequest): Mono<Serial> = serialService.addSerial(serial)

    @GetMapping("/aa")
    fun some(): Mono<ResponseEntity<Resource>> = Mono.just(
        ResponseEntity.status(HttpStatus.OK)
            .contentType(MediaType.asMediaType(MimeType.valueOf("VIDEO/MP4")))
            .body(
                resourceLoader.getResource("classpath:media/videoplayback.mp4")
            )
    )

    @GetMapping("/bb")
    fun somee(): ResponseEntity<Resource> =
        ResponseEntity.status(HttpStatus.OK)
            .contentType(MediaType.asMediaType(MimeType.valueOf("VIDEO/MP4")))
            .body(
                resourceLoader.getResource("classpath:media/videoplayback.mp4")
            )

}
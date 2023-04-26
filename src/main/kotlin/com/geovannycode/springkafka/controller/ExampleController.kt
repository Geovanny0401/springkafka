package com.geovannycode.springkafka.controller

import com.geovannycode.springkafka.dto.RequestBodyDto
import com.geovannycode.springkafka.producer.ProducerString
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
class ExampleController(private val producerString: ProducerString) {
    @PostMapping("/test")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun sendTestMessage(@RequestBody requestBody: RequestBodyDto){
        producerString.sendStringMessage(message = requestBody.message)
    }
}
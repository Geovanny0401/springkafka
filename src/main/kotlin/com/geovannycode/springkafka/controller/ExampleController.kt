package com.geovannycode.springkafka.controller

import com.geovannycode.springkafka.dto.RequestBodyDto
import com.geovannycode.springkafka.producer.ProducerString
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class ExampleController(private val producerString: ProducerString) {
    fun sendTestMessage(@RequestBody requestBody: RequestBodyDto){
        producerString.sendStringMessage(message = requestBody.message)
    }
}
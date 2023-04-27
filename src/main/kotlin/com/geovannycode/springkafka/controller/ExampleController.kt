package com.geovannycode.springkafka.controller

import com.geovannycode.springkafka.dto.ExampleDto
import com.geovannycode.springkafka.dto.RequestBodyDto
import com.geovannycode.springkafka.dto.UserDto
import com.geovannycode.springkafka.producer.ExampleJsonProducer
import com.geovannycode.springkafka.producer.ProducerString
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import kotlin.random.Random

@RestController
class ExampleController(
    private val producerString: ProducerString,
    private val exampleJsonProducer: ExampleJsonProducer,
) {
    @PostMapping("/test")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun sendTestMessage(@RequestBody requestBody: RequestBodyDto) {
        producerString.sendStringMessage(message = requestBody.message)
        exampleJsonProducer.sendExampleDtoMessage(
            dto = ExampleDto(requestBody.message),
        )
        exampleJsonProducer.sendUserDtoMessage(
            dto = UserDto(
                id = Random.nextLong(0, 100),
                name = requestBody.message,
            ),
        )
    }
}

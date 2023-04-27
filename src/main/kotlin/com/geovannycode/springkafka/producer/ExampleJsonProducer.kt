package com.geovannycode.springkafka.producer

import com.geovannycode.springkafka.dto.ExampleDto
import com.geovannycode.springkafka.dto.UserDto
import com.geovannycode.springkafka.utils.TOPIC_NAME_THREE
import com.geovannycode.springkafka.utils.TOPIC_NAME_TWO
import org.springframework.kafka.core.KafkaTemplate

class ExampleJsonProducer(private val exampleDtoKafkaTemplate: KafkaTemplate<String, ExampleDto>,
                          private val userDtoKafkaTemplate: KafkaTemplate<String, UserDto>) {
    fun sendExampleDtoMessage(dto: ExampleDto) {
        exampleDtoKafkaTemplate.send(TOPIC_NAME_TWO, dto)
    }
    fun sendUserDtoMessage(dto: UserDto) {
        userDtoKafkaTemplate.send(TOPIC_NAME_THREE, dto)
    }
}
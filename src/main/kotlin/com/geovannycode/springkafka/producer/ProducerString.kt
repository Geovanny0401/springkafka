package com.geovannycode.springkafka.producer

import com.geovannycode.springkafka.utils.TOPIC_NAME
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Component

@Component
class ProducerString(private val kafkaTemplate: KafkaTemplate<String, String>) {
    fun sendStringMessage(message: String){
        kafkaTemplate.send(TOPIC_NAME, message)
    }
}
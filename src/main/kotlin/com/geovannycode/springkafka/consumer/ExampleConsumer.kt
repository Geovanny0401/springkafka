package com.geovannycode.springkafka.consumer

import com.geovannycode.springkafka.dto.ExampleDto
import com.geovannycode.springkafka.dto.UserDto
import com.geovannycode.springkafka.utils.GROUP_ID
import com.geovannycode.springkafka.utils.TOPIC_NAME
import com.geovannycode.springkafka.utils.TOPIC_NAME_THREE
import com.geovannycode.springkafka.utils.TOPIC_NAME_TWO
import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class ExampleConsumer {
    private val logger = LoggerFactory.getLogger(this.javaClass)

    @KafkaListener(topics = [TOPIC_NAME], groupId = GROUP_ID)
    fun firstListener(message: String) {
        logger.info("Message Received: [$message]")
    }

    @KafkaListener(topics = [TOPIC_NAME_TWO], groupId = GROUP_ID)
    fun secondListener(message: ExampleDto) {
        logger.info("Message received: [$message]")
    }
    @KafkaListener(topics = [TOPIC_NAME_THREE], groupId = GROUP_ID)
    fun secondListener(message: UserDto) {
        logger.info("Message received: [$message]")
    }
}

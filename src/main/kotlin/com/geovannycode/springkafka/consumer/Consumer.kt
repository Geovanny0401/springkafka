package com.geovannycode.springkafka.consumer

import com.geovannycode.springkafka.utils.GROUP_ID
import com.geovannycode.springkafka.utils.TOPIC_NAME
import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class Consumer {
    private val logger = LoggerFactory.getLogger(this.javaClass)

    @KafkaListener(topics = [TOPIC_NAME], groupId = GROUP_ID)
    fun firstListener(message: String) {
        logger.info("Message Received: [$message]")
    }
}

package cz.kromer.mqdemo.consumer.listener

import cz.kromer.mqdemo.dto.PersonMessage
import cz.kromer.mqdemo.dto.ProductMessage
import org.slf4j.LoggerFactory.getLogger
import org.springframework.amqp.rabbit.annotation.RabbitHandler
import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.stereotype.Component

@Component
@RabbitListener(queues = ["\${app.messaging.queue-name}"])
class MessageListener {

    private val log = getLogger(javaClass)

    @RabbitHandler
    fun receiveProductMessage(message: ProductMessage) {
        log.info("Product message received: {}", message)
    }

    @RabbitHandler
    fun receivePersonMessage(message: PersonMessage) {
        log.info("Person message received: {}", message)
    }
}
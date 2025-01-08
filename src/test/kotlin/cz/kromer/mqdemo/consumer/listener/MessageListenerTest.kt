package cz.kromer.mqdemo.consumer.listener

import cz.kromer.mqdemo.dto.ProductMessage
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles

@SpringBootTest
@ActiveProfiles("test")
class MessageListenerTest @Autowired constructor(
    val messageListener: MessageListener
) {

    @Test
    fun `should receive product message`() {
        messageListener.receiveProductMessage(ProductMessage("Keyboard", 15))
    }
}
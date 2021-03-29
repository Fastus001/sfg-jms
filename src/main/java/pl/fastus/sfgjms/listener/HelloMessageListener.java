package pl.fastus.sfgjms.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import pl.fastus.sfgjms.config.JmsConfig;
import pl.fastus.sfgjms.model.HelloWorldMessage;

/**
 * Created by Tom - 26.03.2021
 */
@Component
public class HelloMessageListener {

    @JmsListener(destination = JmsConfig.MY_QUEUE)
    public void listen(@Payload HelloWorldMessage helloWorldMessage,
                       @Headers MessageHeaders headers, Message message){
        System.out.println("I Got a Message!!!!");

        System.out.println(helloWorldMessage);
    }
}

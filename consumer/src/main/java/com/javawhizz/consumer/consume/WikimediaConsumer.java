package com.javawhizz.consumer.consume;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Service
@Slf4j
public class WikimediaConsumer {
    @KafkaListener(
            topics = "wikimedia-stream",
            groupId = "myGroup"
    )
    public void consumeJsonMsg(String msg){
        log.info(format("Consuming the message from wikimedia-stream Topic:: %s", msg));
        // TODO: process the received data
    }
}

package com.example.demo.kafka.producer;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaSender {

    private static Logger logger = LoggerFactory.getLogger(KafkaSender.class);

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void send(Message message){
        JSONObject jsonObject = (JSONObject) JSONObject.toJSON(message);
        String messageString = jsonObject.toString();
        logger.info("++++++send Message to Kafka  ", messageString);
        kafkaTemplate.send("my-replicated-topic", messageString);
    }
}

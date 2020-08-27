package com.example.demo.kafka.consumer;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.Message;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TestMessageConsumer {
    @KafkaListener(topics = {"my-replicated-topic"})
    public void consumer(ConsumerRecord<String,String> record){
        String value = record.value();
        JSONObject jsonObject = (JSONObject) JSONObject.parse(value);
        Message message = jsonObject.toJavaObject(Message.class);
        System.out.println(message.toString());
    }
}

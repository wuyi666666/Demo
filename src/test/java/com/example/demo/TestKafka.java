package com.example.demo;

import com.example.demo.entity.Message;
import com.example.demo.kafka.producer.KafkaSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestKafka {

    @Autowired
    private KafkaSender kafkaSender;

    @Test
    public void test(){
        Message message = new Message();
        message.setId(1).setMsg("hello").setSendTime(new Date());
        kafkaSender.send(message);
    }
}

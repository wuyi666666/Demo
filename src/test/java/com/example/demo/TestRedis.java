package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRedis {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Test
    public void test(){
        redisTemplate.opsForValue().set("你好！","你好呀！");
        String o = (String)redisTemplate.opsForValue().get("你好！");
        System.out.println(o);
    }
}

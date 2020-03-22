package com.example.demo.RedisConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {
    @Autowired
    RedisTemplate<String, Object> redisTemplate;

    @RequestMapping("/redisHello")
    public String redisHello() {
        redisTemplate.opsForValue().set("ybx", "22322222");
        String value = (String) redisTemplate.opsForValue().get("ybx");
        return "redis hello" + value;
    }
}

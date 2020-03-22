package com.example.demo.RedisConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.concurrent.TimeUnit;


public class RedisUtil {
    @Autowired
    RedisTemplate<String, Object> redisTemplate;

    /**
     * @param key
     * @param value
     */
    public void set(String key, Object value) {
        redisTemplate.opsForValue().set(key, value);
    }

    /**
     * @param key
     */
    public Object get(String key) {
        return redisTemplate.opsForValue().get(key);
    }

    /**
     * @param key
     * @param value
     * @param second
     */
    public void set(String key, Object value, long second) {
        redisTemplate.opsForValue().set(key, value, second, TimeUnit.SECONDS);
    }

    /**
     * @param key
     * @param time
     */
    public void expre(String key, Long time) {
        redisTemplate.expire(key, time, TimeUnit.SECONDS);
    }

    /**
     * @param key
     * @return
     */
    public long getExpire(String key) {
        return redisTemplate.getExpire(key);
    }

    /**
     * @param key
     */
    public void incr(String key) {
        redisTemplate.opsForValue().increment(key);
    }

    /**
     * @param key
     */
    public void decr(String key) {
        redisTemplate.opsForValue().decrement(key);
    }
}

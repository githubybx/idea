package com.example.demo.RedisConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class RedisConfig {
    @Autowired
    RedisConnectionFactory redisConnectionFactory;

    @Bean
    public RedisTemplate<String, Object> getRedis() {
        RedisTemplate<String, Object> stringObjectRedisTemplate = new RedisTemplate<>();
        stringObjectRedisTemplate.setConnectionFactory(redisConnectionFactory);
        //key的序列化方式
        stringObjectRedisTemplate.setKeySerializer(new StringRedisSerializer());
        //value的序列化方式
        stringObjectRedisTemplate.setValueSerializer(new JdkSerializationRedisSerializer());
        //hash的value序列化方式
        stringObjectRedisTemplate.setHashValueSerializer(new JdkSerializationRedisSerializer());
        return stringObjectRedisTemplate;
    }

    @Bean
    public StringRedisTemplate geSth() {
        StringRedisTemplate stringRedisTemplate = new StringRedisTemplate(redisConnectionFactory);
        return stringRedisTemplate;
    }
}

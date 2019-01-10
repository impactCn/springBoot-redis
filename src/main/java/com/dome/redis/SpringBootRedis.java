package com.dome.redis;

import com.dome.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * Created by Administrator on 2019/1/7.
 */
public class SpringBootRedis {

    @Autowired
    private StringRedisTemplate redisTemplate;


    public static void main(String[] args) {

        SpringBootRedis springBootRedis = new SpringBootRedis();
        springBootRedis.redisTemplate.opsForValue().set("hello", "world");

    }
}

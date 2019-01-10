package com.dome.redis;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dome.config.CacheConfig;
import com.dome.pojo.Student;
import com.dome.util.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisApplicationTests {

	@Resource
	RedisTemplate redisTemplate;

	@Resource
	StringRedisTemplate stringRedisTemplate;

	@Test
	public void contextLoads() {
		Student student = new Student("123", 123, "123");
		String jsonObject = JSONObject.toJSONString(student);

		System.out.println(redisTemplate.opsForValue().get("hello"));


	}

}


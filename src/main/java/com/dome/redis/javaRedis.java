package com.dome.redis;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dome.pojo.Student;
import redis.clients.jedis.Jedis;

import java.util.List;

/**
 * Created by Administrator on 2018/12/29.
 */

/**
 * 基础Jedis的学习
 */
public class javaRedis {

    public static void main(String[] args) {

        // 连接本地的 Redis服务
        Jedis jedis = new Jedis("localhost");
        System.out.println("连接成功");
        System.out.println(jedis.ping());

        // redis的String(字符串)
        jedis.set("demo", "demoRedis");
        System.out.println(jedis.get("demo"));
        System.out.println("------------------------");
        // redis的linked-list(列表) 与队列相同都是后进先出
        jedis.lpush("site-list", "Runoob");
        jedis.lpush("site-list", "Google");
        jedis.lpush("site-list", "Aliba");

        List<String> list = jedis.lrange("site-list", 0, 2);
        for (String a: list) {
            System.out.println(a);
        }

        System.out.println(jedis.lindex("site-list", 0));
        System.out.println("------------------------");

        // redis的set-key(无序集合)
        jedis.sadd("key", "value1", "value2", "value3", "value4");
        System.out.println(jedis.sismember("key", "value1"));
        System.out.println(jedis.srem("key", "value1"));
        System.out.println(jedis.smembers("key"));
        System.out.println("------------------------");

        // redis的String存储对象
        Student student = new Student("张三", 18, "男");
        String json = JSON.toJSONString(student);
        System.out.println();

        jedis.set("student", json);
        System.out.println(jedis.get("student"));
    }

}

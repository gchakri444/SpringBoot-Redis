package com.chakri.redis;

import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericToStringSerializer;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import redis.clients.jedis.JedisPoolConfig;


/**
 * Created by chakradhar on 28/04/17.
 */
public class TestRedis {

  public static void main(String args[]){
    JedisConnectionFactory jedis = new JedisConnectionFactory();
    jedis.afterPropertiesSet();
    RedisTemplate<String, String> temp = new RedisTemplate<>();
    temp.setConnectionFactory(jedis);
    temp.setValueSerializer(new JdkSerializationRedisSerializer());
    temp.afterPropertiesSet();
    Member mem = new Member();
    mem.setName("chakri");
    mem.setNumber("123");

    //temp.opsForValue().set("hello","hello1");
    temp.opsForValue().set("hello","hello2");
    //mem = temp.opsForValue().get("memberkey");

    System.out.print("hello");

  }
}

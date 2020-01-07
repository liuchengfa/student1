package com.example.student.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

@Component
public class RedisUtil {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    /**
     *保存redis
     * @param key
     * @param object
     * @return
     */
    public boolean set(String key, Object object){
        ValueOperations<String,Object> vo=redisTemplate.opsForValue();
        vo.set(key, object);
        return true;
    }


    /**
     * 读取ȡredis
     * @param key
     * @return
     */
    public Object get(String key){
        ValueOperations<String, Object> vo = redisTemplate.opsForValue();
        return vo.get(key);
    }
}
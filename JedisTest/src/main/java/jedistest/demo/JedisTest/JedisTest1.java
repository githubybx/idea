package jedistest.demo.JedisTest;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class JedisTest1 {
    public static void main(String[] args) {
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        String host = "127.0.0.1";
        int port = 6379;
        JedisPool jedisPool = new JedisPool(jedisPoolConfig, host, port);
        Jedis resource = jedisPool.getResource();
        resource.auth("12345678");
        System.out.println(resource.ping());
        resource.close();
    }
}

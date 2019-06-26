package wiki.lkm.redis;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

public class TestRedisTemplate {
	RedisTemplate redisTemplate = null;
	@Test
	public void test1(){
		ClassPathXmlApplicationContext ctx  = new ClassPathXmlApplicationContext("applicationContext.xml","spring-redis.xml");
		redisTemplate =  ctx.getBean(RedisTemplate.class);
		
		ValueOperations valueOperation = redisTemplate.opsForValue();
		valueOperation.set("abc", "�����", 5,TimeUnit.MINUTES);
	}
	
}

package com.zrf.springmvcredis;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;

public class SpringRedisTest{
  private static ApplicationContext applicationContex;
  static{
	  applicationContex=new ClassPathXmlApplicationContext("applicationContext.xml");
  }
  @Test
  public void testApplicationContext(){
	  System.out.println(applicationContex);
  }
  @Test
  public void testRedisConnection(){
	  RedisTemplate redisTemplate =(RedisTemplate)applicationContex.getBean("redisTemplate");
	//如果key=abc存在，则将key修改为bbb 
	  redisTemplate.rename("abc", "bbb");
	  System.out.println(redisTemplate);
  }
}

package com.zrf.springmvc.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.zrf.springmvc.entiy.User;
/**
 * @SessionAttributes:除了可以通过属性名指定需要放到会话中的属性外（实际上使用的是value属性值），
 * 还可以通过模型属性的对象类型指定哪些模型属性需要放到会话中（实际上使用的是types属性值）
 * 只能放在类上面，而不能放到方法上面
 */
@Controller
@RequestMapping("/springmvc")
@SessionAttributes(value={"user"},types={String.class})
public class SpringmvcTest {
  private final static String SUCCESS="success";
  
  @RequestMapping("/testSessionAttributtes")
  public String testSessionAttributtes(Map<String,Object>map){
	  User user=new User("zhangsan","123456","zhangsan@qq.com",25);
	  map.put("user", user);
	  map.put("comapny", "huawei");
	  return SUCCESS;
  }
}

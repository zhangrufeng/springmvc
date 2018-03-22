package com.zrf.springmvc.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zrf.springmvc.entiy.User;
/**
 * @ModelAttribute标记的方法，会在每个目标方法执行之前被springmvc调用
 */
@Controller
@RequestMapping("/springmvc")
public class SpringmvcTest {
	private final static String SUCCESS="success";
	
	@ModelAttribute
	public void getUser(@RequestParam(value="id",required=false)Integer id,Map<String,Object>map){
		if(id!=null){
			//模拟从数据库获取对象
			User user=new User(1,"zhangsan","123456","zhangsan@qq.com",12);
			System.out.println("从数据库获取一个对象："+user);
			map.put("user", user);
		}
		
	}
	/**
	 * * 运行流程:
	 * 1. 执行 @ModelAttribute 注解修饰的方法: 从数据库中取出对象, 把对象放入到了 Map 中. 键为: user
	 * 2. SpringMVC 从 Map 中取出 User 对象, 并把表单的请求参数赋给该 User 对象的对应属性.
	 * 3. SpringMVC 把上述对象传入目标方法的参数.  
	 */
	@RequestMapping("/testModelAttribute")
	public String testModelAttribute(User user){
		System.out.println("修改："+user);
		return  SUCCESS;
	}
}

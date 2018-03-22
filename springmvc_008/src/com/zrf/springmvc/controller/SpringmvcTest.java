package com.zrf.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 如果不想传参age的时候就按照下面方式写
 * 1.@RequestParam(value="age",required=false)Integer age
 * 2.@RequestParam(value="age",required=false,defaultValue="0")Integer age
 *
 */
@Controller
@RequestMapping("/springmvc")
public class SpringmvcTest {
	private final static String SUCCESS="success";
	@RequestMapping("/testRequestParm")
   public String testRequestParm(@RequestParam(value="name")String name,@RequestParam(value="age")Integer age){
		System.out.println("testRequestParm name:"+name +";age:"+age);
	   return SUCCESS;
   }
}

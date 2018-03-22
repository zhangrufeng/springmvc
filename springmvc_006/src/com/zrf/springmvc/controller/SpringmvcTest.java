package com.zrf.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * @PathVariable:可以来映射URL 中的占位符到目标方法中的参数中
 *
 */
@Controller
@RequestMapping("/springmvc")
public class SpringmvcTest {
 private final static String SUCCESS="success";
 
 @RequestMapping("/testPathVariable/{id}")
 public String testPathVariable(@PathVariable("id")Integer id){
	 System.out.println("testPathVariable:"+id);
	 return SUCCESS;
 }
}

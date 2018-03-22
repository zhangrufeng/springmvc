package com.zrf.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zrf.springmvc.enity.User;
/**
 *  使用POjo作为参数对表单输入内容映射
 *
 */
@Controller
@RequestMapping("/springmvc")
public class SpringmvcTest {
  private final static String SUCCESS="success";
    @RequestMapping("/testPojo")
	public String testPojo(User user){
    	System.out.println("testPojo user:"+user);
		return SUCCESS;
	}
}

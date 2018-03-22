package com.zrf.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * method:指定请求的方法
 *
 */
@Controller
@RequestMapping("/springmvc")
public class SpringMvcTest {
	private final static String SUCCESS="success";
    @RequestMapping(value="/testMethod",method=RequestMethod.POST)
	public String testMethod(){
    	System.out.println("testMethod");
		return SUCCESS;
	}
}

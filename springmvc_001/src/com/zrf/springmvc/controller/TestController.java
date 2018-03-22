package com.zrf.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Controller :控制器
 * @RequestMapping ：设置请求url
 *
 */
@Controller
public class TestController {
    @RequestMapping("/helloword")
	public String hello(){
		System.out.println("HelloWord");
		return "success";
	}
}

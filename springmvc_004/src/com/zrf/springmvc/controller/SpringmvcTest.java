package com.zrf.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * params:设置参数
 * headers：设置请求头
 *
 */
@Controller
@RequestMapping("/springmvc")
public class SpringmvcTest {
 private final static String SUCCESS="success";
 @RequestMapping(value="/testParmAndHead",params={"username","age!=10"},headers={"Accept-Language=zh-CN,zh;q=0.9"})
 public String testParmAndHead(){
	 System.out.println("testParmAndHead");
	 return SUCCESS;
 }
}

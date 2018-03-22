package com.zrf.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/springmvc")
public class SpringmvcTest {
  private final static String SUCCESS="success";
  @RequestMapping("/testSpringmvc")
  public String testSpringmvc(){
	  System.out.println("testSpringmvc");
	  return SUCCESS;
  }
  /**
   * @CookieValue:映射Cookie值
   *
   */
  @RequestMapping("/testCookievalue")
  public String testCookievalue(@CookieValue("JSESSIONID")String sessionId ){
	  System.out.println("testCookievalue JSESSIONID:"+sessionId);
	  return SUCCESS;
  }
}

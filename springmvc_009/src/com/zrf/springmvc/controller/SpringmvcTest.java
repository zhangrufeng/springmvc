package com.zrf.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/springmvc")
public class SpringmvcTest {
  private final static String SUCCESS="success";
  
  @RequestMapping("/testRequestHeader")
  public String testRequestHeader(@RequestHeader(value="Accept-Language")String wn){
	  System.out.println("testRequestHeader,Accept-Language:"+wn);
	  return SUCCESS;
  }
}

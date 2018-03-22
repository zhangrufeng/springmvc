package com.zrf.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/springmvc")
public class SpringmvcTest {
	
  @RequestMapping("/testView")	
  public String testView(){
	  System.out.println("testView");
	 return "helloView";
  }
}

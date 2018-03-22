package com.zrf.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/springmvc")
public class SpringmvcTest {
	
  @RequestMapping("/testRedirect")	
  public String testRedirect(){
	  System.out.println("testRedirect");
	 return "redirect:/index.jsp";
  }
}

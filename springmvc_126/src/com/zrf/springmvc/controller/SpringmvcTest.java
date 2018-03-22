package com.zrf.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zrf.springmvc.service.UserService;

@Controller
public class SpringmvcTest {
	private final static String SUCCESS="success";
	@Autowired
	private UserService userService;
   	
	
  public SpringmvcTest() {
		System.out.println("SpringmvcTest Constructor...");
	}



@RequestMapping("/testhelloWord")	
  public String testhelloWord(){
	  return SUCCESS;
  }
}

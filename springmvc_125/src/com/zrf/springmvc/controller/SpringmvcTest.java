package com.zrf.springmvc.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class SpringmvcTest {
	private final static String SUCCESS="success";
	
	@RequestMapping("/testSimpleMappingExceptionResolver")
	public String testSimpleMappingExceptionResolver(@RequestParam("i")int i){
		String []vals=new String[10];
		System.out.println(vals[i]);
		return SUCCESS;
	}
}

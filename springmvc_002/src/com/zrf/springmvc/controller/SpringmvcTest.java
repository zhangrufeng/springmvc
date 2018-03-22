package com.zrf.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 *@RequestMapping：不仅可以设置方法url还可以设置类url
 *
 */
@Controller
@RequestMapping("/springmvc")
public class SpringmvcTest {
    private  static final String SUCCESS="success"; 
    @RequestMapping("/springmvcTest")
    public String springmvcTest(){
    	System.out.println("springmvcTest");
    	return SUCCESS;
    }
}

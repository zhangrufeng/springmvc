package com.zrf.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * @RequestMapping支持ant风格url
 *
 */
@Controller
@RequestMapping("/springmvc")
public class SpringmvcTest {
   private final static String SUCCESS="success";
   
   @RequestMapping("/testAntPath/*/abc")
   public String testAntPath(){
	   System.out.println("testAntPath");
	   return SUCCESS;
   }
}

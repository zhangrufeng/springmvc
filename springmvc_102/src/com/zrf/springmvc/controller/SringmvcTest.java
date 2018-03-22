package com.zrf.springmvc.controller;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/springmvc")
public class SringmvcTest {
  private final static String SUCCESS="success";
  @RequestMapping("/testServletApi")
  public void testServletApi(HttpServletRequest request,HttpServletResponse response,Writer out) throws IOException{
	  out.write("springmvc");
	  System.out.println("testServletApi:"+request+","+response);
  }
//  @RequestMapping("/testServletApi")
//  public String testServletApi(HttpServletRequest request,HttpServletResponse response){
//	  System.out.println("testServletApi:"+request+","+response);
//	  return SUCCESS;
//  }
}

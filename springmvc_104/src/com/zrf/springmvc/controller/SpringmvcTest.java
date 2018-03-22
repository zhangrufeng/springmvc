package com.zrf.springmvc.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/springmvc")
public class SpringmvcTest {
  private final static String SUCCESS="success";
  /**
   *目标方法可以添加Map类型（实际上也可以是Model类型或ModelMap类型）的参数 
   */
  @RequestMapping("/testMap")
  public String testMap(Map<String,Object> map){
	  map.put("names", Arrays.asList("zhangsan","lis","wangwu"));
	  return SUCCESS;
  }
}

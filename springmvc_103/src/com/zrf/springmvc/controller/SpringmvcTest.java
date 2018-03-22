package com.zrf.springmvc.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/springmvc")
public class SpringmvcTest {
	private final static String SUCCESS="success";
	/**
	 * springmvc 把ModelAndView的model中的数据放到request域中
	 */
	@RequestMapping("/testModelAndView")
  private ModelAndView testModelAndView(){
	  String viewName=SUCCESS;
	  ModelAndView modelAndView=new ModelAndView(viewName);
	  modelAndView.addObject("time",new Date().toLocaleString());
	  return modelAndView;
  }
}

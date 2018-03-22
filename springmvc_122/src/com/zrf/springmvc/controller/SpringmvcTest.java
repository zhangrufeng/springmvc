package com.zrf.springmvc.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class SpringmvcTest {
	private final static String SUCCESS="success";
	private final static String ERROR="error";
	@RequestMapping("/testExceptionHandlerExceptionResolver")
	public String testExceptionHandlerExceptionResolver(@RequestParam("i")int i){
		System.out.println("result:"+(10/i));
		return SUCCESS;
	}
//	@ExceptionHandler({RuntimeException.class})
//	public ModelAndView handlerArithmeticException2(Exception ex){
//		System.out.println("[出异常了]："+ex);
//		ModelAndView modelAndView=new ModelAndView(ERROR);
//		modelAndView.addObject("exception",ex);
//		return modelAndView;
//	}
//	@ExceptionHandler({ArithmeticException.class})
//	public ModelAndView handlerArithmeticException(Exception ex){
//		System.out.println("出异常了："+ex);
//		ModelAndView modelAndView=new ModelAndView(ERROR);
//		modelAndView.addObject("exception",ex);
//		return modelAndView;
//	}
}

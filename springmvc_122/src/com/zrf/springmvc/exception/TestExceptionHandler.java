package com.zrf.springmvc.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class TestExceptionHandler {
	private final static String ERROR="error";
	@ExceptionHandler({ArithmeticException.class})
	public ModelAndView handlerArithmeticException(Exception ex){
		System.out.println("---->出异常了："+ex);
		ModelAndView modelAndView=new ModelAndView(ERROR);
		modelAndView.addObject("exception",ex);
		return modelAndView;
	}
}

package com.zrf.springmvc.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class SpringmvcTest {
	
	@ResponseBody
	@RequestMapping("/testHttpMessageConverter")
	public String testHttpMessageConverter(@RequestBody String body){
		System.out.println(body);
		return "helloWord! "+ new Date();
	}
	
	@RequestMapping("/testResponseEntity")
	public ResponseEntity<byte[]>testResponseEntity(HttpSession session){
		byte[]body=null;
		ServletContext servletContext=session.getServletContext();
		InputStream in=servletContext.getResourceAsStream("/files/abc.txt");
		try {
			body=new byte[in.available()];
			in.read(body);
		} catch (IOException e) {
			e.printStackTrace();
		}
		HttpHeaders headers=new HttpHeaders();
		headers.add("Content-Disposition", "attachment;filename=abc.text");
		
		HttpStatus statusCode=HttpStatus.OK;
		ResponseEntity<byte[]>response=new ResponseEntity<byte[]>(body, headers, statusCode);
		return response;
	}
}

package com.zrf.springmvc.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class SpringmvcTest {
	private final static String SUCCESS = "success";
    
	@RequestMapping("/testFileUpload")
	public String testFileUpload(@RequestParam("desc")String desc,@RequestParam("file")MultipartFile file) {
		try {
			System.out.println("desc:"+desc);
			System.out.println("OriginalFilename:"+file.getOriginalFilename());
			System.out.println("InputStream:"+file.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}
}

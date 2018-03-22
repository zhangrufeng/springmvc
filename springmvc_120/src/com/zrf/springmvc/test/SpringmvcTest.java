package com.zrf.springmvc.test;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zrf.springmvc.dao.EmployeeDao;
import com.zrf.springmvc.entities.Employee;

@Controller
public class SpringmvcTest {
	@Autowired
	private EmployeeDao employeeDao;
	
	@ResponseBody
	@RequestMapping("/testJSON")
	public Collection<Employee> testJSON(){
		return employeeDao.getAll();
	}
	
	
   @RequestMapping("/testConversionServiceConver")
	public String testConverter(@RequestParam("employee")Employee employee){
	   System.out.println("save:"+employee);
	   employeeDao.save(employee);
	   return "redirect:/emps";
   }
}

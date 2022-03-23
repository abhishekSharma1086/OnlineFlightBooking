package com.boot.SpringBootApp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boot.SpringBootApp.pojo.Employee;

@RestController
//@RequestMapping("/controller")
public class SimpleController {
	
	@RequestMapping("/message")
	public String getMessage() {
		return "THis is SpringBoot APP";
	}
	
	//@RequestMapping(value="/object",method = RequestMethod.GET)
	@GetMapping("/object")
	public Employee getObject() {
		Employee emp = new Employee();
		emp.setId(400);
		emp.setName("RRR");
		return emp;
	}
}

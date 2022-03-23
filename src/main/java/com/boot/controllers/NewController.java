package com.boot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewController {
	@GetMapping("/mess")
	public String getMessage() {
		return "Hello";
	}
}

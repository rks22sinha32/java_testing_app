package com.example.testing.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestingClass {
	
	@GetMapping("/")
	public String devtestring() {
		return "this is new pattern of our website hosting our technology is help to someone";
	}

}

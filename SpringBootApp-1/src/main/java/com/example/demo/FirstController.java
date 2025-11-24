package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {
	
	@GetMapping("/greet")
	@ResponseBody
	public String printMessage() {
		return "Hello world!!!";
	}
	
	// Create another method "learnspringBoot()", which needs to print" Learning spring boot"
	
	@GetMapping("/learn")
	@ResponseBody
	public String learnSpringBoot() {
		return "Learning springboot";
	}
}

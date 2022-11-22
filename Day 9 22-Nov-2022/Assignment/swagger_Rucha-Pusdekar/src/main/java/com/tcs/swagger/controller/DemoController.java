package com.tcs.swagger.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@RequestMapping("/hello")
	public String Hello() {
		return "welcome to swagger";
	}
}

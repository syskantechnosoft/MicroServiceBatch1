package com.tcs.security.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@GetMapping("/api/v1")
	public String Welcome(@RequestParam(required = false, defaultValue = "Welcome User") String name,
			Principal principal) {
		return name + " : You are logged in as " + principal.getName() + "";
	}
}

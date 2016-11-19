package com.asd.kontacts.controller;

import org.springframework.web.bind.annotation.*;


@RestController
public class HelloController {

	@RequestMapping("/hello/{user}")
	public String sayHello( @PathVariable("user") String user) {
		if(user == null) { user = "Guest"; }
		return String.format("Hello %s!", user);
	}

	@RequestMapping("/")
	public String index() {
		return "Hello from Spring Boot!";
	}
}

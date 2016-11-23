package com.asd.kontacts.controller;

import org.springframework.web.bind.annotation.*;


@RestController
public class HelloController {

	@RequestMapping("/hello/{user}")
	public Greeting sayHello( @PathVariable("user") String user) {
		return new Greeting(user);
	}

	@RequestMapping("/hello")
	public Greeting index() {
		return new Greeting();
	}
}

class Greeting {
	private String content;
	private static final String template = "Hello, %s!";
	public Greeting() { this("Stranger"); }
	public Greeting(String user) { this.content = String.format(template, user); }
	public String getContent() { return content; }
	
}

package com.pulsate.intelligent_life.fbs.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

	@RequestMapping("/hello")
	public String helloWorld() {
		return "hello world!";
	}
}

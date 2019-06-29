package com.lichuan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@RequestMapping("aa")
	public String test() {
		return "Hello World";
	}
}

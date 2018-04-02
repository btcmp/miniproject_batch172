package com.bankmega.traning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/testmap")
public class MainController {

	@RequestMapping
	@ResponseBody
	public String index() {
		System.out.println("working loh.. ");
		return "ok.. jalan koq..";
	}
}

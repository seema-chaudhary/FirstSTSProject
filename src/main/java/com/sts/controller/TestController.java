package com.sts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	@RequestMapping("/test")
	@ResponseBody // without view text can be displayed
	public String testHandle()
	{
		return "This is test STS without view";
	}
	
	@RequestMapping("/test2")
	@ResponseBody // without view text can be displayed
	public String testHandle2()
	{
		return "This is test STS without view url test2";
	}
	
	@RequestMapping("/contact")
	public String contact()
	{
		return "contact";
	}

}

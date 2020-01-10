package com.MyApp.com.MyAPp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/MyApp/rest")
public class IndexController {
	@GetMapping
	public String index() {
		
		return "index ola";
	}

}

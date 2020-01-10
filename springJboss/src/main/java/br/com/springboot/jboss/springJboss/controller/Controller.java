package br.com.springboot.jboss.springJboss.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/springJboss")
public class Controller {
	@GetMapping
public String teste() {
	return "spring-boot funcionando no wildfly 10";
	
}
	@GetMapping("/outro")
public String teste2() {
	return "spring-boot funcionando no wildfly 10";
	
}
	
	
	

}

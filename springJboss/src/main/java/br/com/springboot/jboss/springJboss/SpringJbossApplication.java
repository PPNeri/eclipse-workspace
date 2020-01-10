package br.com.springboot.jboss.springJboss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class SpringJbossApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SpringJbossApplication.class, args);
	}
	@Override 
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return super.configure(builder);
	}

	
	
}

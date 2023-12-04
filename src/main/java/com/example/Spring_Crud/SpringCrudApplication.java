package com.example.Spring_Crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class SpringCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCrudApplication.class, args);
	}
	
	
	
	
	@GetMapping("/stdreg")
	public String index() {
		return "pages/login";
	}
	
	
	@GetMapping("/empregsave")
	public String empreg() {
		
		return "pages/login";
	}
	
	
	
	

}

package com.example.demo.com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class TouadiNesserineActivity5Application {

	public static void main(String[] args) {
		
		SpringApplication.run(TouadiNesserineActivity5Application.class, args);
	}
	
	@GetMapping("/")
	public String index(@RequestParam(value="nom", defaultValue = "Visiteur") String nom)
	{
	return String.format("Bonjour %s!", nom);
	}
	
	@GetMapping("/quitter")
	public String bye()
	{
	return String.format("Au revoir");
	}
	
	

}

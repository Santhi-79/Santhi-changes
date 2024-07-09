package com.appexmaple.Controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication()

public class ControllerApplication {
	


	public static void main(String[] args) {
		SpringApplication.run(ControllerApplication.class, args);
	}
	
		@GetMapping("/hello/{name}/{age}")
		public void insert(@PathVariable("name") String name, @PathVariable("age") int age) {
			System.out.println(name);
			System.out.println(age);
			
		}


}

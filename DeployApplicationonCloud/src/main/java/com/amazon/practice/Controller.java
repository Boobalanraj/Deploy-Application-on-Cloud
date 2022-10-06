package com.amazon.practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/")
	public String amazon() {
		return "Hi I am Boobalan, This Project Name is Deploy Application on Cloud Made with SpringBoot, It's working fine....";
	}
}

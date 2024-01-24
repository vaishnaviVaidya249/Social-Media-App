package com.vaishnavi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//This is the process to create API in spring boot
@RestController
public class HomeController {
	@GetMapping
	public String homeControllerHandler() {
		return "This is home controller";
	}
	
	@GetMapping("/home")//used to define the end point
	public String homeControllerHandler2() {
		return "This is home controller 2";
	}
	
	@GetMapping("/codewithvaishnavi")//used to define the end point
	public String homeControllerHandler3() {
		return "Hello code with vaishnavi";
	}

}

//@PostMapping
//@DeleteMapping
//@PutMapping

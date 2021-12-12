package com.nt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Customer;

@RestController
public class CustomerOperationsController {
	
	// we can take request mapping also here but to be specific used postmapping
	@PostMapping("/register")
	public String registerCustomer(@RequestBody Customer cust) {
		// i can see content that in the object format
		// if you want to see in json then take response entity
		return cust.toString();
	}
	
	
	/*@GetMapping("/access")
	public String getData() {
		return("helloworld");
	}*/
     
	// 415 error unupported media type error when do not added the jackson dependency
}

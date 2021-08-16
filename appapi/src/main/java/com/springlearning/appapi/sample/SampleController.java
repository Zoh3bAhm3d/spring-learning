package com.springlearning.appapi.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@Autowired
	SampleService sampleService;
	
	@GetMapping("/test")
	public String test() {
		
		return sampleService.test();
	}
	
	@GetMapping("/exception")
	public String exception() throws Exception {
		
		return sampleService.exception();
	}
}

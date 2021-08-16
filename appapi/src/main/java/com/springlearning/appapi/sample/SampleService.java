package com.springlearning.appapi.sample;

import org.springframework.stereotype.Service;


@Service
public class SampleService {


	public String test() {
		
		return "Hello World!";
	}
	
	
	public String exception() throws Exception {
		
		throw new Exception("Test exception.");
	}
}

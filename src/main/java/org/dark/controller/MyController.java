package org.dark.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping(value="/normalHello", method = RequestMethod.GET)
	public String normalHello() {
		return "Hello World";
	}
	
	@RequestMapping(value="/errorHello", method = RequestMethod.GET)
	public String errorHello() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "Error Hello World";
	}
}

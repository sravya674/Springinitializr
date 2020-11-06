package com.skillsoft.springinitializr.controller;
	import org.springframework.web.bind.annotation.*;

	@RestController
	public class HelloController {
		
		@GetMapping(value= "/")
		public String index() {
			return "this is the main page";
			}
		@GetMapping(value= "/welcome")
		public String welcome() {
			return "welcome to spring";
			}
		
		@GetMapping(value= "/home")
		public String home() {
			return "hello you are inside srping";
			}
	}




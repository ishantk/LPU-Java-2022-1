package com.auribises.session19;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path = "/auth")
public class WelcomeController { // Servlet for us :)
	
	final String APP_NAME = "eStore - Web App";

	@GetMapping("/welcome")
	public String welcomeUser(Model model) { // /welcome url pattern is mapped to user defined method welcomeUser
		
		// We are sharing some data which can be processed by the UI Page :)
		// But HTML is static and hence here Thymeleaf comes into picture :)
		model.addAttribute("appName", APP_NAME);
		
		// this is not returning of text
		// this is basically the name of html web page in templates directory
		return "welcome"; // -> return the template welcome.html, from templates directory
	}
	
	
	@GetMapping("/home")
	public String homeForUser() { // /home url pattern is mapped to user defined method homeForUser
		
		// this is not returning of text
		// this is basically the name of html web page in templates directory
		return "home"; // -> return the template home.html, from templates directory
	}
	
	@PostMapping("/register")
	public String registerUser(@RequestParam String name, @RequestParam String email, @RequestParam String password, Model model) {
		
		System.out.println("User Details for Registration: "+name+" "+email+" "+password);
		
		model.addAttribute("title", name);
		model.addAttribute("message", "Thank You for Registration!  Its:"+new Date());
		return "success";
	}
	
	@PostMapping("/login")
	public String loginUser(@RequestParam String email, @RequestParam String password, Model model) {
		
		System.out.println("User Details for Login: "+email+" "+password);
		String template = "";
		
		if(email.equals("admin@example.com") && password.equals("password123")) {
			model.addAttribute("title", email);
			model.addAttribute("message", "Thank You for Login!  Its:"+new Date());
			template = "success";
		}else {
			model.addAttribute("message", "Invalid Credentials. Please Try Again");
			template = "error";
		}
		
		
		return template;
	}
	
}

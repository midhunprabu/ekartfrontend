package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	//http://localhost:8080/ShoppingCart/
	
	@RequestMapping("/")
	public  String    goToHome(Model model)
	
	{
		model.addAttribute("message", "Thank you for visiting Shopping Cart");
		return "Home";
	}
	
	
	
	@RequestMapping("/LoginPage")
	public String loginPage(Model model)
	{
		model.addAttribute("isUserClickedLogin", "true");
	
		return "Home";
	}
	
	@RequestMapping("/RegistrationPage")
	public String registrationPage(Model model)
	{
		model.addAttribute("isUserClickedRegister", "true");
		
		return "Home";
	}

	@RequestMapping("/mendigiPage")
	public String mendigiPage(Model model)
	{
		model.addAttribute("isUserClickedDigital", "true");
		
		return "Home";
	}

	@RequestMapping("/menanalogPage")
	public String menanalogPage(Model model)
	{
		model.addAttribute("isUserClickedAnalog", "true");
		
		return "Home";
	}

	@RequestMapping("/colordialPage")
	public String colordialPage(Model model)
	{
		model.addAttribute("isUserClickedcolordials", "true");
		
		return "Home";
	}

	@RequestMapping("/sportyPage")
	public String sportyPage(Model model)
	{
		model.addAttribute("isUserClickedsporty", "true");
		
		return "Home";
	}
	
	

	@RequestMapping("/HomePage")
	public String homePage(Model model)
	{
		model.addAttribute("isUserClickedHome", "true");
		
		return "Home";
	}
	
}


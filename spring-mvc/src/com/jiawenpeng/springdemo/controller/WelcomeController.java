package com.jiawenpeng.springdemo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jiawen.service.WelcomeService;

@Controller
public class WelcomeController {

	@RequestMapping("/")
	public String doWelcome(Model model) {
		//1. retriving the processed data
		WelcomeService welcomeService = new WelcomeService();
		List<String> welcomeMessage = welcomeService.getWelcomeMessage("Vivian");
		
		//2. add the data to the model
		model.addAttribute("myWelcomeMessage", welcomeMessage);
		
		//3. return logical view name
		return "welcomeNew" ;
		
	}
}

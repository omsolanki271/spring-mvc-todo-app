package com.todo.controller;

import org.apache.coyote.http11.filters.SavedRequestInputFilter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model)
	{
		String str = "homepage";
		model.addAttribute("page",str);
		return "home";
	}
	
	@RequestMapping("/add")
	public String addTodo(Model model)
	{
		model.addAttribute("page", "addpage");
		return "home";
	}
}

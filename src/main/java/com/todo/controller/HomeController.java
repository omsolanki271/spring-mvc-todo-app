package com.todo.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.todo.entities.Todo;

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
		Todo t = new Todo();
		model.addAttribute("page", "addpage");
		model.addAttribute("todo", t);
		return "home";
	}
	
	@PostMapping("/savetodo")
	public String savedata(@ModelAttribute("todo") Todo t,Model model)
	{
		System.out.println(t);
		t.setDate(new Date());
		model.addAttribute("page", "homepage");
		return "home";
	}
}

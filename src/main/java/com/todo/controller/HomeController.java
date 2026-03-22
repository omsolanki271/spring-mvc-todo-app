package com.todo.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.todo.entities.Todo;

@Controller
public class HomeController {

	@Autowired
	ServletContext context;
	
	@RequestMapping("/home")
	public String home(Model model)
	{
		String str = "homepage";
		model.addAttribute("page",str);
				 
		List<Todo> list = (List<Todo>) context.getAttribute("list");
        if (list == null) {
            list = new ArrayList<>();
        }

        model.addAttribute("showtodo", list);
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
	public String savedata(@ModelAttribute("todo") Todo t,Model model,RedirectAttributes redirectAttributes)
	{
		t.setDate(new Date());
		System.out.println(t);
		 List<Todo> list = (List<Todo>) context.getAttribute("list");

	        if (list == null) {
	            list = new ArrayList<>();
	        }

	        list.add(t);
	        
	    context.setAttribute("list", list);
	    
	    redirectAttributes.addFlashAttribute("msg", "Todo Added Successfully!");

		return "redirect:/home";
	}
	
	
}


package com.example.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PeopleController {
	
	@Autowired
	private PeopleService ps;
	
	@RequestMapping("/hello")
	@ResponseBody//turns value into Json to make it a restAPI controller
	public String sayHello() {
		return ps.sayHello();
	}
	
	@RequestMapping("/people")
	@ResponseBody
	public ArrayList<People> getList() {
		return ps.getList();
	}
	
	@RequestMapping("/")
	public String start() {
		return "index.html";
	}
	
	@RequestMapping("/people-table")
	public String getTable(Model model) {
		model.addAttribute("people", ps.getList());
		return "table.html";
	}
	
	@RequestMapping("/register-page")
	public String register(Model model) {
		People people = new People();
		model.addAttribute("people", people);
		return "register.html";
	}
	
	@RequestMapping(value="/register", method = RequestMethod.POST)
	public String registerDone(@ModelAttribute("people") People people) {
		ps.addPerson(people);
		return "redirect:/people-table";
	}
	
	@GetMapping("/delete-registered")
	public String deleteregister(@RequestParam int peopleid) {
		ps.deletePerson(peopleid);
		return "redirect:/people-table";
	}
	
	
	
}

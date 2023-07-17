package com.example.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

@Service
public class PeopleService {
	
	@Autowired
	private People people;
	private ArrayList<People> list = new ArrayList<>();
	
	
	
	public PeopleService(People people) {
		list.add((new People("Ali", 32, "Male", "Web Developer")));
		list.add((new People("Dana", 25, "Female", "Pharmacist")));
		list.add((new People("Ahmad", 27, "Male", "Engineer")));
		list.add((new People("Tala", 29, "Female", "Journalist")));
	}
	
	public String sayHello() {
		return "People Controller says hello!!";
	}

	public ArrayList<People> getList() {
		return list;
	}

	public void addPerson(People people) {
		list.add(people);
		
	}

}

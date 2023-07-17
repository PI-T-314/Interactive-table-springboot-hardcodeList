package com.example.demo;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

@Service
public class PeopleService {
	
	@Autowired
	private People people;
	private ArrayList<People> list = new ArrayList<>();
	
	
	
	public PeopleService(People people) {
		list.add((new People(12, "Ali", 32, "Male", "Web Developer")));
		list.add((new People(132, "Dana", 25, "Female", "Pharmacist")));
		list.add((new People(445, "Ahmad", 27, "Male", "Engineer")));
		list.add((new People(68, "Tala", 29, "Female", "Journalist")));
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

	public void deletePerson(int people) {
		
		for(int i=0; i<list.size();i++) {
			if(people == list.get(i).getId()) {
				list.remove(i);
			}
		}
		
	}

}

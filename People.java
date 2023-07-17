package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class People {
	
	private int id;
	private String name;
	private int age;
	private String gender;
	private String occupation;
	
	
	
	
	public People() {
		super();
	}


	public People(int id, String name, int age, String gender, String occupation) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.occupation = occupation;
	}
	
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}


	@Override
	public String toString() {
		return "People [name=" + name + ", age=" + age + ", gender=" + gender + ", occupation=" + occupation + "]";
	}
	
	
	
	

}

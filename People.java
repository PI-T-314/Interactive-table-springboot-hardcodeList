package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class People {
	
	private String name;
	private int age;
	private String gender;
	private String occupation;
	
	
	
	
	public People() {
		super();
	}


	public People(String name, int age, String gender, String occupation) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.occupation = occupation;
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

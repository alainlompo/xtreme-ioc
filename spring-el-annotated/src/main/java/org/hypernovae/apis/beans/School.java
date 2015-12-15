package org.hypernovae.apis.beans;

import org.springframework.stereotype.Component;

@Component("schoolBean")
public class School {
	
	private String name = "Harvard";
	private int age = 100;
	private Adress adress;
	
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
	public Adress getAdress() {
		return adress;
	}
	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	
	public School() {
		adress = new Adress();
		adress.setOtherDetails("N/A");
		adress.setTown("GreenMount");
		adress.setPostalCode("20100");
		adress.setStreet("Tarudant");
	}
	

}

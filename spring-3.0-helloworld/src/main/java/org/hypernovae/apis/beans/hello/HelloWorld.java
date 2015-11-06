package org.hypernovae.apis.beans.hello;

public class HelloWorld {
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void printHello() {
		System.out.println("Hello world.... we are coming ...." + name);
	}

}

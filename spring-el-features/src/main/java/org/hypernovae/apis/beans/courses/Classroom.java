package org.hypernovae.apis.beans.courses;

public class Classroom {
	
	private String name;
	private int capacity;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public String toString() {
		return "Name: " + name +", capacity; " + capacity;
	}
}

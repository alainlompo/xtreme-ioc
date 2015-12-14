package org.hypernovae.apis.beans.courses;

public class Module {
	
	private String name;
	private int durationInDays;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDurationInDays() {
		return durationInDays;
	}
	public void setDurationInDays(int durationInDays) {
		this.durationInDays = durationInDays;
	}
	
	public String toString() {
		return "Name: " + name + ", duration: " + durationInDays + " dats";
	}

}

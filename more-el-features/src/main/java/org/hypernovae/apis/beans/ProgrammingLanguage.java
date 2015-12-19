package org.hypernovae.apis.beans;

public class ProgrammingLanguage {
	
	
	private String name;
	private int creationYear;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getCreationYear() {
		return creationYear;
	}
	
	public void setCreationYear(int creationYear) {
		this.creationYear = creationYear;
	}
	
	public ProgrammingLanguage(String name, int creationYear) {
		super();
		this.name = name;
		this.creationYear = creationYear;
	}
	

}

package org.hypernovae.apis.beans.collectible;

public class Employee {

	private String firstName;
	private String lastName;
	private String empID;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	
	public String toString() {
		return "firstName and LastName :" + firstName + " " + lastName + ", ID :" + empID;
	}
	
}

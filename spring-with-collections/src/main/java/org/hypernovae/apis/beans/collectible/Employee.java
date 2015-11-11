package org.hypernovae.apis.beans.collectible;

import java.util.Date;

public class Employee {

	private String firstName;
	private String lastName;
	private String empID;
	private Date birthDate;
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
	
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String toString() {
		return "firstName and LastName :" + firstName + " " + lastName + ", ID :" + empID + ((birthDate != null)?" birthDate :" + birthDate.toString():"");
	}
	
}

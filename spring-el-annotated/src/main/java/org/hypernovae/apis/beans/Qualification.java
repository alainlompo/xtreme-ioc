package org.hypernovae.apis.beans;

import org.springframework.stereotype.Component;

@Component("qualificationBean")
public class Qualification {
	
	private String qualification = "PhD";
	private int numberOfYearsOfStudy = 12;
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getNumberOfYearsOfStudy() {
		return numberOfYearsOfStudy;
	}
	public void setNumberOfYearsOfStudy(int numberOfYearsOfStudy) {
		this.numberOfYearsOfStudy = numberOfYearsOfStudy;
	}
	
	

}

package org.hypernovae.apis.beans;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("teacherBean")
public class Teacher {
	
	@Value("#{qualificationBean}")
	private Qualification qualification;
	
	@Value("#{qualificationBean.qualification}")
	private String qualificationTitle;
	
	@Value("#{schoolBean.adress.postalCode}")
	private String postalCode;

	public Qualification getQualification() {
		return qualification;
	}

	public void setQualification(Qualification qualification) {
		this.qualification = qualification;
	}

	public String getQualificationTitle() {
		return qualificationTitle;
	}

	public void setQualificationTitle(String qualificationTitle) {
		this.qualificationTitle = qualificationTitle;
	}
	
	
	
	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String toString() {
		return "Qualification : " + qualificationTitle + ", number of years of study: " + qualification.getNumberOfYearsOfStudy();
		
	}

}

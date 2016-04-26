package org.hypernovae.apis.domain;

import java.math.BigDecimal;

public class ProfessionalTraining extends OrderItem {
	private int durationInDays;
	private String title;
	private String technology;
	public int getDurationInDays() {
		return durationInDays;
	}
	public void setDurationInDays(int durationInDays) {
		this.durationInDays = durationInDays;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public ProfessionalTraining(int durationInDays, String title,
			String technology) {
		super();
		this.durationInDays = durationInDays;
		this.title = title;
		this.technology = technology;
	}
	
	public ProfessionalTraining(int durationInDays, String title,
			String technology, BigDecimal price) {
		super(price);
		this.durationInDays = durationInDays;
		this.title = title;
		this.technology = technology;
	}
	
	public ProfessionalTraining() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProfessionalTraining(BigDecimal price) {
		super(price);
		// TODO Auto-generated constructor stub
	}
	
	
}

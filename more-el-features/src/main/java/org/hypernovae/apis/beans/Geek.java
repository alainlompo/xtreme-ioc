package org.hypernovae.apis.beans;

import java.util.ArrayList;
import java.util.List;

public class Geek {
	
	private List<ProgrammingLanguage> skills = new ArrayList<ProgrammingLanguage>();
	
	public void addSkill(ProgrammingLanguage skill) {
		skills.add(skill);
	}

	public Geek() {
		super();
	}
	
	private boolean javaSkill;
	private boolean dotNetSkill;
	private boolean javaScriptSkill;
	private boolean grailSkill;

	public List<ProgrammingLanguage> getSkills() {
		return skills;
	}

	public void setSkills(List<ProgrammingLanguage> skills) {
		this.skills = skills;
	}

	public boolean isJavaSkill() {
		return javaSkill;
	}

	public void setJavaSkill(boolean javaSkill) {
		this.javaSkill = javaSkill;
	}

	public boolean isDotNetSkill() {
		return dotNetSkill;
	}

	public void setDotNetSkill(boolean dotNetSkill) {
		this.dotNetSkill = dotNetSkill;
	}

	public boolean isJavaScriptSkill() {
		return javaScriptSkill;
	}

	public void setJavaScriptSkill(boolean javaScriptSkill) {
		this.javaScriptSkill = javaScriptSkill;
	}

	public boolean isGrailSkill() {
		return grailSkill;
	}

	public void setGrailSkill(boolean grailSkill) {
		this.grailSkill = grailSkill;
	}
	
	
	
	

}

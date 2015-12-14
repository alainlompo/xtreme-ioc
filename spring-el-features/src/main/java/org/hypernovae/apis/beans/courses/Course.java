package org.hypernovae.apis.beans.courses;

import java.util.List;

public class Course {
	
	private List<Module> modules;
	private String title;
	private int maximumClassSize;

	public List<Module> getModules() {
		return modules;
	}

	public void setModules(List<Module> modules) {
		this.modules = modules;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getMaximumClassSize() {
		return maximumClassSize;
	}

	public void setMaximumClassSize(int maximumClassSize) {
		this.maximumClassSize = maximumClassSize;
	}

}

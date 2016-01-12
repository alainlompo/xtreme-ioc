package org.hypernovae.apis.beans;

public class TrainingModule {
	
	private int moduleId;
	private String moduleName;
	private int moduleDurationInDays;
	
	public TrainingModule() {
		
	}
	
	public TrainingModule(int moduleId, String moduleName, int mDInDays) {
		this.moduleId = moduleId;
		this.moduleName = moduleName;
		this.moduleDurationInDays = mDInDays;
	}
	
	public int getModuleId() {
		return moduleId;
	}
	public void setModuleId(int moduleId) {
		this.moduleId = moduleId;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public int getModuleDurationInDays() {
		return moduleDurationInDays;
	}
	public void setModuleDurationInDays(int moduleDurationInDays) {
		this.moduleDurationInDays = moduleDurationInDays;
	}
	
	public String toString() {
		return String.format("ID: %d, module name: %s, module duration: %d days", moduleId, moduleName, moduleDurationInDays);
				
	}
}

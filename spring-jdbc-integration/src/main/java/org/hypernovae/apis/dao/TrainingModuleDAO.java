package org.hypernovae.apis.dao;

import java.util.List;

import org.hypernovae.apis.beans.TrainingModule;

public interface TrainingModuleDAO {
	
	public void insert(TrainingModule module);
	public TrainingModule findByTrainingModuleId(int moduleId);
	public List<TrainingModule> findAll();
	

}

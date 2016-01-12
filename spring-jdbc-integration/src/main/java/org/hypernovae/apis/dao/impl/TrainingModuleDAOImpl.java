package org.hypernovae.apis.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.hypernovae.apis.beans.TrainingModule;
import org.hypernovae.apis.dao.TrainingModuleDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TrainingModuleDAOImpl implements TrainingModuleDAO {
	
	private final Logger LOGGER = LoggerFactory.getLogger(TrainingModuleDAO.class);
	private final String INSERT_STATEMENT = 
			"INSERT INTO TRAININGMODULE (MODULE_ID, MODULE_NAME, DURATION_IN_DAYS) " +
			"VALUES (?, ?, ?)";
	private final String FIND_QUERY = "SELECT * FROM TRAININGMODULE WHERE MODULE_ID = ?";
	private final String FIND_ALL_QUERY = "SELECT * FROM TRAININGMODULE";
	private DataSource dataSource;
	
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void insert(TrainingModule module) {
		Connection connection = null;
		try {
			connection = dataSource.getConnection();
			PreparedStatement ps = connection.prepareStatement(INSERT_STATEMENT);
			ps.setInt(1, module.getModuleId());
			ps.setString(2, module.getModuleName());
			ps.setInt(3, module.getModuleDurationInDays());
			ps.executeUpdate();
			ps.close();
			
		} catch (SQLException sE) {
			
			LOGGER.error("An exception occured " + sE.getMessage());
		} finally {
			if (connection != null) {
				try {
					connection.close();
					
				} catch (Exception ex) {
					
				}
			}
		}
		
		
	}

	public TrainingModule findByTrainingModuleId(int moduleId) {
		Connection connection = null;
		TrainingModule module = null;
		try {
			connection = dataSource.getConnection();
			PreparedStatement ps = connection.prepareStatement(FIND_QUERY);
			ps.setInt(1, moduleId);
			ResultSet rS = ps.executeQuery();
			if (rS.next()) {
				module = new TrainingModule(rS.getInt("MODULE_ID"),
						                    rS.getString("MODULE_NAME"),
						                    rS.getInt("DURATION_IN_DAYS"));
				
			}
			rS.close();
			ps.close();
			
		} catch (SQLException sE) {
			
			LOGGER.error("An exception occured " + sE.getMessage());
		} finally {
			if (connection != null) {
				try {
					connection.close();
					
				} catch (Exception ex) {
					
				}
			}
		}
		return module;
	}

	public List<TrainingModule> findAll() {
		
		Connection connection = null;
		List<TrainingModule> modules = new ArrayList<TrainingModule>();
		try {
			connection = dataSource.getConnection();
			PreparedStatement ps = connection.prepareStatement(FIND_ALL_QUERY);
			
			ResultSet rS = ps.executeQuery();
			while (rS.next()) {
				modules.add( new TrainingModule(rS.getInt("MODULE_ID"),
						                    rS.getString("MODULE_NAME"),
						                    rS.getInt("DURATION_IN_DAYS")));
				
			}
			rS.close();
			ps.close();
			
		} catch (SQLException sE) {
			
			LOGGER.error("An exception occured " + sE.getMessage());
		} finally {
			if (connection != null) {
				try {
					connection.close();
					
				} catch (Exception ex) {
					
				}
			}
		}
		return modules;
	}

}

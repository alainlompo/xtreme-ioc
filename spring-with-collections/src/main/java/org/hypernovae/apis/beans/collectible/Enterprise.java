package org.hypernovae.apis.beans.collectible;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Enterprise {
	
	private List<Employee> employees;
	private Set<Service> services;
	
	private Map<Service, List<Employee>> organisationMap;

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Set<Service> getServices() {
		return services;
	}

	public void setServices(Set<Service> services) {
		this.services = services;
	}

	public Map<Service, List<Employee>> getOrganisationMap() {
		return organisationMap;
	}

	public void setOrganisationMap(Map<Service, List<Employee>> organisationMap) {
		this.organisationMap = organisationMap;
	}
	
	public String toString() {
		return "Employees: " + employees + " \n"
				+ "Services: " + services + " \n"
				+ "Organisation: " + organisationMap + " \n";
	}
	
	

}

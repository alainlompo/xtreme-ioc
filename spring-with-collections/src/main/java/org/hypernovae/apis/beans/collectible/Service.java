package org.hypernovae.apis.beans.collectible;

public class Service {
	
	private String serviceName;
	private String serviceDescription;
	
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getServiceDescription() {
		return serviceDescription;
	}
	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
	}
	
	public String toString() {
		return "service name :" + serviceName + ", description :" + serviceDescription;
	}
	

}

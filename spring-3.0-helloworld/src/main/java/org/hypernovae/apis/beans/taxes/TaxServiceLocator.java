package org.hypernovae.apis.beans.taxes;

import org.hypernovae.apis.beans.hello.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TaxServiceLocator {
	
ApplicationContext context;
	
	public TaxServiceLocator() {
		context = new ClassPathXmlApplicationContext("beans.xml");
	}
	
	public TaxService getTaxService() {
		TaxService service = (TaxService)context.getBean("taxService");
		return service;
	}

}

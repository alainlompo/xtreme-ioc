package org.hypernovae.apis.beans.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class HelloWorldServiceLocator {

	ApplicationContext context;
	
	public HelloWorldServiceLocator() {
		context = new ClassPathXmlApplicationContext("beans.xml");
	}
	
	public HelloWorld getHelloWorldObject() {
		HelloWorld obj = (HelloWorld)context.getBean("helloWorldBean");
		return obj;
	}

}

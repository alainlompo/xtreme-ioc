package org.hypernovae.apis.beans.pcs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PCMountingServiceDemo {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		PC pc = (PC)context.getBean("hashPPC");
		pc.getProvidedOS().runPC();
	}

}

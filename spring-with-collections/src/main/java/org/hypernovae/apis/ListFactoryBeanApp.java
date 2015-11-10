package org.hypernovae.apis;

import org.hypernovae.apis.beans.collectible.Shop;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ListFactoryBeanApp {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-listfactorybean-config.xml");
        Shop myShop = (Shop)context.getBean("shopBean");
        System.out.println(myShop);
	}

}

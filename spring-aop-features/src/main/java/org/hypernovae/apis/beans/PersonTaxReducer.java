package org.hypernovae.apis.beans;

import java.lang.reflect.Method;

import org.hypernovae.apis.AppManager;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTaxReducer implements MethodBeforeAdvice {

	public void before(Method method, Object[] arg1, Object target)
			throws Throwable {
		System.out.println("The system is kind toward persons it will reduce a person's tax rate...");
		TaxUtils.setTaxInPercent(15);
		
		
	}

}

package org.hypernovae.apis;

import org.hypernovae.apis.beans.Corporation;
import org.hypernovae.apis.beans.Person;
import org.hypernovae.apis.beans.TaxPaymentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext appContext = new ClassPathXmlApplicationContext(
        		new String[] {"spring-aop-config.xml"}
        		);
        
        // Configure the app manager
        assert AppManager.getAppManager(appContext)  != null;
        
        Person person = (Person)appContext.getBean("personBean");
        Corporation corporate = (Corporation)appContext.getBean("corporationBean");
        
        //TODO: The original call is hereby commented
        //TaxPaymentService taxService = (TaxPaymentService)appContext.getBean("taxServiceBean");
        
        // TODO: now the call via the proxy
        // TODO: switch between the use of the proxy and the normal use to see the difference
        // TODO that the methodBeforeAdvice occures 4 times because we invoke two methods of the target
        // TODO: class for two different objects
        TaxPaymentService taxService = (TaxPaymentService)appContext.getBean("taxServiceProxy");
        int personTax = taxService.generateTaxToPay(person);
        int corporateTax = taxService.generateTaxToPay(corporate);
        System.out.println("person taxes :" + personTax);
        taxService.printPayerInfos(person);
        System.out.println("corporation taxes: " + corporateTax);
        taxService.printPayerInfos(corporate);
        
        
    }
}

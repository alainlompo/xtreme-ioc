package org.hypernovae.apis;

import org.hypernovae.apis.modules.services.Serviceable;
import org.hypernovae.apis.modules.traders.SingleCustomerTrader;
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
        System.out.println( "Hello World! Let's experience modularity.... by example...." );
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"traders.xml"});
        SingleCustomerTrader superTrader = (SingleCustomerTrader)context.getBean("superTrader");
        Serviceable traderValueService = superTrader.getValueService();
        System.out.println("The value service name: " + traderValueService.getServiceName());
        System.out.println("Description: " + traderValueService.getServiceDescription());
    }
}

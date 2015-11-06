package org.hypernovae.apis;

import org.hypernovae.apis.beans.hello.HelloWorld;
import org.hypernovae.apis.beans.hello.HelloWorldServiceLocator;
import org.hypernovae.apis.beans.taxes.TaxService;
import org.hypernovae.apis.beans.taxes.TaxServiceLocator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        HelloWorldServiceLocator serviceLocator = new HelloWorldServiceLocator();
        HelloWorld helloInstance = serviceLocator.getHelloWorldObject();
        helloInstance.printHello();
        
        TaxServiceLocator taxServiceLocator = new TaxServiceLocator();
        TaxService service = taxServiceLocator.getTaxService();
        double value = 545250.0D;
        String msg = "The amount of taxes for " + value + " is " + service.getTaxAmountFor(value);
        System.out.println(msg);
        
        
        
    }
}

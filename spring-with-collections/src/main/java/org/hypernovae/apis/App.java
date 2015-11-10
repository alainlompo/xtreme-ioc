package org.hypernovae.apis;

import org.hypernovae.apis.beans.collectible.Enterprise;
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
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Enterprise hypnv = (Enterprise)context.getBean("company");
        System.out.println(hypnv);
        
    }
}

package org.hypernovae.apis;

import org.hypernovae.apis.beans.Geek;
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
    	ApplicationContext context = new ClassPathXmlApplicationContext("el_based_config.xml");
    	Geek theAlmGeek =(Geek) context.getBean("theAlmGeekBean");
    	
    	System.out.println("Does our geek have java skill? " + theAlmGeek.isJavaSkill());
    	System.out.println("Does our geek have dot net skill?" + theAlmGeek.isDotNetSkill());
    	System.out.println("Does our geek have grail skill?" + theAlmGeek.isGrailSkill());
        
    }
}

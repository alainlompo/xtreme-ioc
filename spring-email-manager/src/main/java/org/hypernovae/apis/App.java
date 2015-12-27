package org.hypernovae.apis;

import org.hypernovae.apis.services.MailManager;
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
    	ApplicationContext context = new ClassPathXmlApplicationContext("email-management-config.xml");
    	MailManager manager = (MailManager)context.getBean("mailManager");
    	manager.sendMail("alain.lompo@gmail.com", "alain.lompo@zoho.com", "Hello world", "Hello world,\n a new day has dawn on you, bless the Lord.");
    	
    	
        
    }
}

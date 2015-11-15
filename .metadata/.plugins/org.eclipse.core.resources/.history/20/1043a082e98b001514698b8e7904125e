package org.hypernovae.apis;

import java.util.Scanner;

import org.hypernovae.apis.beans.messaging.MessagingService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ConfigurableApplicationContext context =
        		new ClassPathXmlApplicationContext(new String[] {"spring-lifecycle-config.xml"});
        MessagingService mS = (MessagingService)context.getBean("messagingService");
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        System.out.println("executing command...." + command);
        System.out.println("exiting...");
        
    }
}

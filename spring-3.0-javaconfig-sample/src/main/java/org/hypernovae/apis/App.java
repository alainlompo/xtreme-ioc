package org.hypernovae.apis;

import java.util.Scanner;

import org.hypernovae.apis.beans.predicate.Predicate;
import org.hypernovae.apis.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("unchecked")
	public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Predicate<Integer> predicate = (Predicate<Integer>)context.getBean("predicateBean");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number: type exit to finish");
        String data;
        while (true) {
        	data = sc.next();
        	if ("exit".equalsIgnoreCase(data)) {
        		System.out.println("Exiting....");
        		break;
        	}
        	
        	int dataValue = Integer.parseInt(data);
        	String msg = "This number is " + ((!predicate.test(dataValue))?"not ":"" ) + "even";
        	System.out.println(msg);
        }
    }
}

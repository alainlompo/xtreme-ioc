package org.hypernovae.apis;

import org.hypernovae.apis.beans.Teacher;
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
        ApplicationContext context = new ClassPathXmlApplicationContext("auto_scan_config.xml");
        Teacher teacher = (Teacher)context.getBean("teacherBean");
        System.out.println("The teacher...:" + teacher);
        System.out.println("His postal code: " + teacher.getPostalCode());
        
    }
}

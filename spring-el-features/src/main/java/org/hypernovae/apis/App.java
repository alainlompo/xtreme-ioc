package org.hypernovae.apis;
import org.hypernovae.apis.beans.courses.Classroom;
import org.hypernovae.apis.beans.courses.Module;
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
        Module module = (Module)context.getBean("moduleBean");
        Classroom classRoom = (Classroom) context.getBean("classRoomBean");
        System.out.println("We are taking the module :" + module);
        System.out.println("We are using the classroom: " + classRoom);
        
    }
}

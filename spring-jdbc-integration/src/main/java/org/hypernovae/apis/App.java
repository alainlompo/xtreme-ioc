package org.hypernovae.apis;

import java.util.List;

import org.hypernovae.apis.beans.TrainingModule;
import org.hypernovae.apis.dao.impl.TrainingModuleDAOImpl;
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
        ApplicationContext context =
        		new ClassPathXmlApplicationContext("spring/spring-config.xml");
        TrainingModuleDAOImpl moduleDAO = (TrainingModuleDAOImpl)context.getBean("trainingModuleBean");
        TrainingModule javaModule = new TrainingModule(1, "Java Language Programming", 5);
        TrainingModule webCompModule = new TrainingModule(2, "Developping web apps with Servlets and Jsp", 5);
        
        moduleDAO.insert(javaModule);
        moduleDAO.insert(webCompModule);
        
        
        TrainingModule foundModule = moduleDAO.findByTrainingModuleId(2);
        System.out.println("The module with id 2 is:::" + foundModule);
        
        List<TrainingModule> allModules = moduleDAO.findAll();
        System.out.println("Printing all modules details");
        for (TrainingModule tM: allModules) {
        	System.out.println(tM);
        }
        
        
    }
}

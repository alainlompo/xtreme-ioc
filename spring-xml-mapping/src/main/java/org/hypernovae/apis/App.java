package org.hypernovae.apis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.hypernovae.apis.beans.Superbike;
import org.hypernovae.apis.beans.XmlOmHandler;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("xml-to-object-config.xml");
        XmlOmHandler handler = (XmlOmHandler)context.getBean("xmlOmHandler");
        
        Superbike sB = new Superbike();
        sB.setAssistedDirection(true);
        sB.setMaximumSpeed(75);
        sB.setNumberOfGears(16);
        
        handler.fromObjectToXml(sB, "xmlmadeobject.xml");
        BufferedReader reader = new BufferedReader(new FileReader("xmlmadeobject.xml"));
        System.out.println("Xml file content:");
        String line = null;
        int number = 0;
        while ( (line = reader.readLine()) != null) {
        	System.out.println((number++) + ":" + line);
        }
        
        reader.close();
        System.out.println();
        
        Superbike bike2 = (Superbike)handler.fromXmlToObject("xmlmadeobject.xml");
        assert bike2 != null;
        assert bike2.getMaximumSpeed() == sB.getMaximumSpeed();
        assert bike2.getNumberOfGears() == sB.getNumberOfGears();
        assert bike2.isAssistedDirection() == sB.isAssistedDirection();
        
        System.out.println("The original object is equal to the one read from the xml file...");
        
    }
}

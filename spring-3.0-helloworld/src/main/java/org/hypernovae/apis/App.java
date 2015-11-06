package org.hypernovae.apis;

import org.hypernovae.apis.beans.hello.HelloWorld;
import org.hypernovae.apis.beans.hello.HelloWorldServiceLocator;

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
        
        
    }
}

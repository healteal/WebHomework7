package org.example;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
        context.getBean("iphone", Iphone.class).incomingCall();
        context.getBean("samsung", Samsung.class).outgoingCall();
    }
}

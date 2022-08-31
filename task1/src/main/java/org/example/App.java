package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        AutoFactory autoFactory = context.getBean("autoFactory", AutoFactory.class);
        AutoFactory autoFactory1 = context.getBean("autoFactory1", AutoFactory.class);
        int sedansBuilt = autoFactory.runProduction();
        int cabrioletsBuilt = autoFactory1.runProduction();
        System.out.println((sedansBuilt + cabrioletsBuilt) + " cars built in total");
    }
}

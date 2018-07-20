package com.jiawenpeng.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCchagllege {
	
	public static void main(String[] args) {
		//create the application context (container)
		
//		ApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
		
		//use classpath instead
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-challenge.xml");
		//create the bean
		
		City city = (City) ctx.getBean("mcity");
		
		//invoke the city name method
		
		city.cityName();
		
		//close the application
		
		((ClassPathXmlApplicationContext) ctx).close();
	}
}

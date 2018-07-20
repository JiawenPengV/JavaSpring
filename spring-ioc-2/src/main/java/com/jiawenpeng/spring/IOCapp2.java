package com.jiawenpeng.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCapp2 {
	
	public static void main(String[] args) {
		//create the application context (container)
		
//		ApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
		
		//use classpath instead
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		//create the bean
		
		Organization org = (Organization) ctx.getBean("myorg");
		
		//invoke the slogan from the bean
		
		org.makeSlogan();
		
		//close the application
		
		((ClassPathXmlApplicationContext) ctx).close();
	}
}

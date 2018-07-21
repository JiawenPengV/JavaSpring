package com.jiawen.service;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is providing the service to build welcome messgae to the request attributions
 * @author jiawenpeng
 *
 */
public class WelcomeService {
	
	/**
	 * build the welcome message string list
	 * @param name the input user name
	 * @return welcome message in string list 
	 */
	public List<String> getWelcomeMessage(String name) {
		List<String> myWelcomeMessage = new ArrayList<>();
		
		//add the data to the list
		myWelcomeMessage.add("Hello !");
		myWelcomeMessage.add(name);
		myWelcomeMessage.add("It's glad to see you!");
		
		return myWelcomeMessage;
	}
}

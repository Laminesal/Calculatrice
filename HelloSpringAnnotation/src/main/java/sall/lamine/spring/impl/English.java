package sall.lamine.spring.impl;

import sall.lamine.spring.lang.Language;

public class English implements Language {

	@Override
	public String getGreeting() {
		
		return "Hello";
	}

	@Override
	public String getBye() {
		
		return "Bye bye";
	}
	
	

}

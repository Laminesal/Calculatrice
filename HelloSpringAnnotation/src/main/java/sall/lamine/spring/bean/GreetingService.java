package sall.lamine.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sall.lamine.spring.lang.Language;

/**
 * @Service est une annotation qui sert à annoter sur une classe pour informer Spring que la classe est un Spring BEAN.
 * 
 * 
 * @Autowired est annoté sur un champ (field) pour informer Spring qui injecte (inject) de la valeur dans le champ. Notez que la signification du terme "injecter" est similaire à attribuer une valeur à ce champ.
 * */

@Service
public class GreetingService {
	
	
@Autowired
	private Language language;

public GreetingService() {
	
}
public void sayGreeting() {
	
	String greeting = language.getGreeting();
	System.out.println("Greeting" + greeting);
}
	

}

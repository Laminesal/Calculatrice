package sall.lamine.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Component est une annotation qui sert à annoter sur une class
 * pour informer Spring que la classe est un Spring BEAN.
 * 
 * @Autowired est annoté sur un champ (field) 
 * pour informer Spring qui injecte (inject) de la valeur dans le champ. 
 * Note: La signification du terme "injecter" est similaire à attribuer une valeur à ce champ.
 * 
 * */

@Component
public class MyComponent {

	@Autowired
	private MyRepository repository;
	
	public void showAppInfo() {
	
		System.out.println("Now is"+ repository.getSystemDateTime());
		System.out.println("App Name"+ repository.getAppName());
	}
	

}
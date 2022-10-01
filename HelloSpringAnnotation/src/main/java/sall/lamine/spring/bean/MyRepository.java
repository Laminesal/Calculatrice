package sall.lamine.spring.bean;

import java.util.Date;

import org.springframework.stereotype.Repository;
/**
 * @Repository est une annotation qui sert à annoter sur une classe 
 * pour informer Spring que la classe est un Spring BEAN.
 * 
 * */

@Repository
public class MyRepository {


	public String getAppName() {
		return "Hello Spring App";
	}
	
	public Date getSystemDateTime() {
		return new Date();
	}
}

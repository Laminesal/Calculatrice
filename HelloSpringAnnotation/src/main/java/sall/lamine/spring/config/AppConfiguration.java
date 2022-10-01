package sall.lamine.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import sall.lamine.spring.impl.Vietnamese;
import sall.lamine.spring.lang.Language;

/**
 * 
 * @Configuration est une annotation qui est annotée dans une classe définissant Spring BEAN.
 * @ComponentScan - fournit un rapport à Spring sur les package pour rechercher des autres Spring BEAN, Spring scannera (scan) les packages à rechercher.
 * */

@Configuration
@ComponentScan({"sall.lamine.spring.bean"})

public class AppConfiguration {
	
	@Bean(name="langage")
	public Language getLanguage() {
		return new Vietnamese();		
	}
}

package org.hypernovae.apis.config;

import org.hypernovae.apis.beans.predicate.Predicate;
import org.hypernovae.apis.beans.predicate.impl.EvenNumberPredicate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean(name="predicateBean")
	public Predicate<Integer> demoPredicate() {
		return new EvenNumberPredicate();
	}
	

	
}

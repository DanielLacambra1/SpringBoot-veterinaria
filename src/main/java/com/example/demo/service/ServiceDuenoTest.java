package com.example.demo.service;

import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("Test")
public class ServiceDuenoTest extends serviceDuenoAbstract{
	
	Logger l = org.apache.logging.log4j.LogManager.getLogger();

	public ServiceDuenoTest() {
		colorPiel = "blanco";
	}
}

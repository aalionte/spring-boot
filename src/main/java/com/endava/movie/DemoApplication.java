package com.endava.movie;
import static com.ofg.config.BasicProfiles.DEVELOPMENT;
import static com.ofg.config.BasicProfiles.PRODUCTION;
import static com.ofg.config.BasicProfiles.TEST;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.ofg.infrastructure.config.EnableMicroservice;
import com.ofg.infrastructure.environment.EnvironmentSetupVerifier;

@SpringBootApplication
@ComponentScan
//@EnableMicroservice
public class DemoApplication {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
//		
//		for(String arg : args){
//			LOGGER.debug(arg);
//		}
////		
//		SpringApplication application = new SpringApplication(DemoApplication.class);
//        application.addListeners(new EnvironmentSetupVerifier(Arrays.asList(DEVELOPMENT, PRODUCTION, TEST)));
//        application.run(args);
//		
		
		SpringApplication.run(DemoApplication.class, args);
	}
}

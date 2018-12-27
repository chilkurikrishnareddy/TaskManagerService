package com.cts.sba;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * This ProjectManagerServiceApplication class is used to run server.
 * 
 * @author PrasadPenchala
 * @version 1.0
 * @since
 *
 */
@SpringBootApplication
public class ProjectManagerServiceApplication {
	private static final Logger logger = LogManager.getLogger(ProjectManagerServiceApplication.class);

	public static void main(String[] args) {
	/*	logger.info("Enter into main method in ProjectManagerServiceApplication");*/
		SpringApplication.run(ProjectManagerServiceApplication.class, args);
		/*logger.info("Exit from main method in ProjectManagerServiceApplication");*/
	}

}

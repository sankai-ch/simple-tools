package com.sankai.st;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
public class SimpleToolsApplication {

	private static final Logger log = LoggerFactory.getLogger(SimpleToolsApplication.class);

	public static void main(String[] args) throws UnknownHostException {
		SpringApplication springApplication = new SpringApplication(SimpleToolsApplication.class);
		ConfigurableEnvironment environment = springApplication.run(args).getEnvironment();

		log.info("\n----------------------------------------------------------\n\t"
						+ "Application'{}' is running! Access URLs:\n\t"
						+ "Local:\t\thttp://localhost:{}\n\t"
						+ "External: \thttp://{}:{}\n\t----------------------------------------------------------",
				environment.getProperty("spring.application.name"),
				environment.getProperty("server.port"),
				InetAddress.getLocalHost().getHostAddress(),
				environment.getProperty("server.port"));

	}

}

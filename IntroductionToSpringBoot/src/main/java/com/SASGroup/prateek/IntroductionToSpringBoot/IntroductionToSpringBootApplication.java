package com.SASGroup.prateek.IntroductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Main application class for the Spring Boot application
@SpringBootApplication
public class IntroductionToSpringBootApplication implements CommandLineRunner {

	// Automatically injects the Apple bean into apple1
	@Autowired
	Apple apple1;

	// Automatically injects the Apple bean into apple2
	@Autowired
	Apple apple2;

	// Main method to launch the Spring Boot application
	public static void main(String[] args) {
		SpringApplication.run(IntroductionToSpringBootApplication.class, args);
	}

	// This method is executed after the application starts.
	@Override
	public void run(String... args) throws Exception {
		// Calls the method to eat the apple for both beans
		apple1.eatApple();
		apple2.eatApple();

		// Prints the hash code of both beans to verify their scope
		// If @Scope("singleton") is used, both hash codes will be identical (same instance).
		// If @Scope("prototype") is used, the hash codes will differ (new instance each time).
		System.out.println(apple1.hashCode());
		System.out.println(apple2.hashCode());
	}
}

package com.SASGroup.prateek.IntroductionToSpringBoot;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

// A class representing an Apple. It contains methods to demonstrate bean lifecycle events.
// Uncomment @Component if you want Spring to manage this class automatically without AppConfig.
// @Component
public class Apple {

    // A method to simulate eating an apple
    void eatApple() {
        System.out.println("I am eating the apple");
    }

    // This method will be executed immediately after the bean is created and dependencies are injected.
    @PostConstruct
    void callThisBeforeAppleIsUsed() {
        System.out.println("Creating the apple before used");
    }

    // This method will be executed just before the bean is destroyed (only applies to singleton-scoped beans).
    @PreDestroy
    void callThisBeforeDestroy() {
        System.out.println("Destroying the Apple bean");
    }
}

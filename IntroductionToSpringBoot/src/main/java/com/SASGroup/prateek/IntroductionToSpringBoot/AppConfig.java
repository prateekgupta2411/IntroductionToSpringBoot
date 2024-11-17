package com.SASGroup.prateek.IntroductionToSpringBoot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

// This class is a configuration class for defining Spring beans
@Configuration
public class AppConfig {

    // Defines a bean for the Apple class
    @Bean
    // Uncommenting @Scope("singleton") would create a single shared instance of the Apple bean
    // @Scope("singleton")

    // The current configuration uses @Scope("prototype"), meaning a new instance of Apple
    // will be created each time the bean is requested.
    @Scope("prototype")
    Apple getApple() {
        return new Apple();
    }
}

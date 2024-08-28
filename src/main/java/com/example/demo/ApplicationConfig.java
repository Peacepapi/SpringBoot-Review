package com.example.demo;

/*
Splitting the configuration
 */


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/*
    Spring will scan @Configuration on startup
 */
@Configuration
public class ApplicationConfig {

    /*
     Can use @Bean("newName") then use newName when getting bean
     */
    @Bean
    @Qualifier("Bean1")
    public FirstClass firstClass() {
        return new FirstClass("Yooooo");
    }

    @Bean
    /*
        @Profile("dev") makes the bean available on dev profile (environment) / Can be used on class level also
        @Qualifier can be used to specify which bean to use when there's multiple bean of the same type.
        Specify it in the class referencing it also
     */
    @Qualifier("Bean2")
    public FirstClass secondClass() {
        return new FirstClass("Y2222");
    }

    @Bean
    /*
        @Primary would take priority when this type is referenced
     */
    @Primary
    public FirstClass thirdClass() {
        return new FirstClass("Y3333");
    }
}

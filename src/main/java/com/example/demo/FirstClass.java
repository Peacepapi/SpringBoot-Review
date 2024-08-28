package com.example.demo;

import org.springframework.stereotype.Component;


/*
 @Component
 This annotation allows class to be defined as bean.

 @Service
 @Repository

 these are a more specify component. They are an extension of component
 */

@Component
public class FirstClass {

    public String sayHello() {
        return "Hello from the FirstClass";
    }
}

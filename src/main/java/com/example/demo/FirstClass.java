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
    private String myVar;

    public FirstClass(String myVar) {
        this.myVar = myVar;
    }

    public String sayHello() {
        return "Hello from the FirstClass => myVar = " + myVar;
    }
}

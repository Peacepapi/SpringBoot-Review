package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class FirstService {

    private final FirstClass firstClass;
    /*
        Dependency injection
     */
    /*
        constructor injection ... not need autowired anymore
        Spring will look at the constructor look for an arguments listed to see if an injection of that dependency is needed
    */

    @Autowired
    /*
        Specify which bean to use
        private FirstService(@Qualifier("Bean2") FirstClass firstClass) {
     */
    private FirstService(FirstClass firstClass) {
        this.firstClass = firstClass;
    }

    public String tellAStory() {
        return "The dependency is saying : " + firstClass.sayHello();
    }
}

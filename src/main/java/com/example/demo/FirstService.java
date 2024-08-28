package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class FirstService {

    private final FirstClass firstClass;
    private Environment environment;

    @Autowired
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
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

    public String getJavaVersion() {
        return "The dependency is saying : " + environment.getProperty("java.version");
    }

    public String getOSName() {
        return "The dependency is saying : " + environment.getProperty("os.name");
    }

    public String getCustomProp() {
        return "The dependency is saying : " + environment.getProperty("my.custom.prop");
    }
}

package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:custom.properties")
/*
    If there's multiple prop sources use
    @PropertySources({
        @PropertySource("classpath:custom.properties"),
        @PropertySource("classpath:custom.properties")
    })
 */
public class FirstService {

    private final FirstClass firstClass;
    @Value("${new.prop}")
    private String customPropFromDiffFile;
    @Value("${my.custom.prop.int}")
    private Integer customInt;
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

    public String getCustomPropFromDiffFile() {
        return "The dependency is saying : " + customPropFromDiffFile;
    }

    public Integer getCustomInt() {
        return customInt;
    }


    //    private Environment environment;
//    @Autowired
//    public void setEnvironment(Environment environment) {
//        this.environment = environment;
//    }
//    public String getJavaVersion() {
//        return "The dependency is saying : " + environment.getProperty("java.version");
//    }
//
//    public String getOSName() {
//        return "The dependency is saying : " + environment.getProperty("os.name");
//    }
//
//    public String getCustomProp() {
//        return "The dependency is saying : " + environment.getProperty("my.custom.prop");
//    }
}

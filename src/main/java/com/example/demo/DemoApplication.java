package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	/*
	This bean annotation marks the class as a bean for it can be found in the bean factory
	@Bean
	public FirstClass firstClass() {
		return new FirstClass();
	}
	*/
	public static void main(String[] args) {
		var ctx = SpringApplication.run(DemoApplication.class, args);
		/*
			This isn't the recommended way of creating an instance because we're not using dependency injection here
				FirstClass firstClass = new FirstClass();
				System.out.println(firstClass.sayHello());
		 */

		//FirstClass firstClass = ctx.getBean(FirstClass.class);
		FirstService firstService = ctx.getBean(FirstService.class);
		/*
			Another example for getting a bean. Uses the name instead
			FirstClass firstClass = ctx.getBean("firstClass", FirstClass.class);
		 */
		//System.out.println(firstClass.sayHello());
		System.out.println(firstService.tellAStory());
//		System.out.println(firstService.getJavaVersion());
//		System.out.println(firstService.getOSName());
//		System.out.println(firstService.getCustomProp());
		System.out.println(firstService.getCustomPropFromDiffFile());
		System.out.println(firstService.getCustomInt());


	}

}

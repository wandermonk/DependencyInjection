package com.spring.concepts.dependencyinjection.setter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class DependencyInjectionBySetterApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(DependencyInjectionBySetterApplication.class, args);
		BinarySearch bean = applicationContext.getBean(BinarySearch.class);
		bean.binarySearch(new int[] { 1, 2, 3 }, 3);
	}
}

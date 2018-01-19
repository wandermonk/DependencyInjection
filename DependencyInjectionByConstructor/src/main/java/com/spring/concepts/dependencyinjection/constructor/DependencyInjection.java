package com.spring.concepts.dependencyinjection.constructor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjection {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(DependencyInjection.class, args);
		BinarySearch bean = applicationContext.getBean(BinarySearch.class);
		bean.binarySearch(new int[] { 1, 2, 3 }, 3);
	}
}

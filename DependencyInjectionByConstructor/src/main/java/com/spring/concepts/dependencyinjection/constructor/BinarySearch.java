package com.spring.concepts.dependencyinjection.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {
	
	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	public BinarySearch(SortAlgorithm sortAlgorithm){
		super();
		this.sortAlgorithm = sortAlgorithm;
	}
	
	public int binarySearch(int[] numbers,int numberToBeSearched){
		int index = 0;
		// Sort the input array
		// Search the number in the array
		// Get the index
		System.out.println("Executing Bubble Sort algorithm.");
		return index;
	}

}

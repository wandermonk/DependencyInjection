package com.spring.concepts.dependencyinjection.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {

	private SortAlgorithm sortAlgorithm;

	@Autowired
	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}

	public int binarySearch(int[] numbers, int numberToBeSearched) {
		int index = 0;
		// Sort the input array
		// Search the number in the array
		// Get the index
		System.out.println("Executing Bubble Sort algorithm.");
		return index;
	}

}

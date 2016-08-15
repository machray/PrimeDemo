package org.rortega.prime.impl;

import java.util.ArrayList;

public class Prime {
	ArrayList<Integer> primeArray = new ArrayList<Integer>();
	
	public Prime() {
		primeArray.add(2);
	}
	
	public int findNthPrime(int nth) {
		if (nth <= 0) {
			return 0;
		}
		while (primeArray.size() < nth) {
			addNextPrime();
		}
		return primeArray.get(nth - 1);
	}

	public void addNextPrime() {
		// start from the last known prime and add 1
		int value = primeArray.get(primeArray.size() - 1);
		checkIfPrime(value);
	}
	
	public void checkIfPrime(int value) {
		// increase value by 1
		value++;
		
		// check if the value has a remainder when divided by the given value
		for (int prime: primeArray) {
			// if the value fails the check then redo checkIfPrime
			if (value % prime == 0) {
				checkIfPrime(value);
				return;
			}
		}
		
		// value is a prime so add to the array
		primeArray.add(value);
	}
}

package org.rortega.prime.demo;

import org.rortega.prime.impl.Prime;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimeDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeDemoApplication.class, args);
		
		Prime prime = new Prime();
		
		for (int x = -2; prime.findNthPrime(x) < 1000; x++) {
			if (prime.findNthPrime(x) == 0) {
				System.out.println(x + " is an invalid value");
			}
			else {
			System.out.println((x) + "th prime is " + prime.findNthPrime(x));
			}
		}
	}
}

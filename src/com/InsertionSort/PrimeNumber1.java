package com.InsertionSort;

public class PrimeNumber1 {

	public static void main(String[] args) {
		int i;

	
		boolean isPrime = true;
		String primeNumbersFound = "";
		for (i = 2; i <= 1000; i++) {
			isPrime = CheckPrime(i);
			if (isPrime) {
				primeNumbersFound = primeNumbersFound + i + " ";
			}
		}
		System.out.println("Prime numbers from 1 to " + 1000 + " are:");
		System.out.println(primeNumbersFound);
	}

	public static boolean CheckPrime(int numberToCheck) {
		int remainder;
		for (int i = 2; i <= numberToCheck / 2; i++) {
			remainder = numberToCheck % i;
			if (remainder == 0) {
				return false;
			}
		}
		return true;
	}
}

package del26al50;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import del1al25.Sieve_of_Erastosthene;

/*
 * The prime 41, can be written as the sum of six consecutive primes:
	41 = 2 + 3 + 5 + 7 + 11 + 13
	This is the longest sum of consecutive primes that adds to a prime below one-hundred.
	The longest sum of consecutive primes below one-thousand that adds to a prime, contains 21 terms, and is equal to 953.
	Which prime, below one-million, can be written as the sum of the most consecutive primes?
 */

public class Problem50 {

	static int n = 1000000, sum = 0, max = 0, sumCount = 0, counter = 0, primeDiff = 0;
	static boolean[] isPrime = new boolean[n + 1];
	static Sieve_of_Erastosthene sieve = new Sieve_of_Erastosthene(n, isPrime);
	static ArrayList<Integer> primes = new ArrayList<>();
	static ArrayList<Integer> primeSum = new ArrayList<>();
	static Map<Integer, Integer> test = new LinkedHashMap<>();

	public static void main(String[] args) {

		final long startTime = System.currentTimeMillis();

		sieve.assume();
		sieve.sieve();
		primes.addAll(sieve.count());

		findPrimeSum();
		findMaxPrime();

		final long endTime = System.currentTimeMillis();

		System.out.println("The answer is: " + max);
		System.out.println("Total execution time: " + (endTime - startTime) );

	}

	public static void findPrimeSum() {
		for(int i = 0; i < primes.size(); i++) {
			sum += primes.get(i);
			if (sum >= 1000000) break;
			primeSum.add(sum);
		}
	}

	public static void findMaxPrime() {
		counter = primeSum.size() - 1;
		for(int i = 0; i < primeSum.size(); i++) {
			for(int j = counter; j > 0; j--) {
				primeDiff = primeSum.get(j) - primeSum.get(i);
				if(primeDiff > 1000000 || primeDiff <= 0) break;
				if(primes.contains(primeDiff) && primeDiff > max) {
					max = primeDiff;
				}
			}
		}
	}
	
	

}

//The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
//Find the sum of all the primes below two million.

package del1al25;

import java.util.ArrayList;

public class Problem10 {

	static boolean[] isPrime = new boolean[2000000];
	static Sieve_of_Erastosthene sieve = new Sieve_of_Erastosthene(1999999, isPrime);
	static long sum = 0L;

	//	public static boolean isPrime(int n) {
	//		if (n <= 1) {
	//			return false;
	//		}
	//		for (int i = 2; i < n; i++) {
	//			if (n % i == 0) {
	//				return false;
	//			}
	//		}
	//		return true;
	//	}

	public static void main(String[] args) {

		long begin = System.currentTimeMillis();

		sieve.assume();
		sieve.sieve();
		ArrayList<Integer> primes = new ArrayList<>(sieve.count());

		for(int i = 0; i < primes.size(); i++) {
			sum += primes.get(i);
		}

		long end = System.currentTimeMillis();

		System.out.println("The sum is: " + sum);
		System.out.println("The program took " + (end - begin) + "ms to run!");

	}
}
